/**
 * 
 */
package indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.menu;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Message;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;


import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.lifesense.ble.DeviceConnectState;
import com.lifesense.ble.LsBleManager;
import com.lifesense.ble.ReceiveDataCallback;
import com.lifesense.ble.bean.BloodPressureData;
import com.lifesense.ble.bean.DeviceTypeConstants;
import com.lifesense.ble.bean.HeightData;
import com.lifesense.ble.bean.HourSystem;
import com.lifesense.ble.bean.KitchenScaleData;
import com.lifesense.ble.bean.LengthUnit;
import com.lifesense.ble.bean.LsDeviceInfo;
import com.lifesense.ble.bean.PedometerAlarmClock;
import com.lifesense.ble.bean.PedometerData;
import com.lifesense.ble.bean.PedometerUserInfo;
import com.lifesense.ble.bean.SexType;
import com.lifesense.ble.bean.UnitType;
import com.lifesense.ble.bean.WeightAppendData;
import com.lifesense.ble.bean.WeightData_A2;
import com.lifesense.ble.bean.WeightData_A3;
import com.lifesense.ble.bean.WeightUserInfo;

import indg.com.cover2protect.DB.DBHelper2;
import indg.com.cover2protect.baseAeglOrbs.Base2FragmentDialouge;
import indg.com.cover2protect.baseAeglOrbs.W3Obj;
import indg.com.cover2protect.util.SharedPrefUtils;
import indg.com.cover2protect.views.activity.deviceConnection.Adapter.RViewAdapterBMIHistory;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.FragDialougeWeightScaleData;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.ActWeightScale;
import indg.com.cover2protect.R;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.ScreenFragmentMessage;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.tools.AsyncTaskRunner;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.tools.SettingInfoManager;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.view.paireddevice.PairedDeviceArrayAdapter;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ble.ui.view.paireddevice.PairedDeviceListItem;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.AlarmClockInfo;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.BleDeviceUserInfo;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.DistanceUnitType;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.GenderType;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.HourFormatType;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.PairedDeviceInfo;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.SettingInfo;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.WeekStartType;
import indg.com.cover2protect.views.activity.deviceConnection.bmiScale.lifesense.ui.bean.WeightUnitType;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author CaiChiXiang
 *
 */
@SuppressLint({ "RtlHardcoded", "DefaultLocale" })
public class PairedDeviceListFragment extends
		Base2FragmentDialouge {

	public static List<BloodPressureData> bpDataList;
	public static List<WeightData_A3> wDataList_A3;
	public static List<PedometerData> pDataList;
	public static List<HeightData> hDataList;
	public static List<WeightData_A2> wDataList_A2;
	
	public static Map<String,Integer> deviceUserNumberMap;
	private  boolean hasMeasureData;

	private final int CELL_DEFAULT_HEIGHT = 200;
	private View rootView;
	private ListView mListView;
	private LsBleManager mLsBleManager;
	private List<PairedDeviceListItem> mDeviceListItems;
	private Context mAppContext;
	private List<LsDeviceInfo> myDeviceList;
	private PairedDeviceArrayAdapter deviceAdapter;
	private PairedDeviceListItem currentSelectItem;
	private Switch autoSyncDataSwitch;
	
	private TextView emptyTextView,showInfoTextView;
	private SettingInfo mSettingInfo;
	private View showDeviceDetailsView;

	private Button deviceInfoButton;
	private Button measuredDataButton;
	private Button backButton;

	private boolean isDisplay;
//	private TextView showConnectMsgTextView;

	String heightStr = "0", ageStr ="0";
	Boolean sexUser;




	private ReceiveDataCallback mReceiveDataCallback=new ReceiveDataCallback()
	{
		/*
		@Override
		public void onDeviceConnectStateChange(
				DeviceConnectState connectState, String broadcastId) 
		{
			updateDeviceConnectState(connectState,broadcastId);
		}
		*/
		@Override
		public void onReceiveWeightDta_A2(WeightData_A2 wData_A2)
		{
			if(wData_A2!=null)
			{
				hasMeasureData=true;
				System.out.println("???????????????????????????==========="+wData_A2.toString());
				if(wData_A2.getResistance_2()>0)
				{



					System.err.println("Calculate the fat data......");
					//??????????????????????????????????????????????????????????????????????????????
					SexType userGender= SexType.MALE;
					double weight_kg=65.5;
					double height_m=1.85;
					int userAge=35;
					double impedance=wData_A2.getResistance_2();
					boolean isAthlete=true;
					WeightAppendData appendData=mLsBleManager.parseAdiposeData(userGender, weight_kg, height_m, userAge, impedance, isAthlete);
					wData_A2.setBasalMetabolism((float) appendData.getBasalMetabolism());
					wData_A2.setBodyFatRatio((float)appendData.getBodyFatRatio());
					wData_A2.setBodyWaterRatio((float) appendData.getBodyWaterRatio());
					wData_A2.setBoneDensity((float) appendData.getBoneDensity());
					wData_A2.setMuscleMassRatio((float) appendData.getMuscleMassRatio());					

				}
				wDataList_A2.add(wData_A2);
				updateMeasureRecord(wData_A2.getBroadcastId(),wDataList_A2.size());
				if(isDisplay)
				{

					showMeasuredDataDetails(wData_A2, true);
				}

			}
		}

		@Override
		public void onReceiveWeightData_A3(WeightData_A3 wData)
		{
			if(wData!=null)
			{
				System.out.println("?????????A3?????????????????????==========="+wData.toString());
				hasMeasureData=true;
				wDataList_A3.add(wData);
				updateMeasureRecord(wData.getBroadcastId(), wDataList_A3.size());
				if(isDisplay)
				{
					showMeasuredDataDetails(wData, true);
				}
			}
		}

		@Override
		public void onReceiveBloodPressureData(BloodPressureData bpData)
		{
			if(bpData!=null)
			{
				hasMeasureData=true;
				bpDataList.add(bpData);
				updateMeasureRecord(bpData.getBroadcastId(), bpDataList.size());
				if(isDisplay)
				{
					showMeasuredDataDetails(bpData, true);
				}
			}
		}

		@Override
		public void onReceivePedometerData(final PedometerData pData)
		{
			if(pData!=null)
			{
				hasMeasureData=true;
				System.err.println("receive pedometer data:"+pData.toString());
				pDataList.add(pData);
				updateMeasureRecord(pData.getBroadcastId(),pDataList.size());
				if(isDisplay)
				{
					showMeasuredDataDetails(pData, true);
				}

			}
		}

		@Override
		public void onReceiveHeightData(HeightData hData)
		{
			if(hData!=null)
			{
				hasMeasureData=true;
				System.err.println("receive height data:"+hData.toString());
				hDataList.add(hData);

				updateMeasureRecord(hData.getBroadcastId(),hDataList.size());
				if(isDisplay)
				{
					showMeasuredDataDetails(hData, true);
				}
			}
		}

		@Override
		public void onReceiveUserInfo(WeightUserInfo proUserInfo)
		{
			Log.e("WeightUserInfo", "product user info is :"+proUserInfo.toString());
		}

		
		@Override
		public void onReceiveKitchenScaleData(KitchenScaleData kiScaleData) {
			// TODO Auto-generated method stub
			super.onReceiveKitchenScaleData(kiScaleData);
		}

		
		//update and save device info ,if current connected device is generic fat and kitchen scale
		@Override
		public void onReceiveDeviceInfo(LsDeviceInfo device)
		{
			System.err.println("the current connected device info is:"+device.toString());
			AsyncTaskRunner runner = new AsyncTaskRunner(mAppContext,device);
			runner.execute();
		}
		
		
	};


	RecyclerView rvHistory;
	RViewAdapterBMIHistory rViewAdapterBMIHistory;
	ArrayList<W3Obj> listBMI = new ArrayList<>();

	DBHelper2 sqliteDBHelper2 ;
	TextView tvTitleKg, tvBmi;


	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState){

		rootView=inflater.inflate(R.layout.fragment_paired_device_list, container, false);
		sqliteDBHelper2 =  new DBHelper2(getActivity().getApplicationContext());
		autoSyncDataSwitch=(Switch) rootView.findViewById(R.id.auto_sync_data_switch);
		mListView = (ListView)rootView.findViewById(R.id.paired_device_list_view);
		emptyTextView=(TextView) rootView.findViewById(android.R.id.empty);
		showDeviceDetailsView=rootView.findViewById(R.id.show_device_details_info_view);
		showInfoTextView=(TextView) rootView.findViewById(R.id.show_info_text_view);

		deviceInfoButton=(Button) showDeviceDetailsView.findViewById(R.id.device_info_button);
		measuredDataButton=(Button) showDeviceDetailsView.findViewById(R.id.meaured_data_button);
		backButton=(Button) showDeviceDetailsView.findViewById(R.id.back_button);

		tvTitleKg =rootView.findViewById(R.id.tv_ap_bp_history_bpm_averag);
		tvTitleKg.setText("KG");
		tvBmi =rootView.findViewById(R.id.tv_ap_bp_history_low_hig);
		tvBmi.setText("BMI");
//		showConnectMsgTextView=(TextView) rootView.findViewById(R.id.show_ble_connect_msg_text_view);
		setHasOptionsMenu(true);


		rvHistory =  rootView.findViewById(R.id.rv_bmi_history);
		//rViewAdapterBMIHistory = new RViewAdapterBMIHistory(listBMI,mAppContext,bmiHistoricInterface);
		rvHistory.setLayoutManager(new GridLayoutManager(getActivity(), 1));
		rvHistory.setAdapter(rViewAdapterBMIHistory);



		return rootView;
	}

	W3Obj w3;




	private void mGetBMIHistory(String heightStr, String ageStr, Boolean sexUser) {

		listBMI.clear();

		Cursor cursor = sqliteDBHelper2.getAllBMIData();

		if(cursor.getCount() == 0){


		w3 = new W3Obj("64",mCalcBMI("64.0", heightStr),"15.2"  ,"48.7",
				"3.0","63.4","2.9", mCalcBMR("64", heightStr, sexUser, ageStr), "",
				"","sample Reading","7");

		listBMI.add(w3);

		w3 = new W3Obj("63",mCalcBMI("63.3", heightStr),"14.2"  ,"48.7",
				"3.0","62.4","2.9", mCalcBMR("63", heightStr, sexUser, ageStr), "",
				"","sample Reading","7");

		listBMI.add(w3);

		w3 = new W3Obj("65",mCalcBMI("65.66", heightStr),"16.2"  ,"48.7",
				"5.0","64.4","2.9", mCalcBMR("65", heightStr, sexUser, ageStr), "",
				"","sample Reading","7");

		listBMI.add(w3);

		}else {


			try {
				while (cursor.moveToNext()) {


					if (cursor.isLast()) {

						w3 = new W3Obj(cursor.getString(1) + "",
								mCalcBMI(cursor.getString(1), heightStr),
								cursor.getString(3) + "",
								cursor.getString(4) + "",
								cursor.getString(5) + "",
								cursor.getString(6) + "",
								cursor.getString(7) + "",
								mCalcBMR(cursor.getString(1), heightStr, sexUser, ageStr),
								cursor.getString(9) + "",
								cursor.getString(10) + "",
								cursor.getString(11) + "",
								cursor.getString(12) + "");

						if (cursor.getString(1).trim().length() != 0) {
							listBMI.add(w3);
						}

					}

				}
			} finally {
				cursor.close();
			}

		}

		rViewAdapterBMIHistory.notifyDataSetChanged();

		if (listBMI.size()>0){
			rViewAdapterBMIHistory.notifyDataSetChanged();
		}


	}

	private String mCalcBMI(String weight, String height_meters) {

		double bmi = 0;
		double weightValue = 0,heightCm = 0;
		try {
			weightValue = Double.parseDouble((weight));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		try {
			heightCm = Double.parseDouble(height_meters);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Double heightM = heightCm / 100;

		bmi = weightValue / (heightM*2);

		DecimalFormat df = new DecimalFormat("#.##");

		return ""+df.format(bmi);
	}

	private String mCalcBMR(String weight, String height_meters, Boolean sex, String age) {


		if(!sex) {

		/* Men: (88.3 + (13.4 x weight*) + (4.8 x height*) - (5.7 x age in years))*/

			double bmr = 0;
			double weightValue = 0, heightCm = 0, ageVal = 0;
			try {
				weightValue = Double.parseDouble((weight));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			try {
				heightCm = Double.parseDouble(height_meters);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			Double	heightM = heightCm / 100; // to M

			try {
				ageVal = Double.parseDouble(age);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			bmr = ((weightValue * 13.4) + 88.3 / (heightM * 4.8)) - (5.7 * ageVal);

			DecimalFormat df = new DecimalFormat("#");

			return ""+df.format(bmr);

		}else {

			//BMR Women: = (447.6 + (9.2 x weight*) + (3.1 x height*) - (4.3 x age in years))

			double bmr = 0;
			double weightValue = 0, heightCm = 0, ageVal = 0;
			try {
				weightValue = Double.parseDouble((weight));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			try {
				heightCm = Double.parseDouble(height_meters);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			Double	heightM = heightCm / 100; // to M

			try {
				ageVal = Double.parseDouble(age);
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}

			bmr = ((weightValue * 9.2) + 447.6 / (heightM * 3.1)) - (4.3 * ageVal);

			DecimalFormat df = new DecimalFormat("#");

			return ""+df.format(bmr);

		}

	}

	private void mGetBMIDash() {

		Cursor cursor = sqliteDBHelper2.getAllBMIData();

		try {
			while (cursor.moveToNext()) {

				w3 = new W3Obj(cursor.getString(1)+"",
						mCalcBMI(cursor.getString(1),heightStr)+"",
						cursor.getString(3)+"",
						cursor.getString(4)+"",
						cursor.getString(5)+"",
						cursor.getString(6)+"",
						cursor.getString(7)+"",
						mCalcBMR(cursor.getString(1),heightStr,sexUser,ageStr),
						cursor.getString(9)+"",
						cursor.getString(10)+"",
						cursor.getString(11)+"",
						cursor.getString(12)+"");
				if(cursor.getString(1).trim().length()!= 0){
					listBMI.add(w3);
				}

			}
		} finally {
			cursor.close();

			if(listBMI.size() > 0){

				Bundle args = new Bundle();
				args.putSerializable("weightData", listBMI.get(0));
				FragmentManager fm = getFragmentManager();
				FragDialougeWeightScaleData dialogFragment = new FragDialougeWeightScaleData ();
				dialogFragment.setArguments(args);
				dialogFragment.show(fm, "FragmentWeightData");

			}else{
				showToast("Hmm... that should not have happened...");
			}

		}


	}

	/**
	 * @param msg
	 */
	protected void showConnectMsg(final String msg) 
	{
		getActivity().runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				
//				showConnectMsgTextView.append("msg >> "+msg+"\n");
			}
		});
		
		
	}


	// Container Activity must implement this interface

	BmiHistoricInterface bmiHistoricInterface;

	public  interface BmiHistoricInterface {

	void onHistoricItemClicked(W3Obj w3Obj);

	}





	@Override
	public void onAttach(Activity activity) {
		super.onAttach(activity);

		// This makes sure that the container activity has implemented
		// the callback interface. If not, it throws an exception
		try {
			bmiHistoricInterface = (BmiHistoricInterface ) activity;
		} catch (ClassCastException e) {
			throw new ClassCastException(activity.toString()
					+ " must implement MyInterface ");
		}
	}



	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		mAppContext=getActivity().getApplicationContext();

		mLsBleManager= LsBleManager.newInstance();

		deviceUserNumberMap=new HashMap<String, Integer>();
		bpDataList=new ArrayList<BloodPressureData>();
		wDataList_A3=new ArrayList<WeightData_A3>();
		wDataList_A2=new ArrayList<WeightData_A2>();
		pDataList=new ArrayList<PedometerData>();
		hDataList=new ArrayList<HeightData>();

		mDeviceListItems = new ArrayList<PairedDeviceListItem>();
		myDeviceList=getPairedDeviceInfo();
		if(myDeviceList!=null && myDeviceList.size()>0)
		{
			for(LsDeviceInfo device:myDeviceList)
			{

				PairedDeviceListItem deviceItem=new PairedDeviceListItem(device, CELL_DEFAULT_HEIGHT, 0);
				mDeviceListItems.add(deviceItem);
			}
		}

		deviceAdapter = new PairedDeviceArrayAdapter(getActivity(), R.layout.device_list_view_item, mDeviceListItems);


		super.onCreate(savedInstanceState);
	}



	@Override
	public void onStart(){
		super.onStart();

//		showConnectMsgTextView.setMovementMethod(new ScrollingMovementMethod());
		
		mAppContext=getActivity().getApplicationContext();

		mSettingInfo=SettingInfoManager.getSettingInfo(getActivity().getApplicationContext(), SettingInfo.class.getName());
		hasMeasureData=false;

		if(mDeviceListItems.size()>0)
		{
			mListView.setVisibility(View.VISIBLE);
			emptyTextView.setVisibility(View.GONE);
		}

		mListView.setAdapter(deviceAdapter);
		mListView.setDivider(null);

		isDisplay=false;

		mListView.setOnItemClickListener(new OnItemClickListener() 
		{

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) 
			{
				final PairedDeviceListItem tempItem=(PairedDeviceListItem) parent.getAdapter().getItem(position);
				getActivity().runOnUiThread(new Runnable() {

					@Override
					public void run() {
						
						mListView.setVisibility(View.GONE);
						showDeviceDetailsView.setVisibility(View.VISIBLE);
						showInfoTextView.setMovementMethod(new ScrollingMovementMethod());
						deviceInfoButton.requestFocus();
						isDisplay=false;
						showInfoTextView.setText("");
						showInfoTextView.setGravity(Gravity.LEFT);
						showDeviceInfo(tempItem.getDeviceInfo());
						initShowDeviceDetailsView(tempItem);	
//						mLsBleManager.stopDataReceiveService();
//						LsDeviceInfo lsDevice =  (LsDeviceInfo) tempItem.getDeviceInfo();
//						Intent myIntent = new Intent(getActivity(),ShowMeasureDataActivity.class);	
//						myIntent.putExtra("pairedDeviceInfo", lsDevice);
//						startActivity(myIntent);
//						// //???????????????????????????????????????????????????,???????????????
//						getActivity().overridePendingTransition(R.anim.dync_in_from_right,
//								R.anim.dync_out_to_left);
						
					
					}
				});

			}

		});
		mListView.setOnItemLongClickListener(new OnItemLongClickListener() 
		{

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					int position, long id) 
			{
				final PairedDeviceListItem tempItem=(PairedDeviceListItem) parent.getAdapter().getItem(position);
				String delBroadcastId=tempItem.getDeviceInfo().getBroadcastID();
				String title=tempItem.getDeviceInfo().getDeviceName()+tempItem.getDeviceInfo().getBroadcastID();
				String msg=getResources().getString(R.string.message_delete_prompt);

				showPromptDialog(title, msg,delBroadcastId,tempItem);

				return true;
			}

		});
		// set the switch to ON
		autoSyncDataSwitch.setChecked(false);
		// attach a listener to check for changes in state
		autoSyncDataSwitch.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			@Override
			public void onCheckedChanged(CompoundButton buttonView,boolean isChecked) 
			{

				if (isChecked) 
				{
					mLsBleManager.startDataReceiveService(mReceiveDataCallback);
					Toast.makeText(getActivity(), "start auto sync measuring data", Toast.LENGTH_SHORT).show();
				} 
				else 
				{
					mLsBleManager.stopDataReceiveService();
					Toast.makeText(getActivity(), "stop auto sync measuring data", Toast.LENGTH_SHORT).show();
				}
			}
		});

//		//get current network connect status
//		NetworkStatusChangeReceiver netStatusChangeReceiver=new NetworkStatusChangeReceiver(mAppContext, onNetworkStatusChangeListener);
//		netStatusChangeReceiver.isNetworkConnected();


		heightStr = spGetter().getString(SharedPrefUtils.USER_HEIGHT, "");
		ageStr = spGetter().getString(SharedPrefUtils.USER_AGE, "");
		sexUser = spGetter().getBoolean(SharedPrefUtils.USER_SEX,false);

		mGetBMIHistory(heightStr,ageStr,sexUser);

	}



	@Override
	public void onResume() 
	{
		super.onResume();

		//get the paired device info from file
		myDeviceList=getPairedDeviceInfo();

		if(myDeviceList!=null && myDeviceList.size()>0)
		{
			for(LsDeviceInfo device:myDeviceList)
			{
				
				mLsBleManager.addMeasureDevice(device);


				if(DeviceTypeConstants.FAT_SCALE.equals(device.getDeviceType())
						|| DeviceTypeConstants.WEIGHT_SCALE.equals(device.getDeviceType())){
					autoSyncDataSwitch.setChecked(true);
					setWeightUserInfoOnSyncDataMode(device.getDeviceId(),device.getDeviceUserNumber());
				}
			}
		
		}

	}

	@Override
	public void onStop() {
		super.onStop();
		mLsBleManager.stopDataReceiveService();
		hasMeasureData=false;
	}



	@Override
	public void onCreateOptionsMenu(Menu menu, MenuInflater inflater)
	{
		inflater.inflate(R.menu.menu_fragment_paired_device_list, menu);
		super.onCreateOptionsMenu(menu, inflater);
	}


	@Override
	public boolean onOptionsItemSelected(MenuItem item) 
	{

		switch (item.getItemId()) 
		{
		case android.R.id.home:
		{
			// Navigate "up" the demo structure to the launchpad activity.
			return true;
		}
		case R.id.action_add_device_item:
		{
			ActWeightScale actWeightScale =(ActWeightScale) getActivity();
			actWeightScale.getScreenFragmentHandler();
			Message msg = actWeightScale.getScreenFragmentHandler().obtainMessage();
			msg.arg1=ScreenFragmentMessage.MSG_ADD_DEVICE;
			actWeightScale.getScreenFragmentHandler().sendMessage(msg);
			return true;
		}
		}

		return super.onOptionsItemSelected(item);

	}

	private void initShowDeviceDetailsView(final PairedDeviceListItem listItem)
	{
		if(showDeviceDetailsView.getVisibility()==View.VISIBLE)
		{
			
			deviceInfoButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) 
				{
					isDisplay=false;
					showInfoTextView.setText("");
					showInfoTextView.setGravity(Gravity.LEFT);
					showDeviceInfo(listItem.getDeviceInfo());

				}
			});

			measuredDataButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {



					if(!hasMeasureData)
					{
						showInfoTextView.setText("");
						showInfoTextView.setText(R.string.message_no_measured_data);				
						showInfoTextView.setGravity(Gravity.CENTER);

					}
					else
					{
						showInfoTextView.setText("");
						showInfoTextView.setGravity(Gravity.LEFT);
						isDisplay=true;
						showMeasuredData(listItem.getDeviceInfo().getDeviceType(),listItem.getDeviceInfo().getProtocolType());

						mDialogWeight(wDataList_A3);

					}

				}
			});

			backButton.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) 
				{
					isDisplay=false;
					showDeviceDetailsView.setVisibility(View.GONE);
					mListView.setVisibility(View.VISIBLE);

				}
			});
		}



	}



	private void showPromptDialog(String title, String message) 
	{
		ContextThemeWrapper ctw = new ContextThemeWrapper(this.getActivity(), android.R.style.Theme_Holo_Light);
		AlertDialog.Builder promptDialog= new AlertDialog.Builder(ctw)
		.setTitle(title)
		.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				
			}

		})
		.setMessage(message);
		promptDialog.create().show();
	}

	

	private void showPromptDialog(String title, String message,final String delBroadcastId,final PairedDeviceListItem delItem) 
	{
		ContextThemeWrapper ctw = new ContextThemeWrapper(this.getActivity(), android.R.style.Theme_Holo_Light);
		AlertDialog.Builder promptDialog= new AlertDialog.Builder(ctw)
		.setTitle(title)
		.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which)
			{
				getActivity().runOnUiThread(new Runnable() {

					@Override
					public void run() 
					{
						boolean delete=SettingInfoManager.deletePairedDeviceInfo(mAppContext, delBroadcastId);
						if(delete)
						{
							//update the ble measured device list
							mLsBleManager.deleteMeasureDevice(delBroadcastId);
							mDeviceListItems.remove(delItem);
							deviceAdapter.notifyDataSetChanged();
							Toast.makeText(getActivity(), "Deleted successfully"+delBroadcastId, Toast.LENGTH_SHORT).show();
							if(mDeviceListItems.size()==0)
							{
								mListView.setVisibility(View.GONE);
								emptyTextView.setVisibility(View.VISIBLE);
							}

						}
					}
				});
			}

		})
		.setNegativeButton("Cancel", new  DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {


			}
		})
		.setMessage(message);
		promptDialog.create().show();
	}

	/**
	 * @param deviceId
	 */
	private void setWeightUserInfoOnSyncDataMode(String deviceId,int userNumber) 
	{
		if(mSettingInfo!=null && mSettingInfo.getDeviceUserInfo()!=null)
		{
			BleDeviceUserInfo userInfo=mSettingInfo.getDeviceUserInfo();
		
			WeightUserInfo weightUserInfo=new WeightUserInfo();
			weightUserInfo.setAge(userInfo.getUserAge());
			weightUserInfo.setProductUserNumber(userNumber);
			weightUserInfo.setHeight(userInfo.getUserHeight());

			weightUserInfo.setAthleteActivityLevel(userInfo.getAthleteLevel());	
			weightUserInfo.setGoalWeight(userInfo.getWeightTarget());

			if(userInfo.getWeightUnit()==WeightUnitType.KG)
			{
				weightUserInfo.setUnit(UnitType.UNIT_KG);
			}
			else weightUserInfo.setUnit(UnitType.UNIT_LB);
			

			if(userInfo.getUserGender()==GenderType.FEMALE)
			{
				weightUserInfo.setSex(SexType.FEMALE);
			}
			else 	weightUserInfo.setSex(SexType.MALE);

			if(userInfo.getAthleteLevel()==0)
			{
				weightUserInfo.setAthlete(false);
			}
			else weightUserInfo.setAthlete(true);
			
			weightUserInfo.setDeviceId(deviceId);//13191 device ID
			
			System.err.println("????????????????????????????????????????????????"+weightUserInfo.toString());
			mLsBleManager.setProductUserInfo(weightUserInfo); 
		}

	}

	/**
	 * @param deviceId
	 */
	private void setPedometerAlarmClockOnSyncDataMode(String deviceId) 
	{
		if(mSettingInfo!=null && mSettingInfo.getAlarmClockInfo()!=null)
		{

			AlarmClockInfo	alarmClockInfo=mSettingInfo.getAlarmClockInfo();

			PedometerAlarmClock peAlarmClock=new PedometerAlarmClock();
			peAlarmClock.setSwitch1(1);
			peAlarmClock.setDay1(alarmClockInfo.getAlarmDays());
			peAlarmClock.setHour1(alarmClockInfo.getAlarmHour());
			peAlarmClock.setMinute1(alarmClockInfo.getAlarmMinute());

			//set the alarm clock to the pedometer with deviceid
			peAlarmClock.setDeviceId(deviceId);

			mLsBleManager.setPedometerAlarmClock(peAlarmClock);
		}


	}

	/**
	 * ????????????????????????????????????????????????
	 * @param deviceId
	 */
	private void setPedometerUserInfoOnSyncDataMode(String deviceId)
	{
		if(mSettingInfo!=null && mSettingInfo.getDeviceUserInfo()!=null)
		{
			BleDeviceUserInfo userInfo=mSettingInfo.getDeviceUserInfo();

			PedometerUserInfo pedometerUserInfo=new PedometerUserInfo();
			pedometerUserInfo.setProductUserNumber((byte)1);
			
			pedometerUserInfo.setWeight(userInfo.getUserWeight());
			pedometerUserInfo.setHeight(userInfo.getUserHeight());
	
			pedometerUserInfo.setAge(userInfo.getUserAge());

			if(userInfo.getAthleteLevel()==0)
			{
				pedometerUserInfo.setAthlete(false);
			}
			else pedometerUserInfo.setAthlete(true);
			
			pedometerUserInfo.setAthleteActivityLevel(userInfo.getAthleteLevel());
			
			if(userInfo.getUserGender()==GenderType.FEMALE)
			{
				pedometerUserInfo.setUserGender(SexType.FEMALE);
			}
			else pedometerUserInfo.setUserGender(SexType.MALE);
			
			
			if(userInfo.getWeekStart()==WeekStartType.MONDAY)
			{
				pedometerUserInfo.setWeekStart(1); //1 for Sunday,2 for Monday
			}
			else 	pedometerUserInfo.setWeekStart(2); //1 for Sunday,2 for Monday
		

			pedometerUserInfo.setWeekTargetSteps(userInfo.getMovingTarget());
			
			if(userInfo.getHourFormat()==HourFormatType.HOUR_12)
			{
				pedometerUserInfo.setHourSystem(HourSystem.HOUR_12);
			}
			else
			{
				pedometerUserInfo.setHourSystem(HourSystem.HOUR_24);
			}
			
			if(userInfo.getDistanceUnit()==DistanceUnitType.KILOMETER)
			{
				pedometerUserInfo.setLengthUnit(LengthUnit.KILOMETER);
			}
			else
			{
				pedometerUserInfo.setLengthUnit(LengthUnit.MILE);
			}
			
			pedometerUserInfo.setDeviceId(deviceId);//get the device id from paired result

			System.err.println("?????????????????????????????????????????????"+pedometerUserInfo.toString());
			mLsBleManager.setPedometerUserInfo(pedometerUserInfo);
			
		}
	}

	/**
	 * @param connectState
	 * @param broadcastId
	 */
	private void updateDeviceConnectState(final DeviceConnectState connectState,
			final String broadcastId) 
	{
		if(getActivity()==null)
		{
			return ;
			
		}
		getActivity().runOnUiThread(new Runnable() {

			@Override
			public void run() {

				if (!mDeviceListItems.isEmpty())
				{
					for (PairedDeviceListItem item : mDeviceListItems) 
					{
						LsDeviceInfo dev=item.getDeviceInfo();
						if (dev != null && dev.getBroadcastID().equals(broadcastId)) 
						{
							currentSelectItem=item;
							currentSelectItem.setConnectState(connectState);
							deviceAdapter.notifyDataSetChanged();

							if (!currentSelectItem.isExpanded()) 
							{
								final View view = mListView.getChildAt(deviceAdapter.getPosition(item));
								TextView connectStateTextView = (TextView) view.findViewById(R.id.connect_status_text_view);
								connectStateTextView.setText(connectState.toString().toLowerCase());
								if(connectState== DeviceConnectState.CONNECTED_FAILED)
								{
									connectStateTextView.setTextColor(Color.GRAY);
								}
								if(connectState== DeviceConnectState.DISCONNECTED)
								{
									connectStateTextView.setTextColor(Color.RED);
								}
								if(connectState== DeviceConnectState.CONNECTED_SUCCESS)
								{
									connectStateTextView.setTextColor(Color.parseColor("#006400"));
								}

							} 	
						}
					}
				}
			}
		});
	}


	private void updateMeasureRecord(final String broadcastId,final int recordsCount) 
	{
		getActivity().runOnUiThread(new Runnable() {

			@Override
			public void run() {
				if (!mDeviceListItems.isEmpty())
				{
					for (PairedDeviceListItem item : mDeviceListItems) 
					{
						LsDeviceInfo dev=item.getDeviceInfo();
						if (dev != null && dev.getBroadcastID().equals(broadcastId)) 
						{
							currentSelectItem=item;
							currentSelectItem.setRecordCount(recordsCount);
							deviceAdapter.notifyDataSetChanged();

							if (!currentSelectItem.isExpanded()) 
							{
								final View view = mListView.getChildAt(deviceAdapter.getPosition(item));
								TextView recordTextView = (TextView) view.findViewById(R.id.record_number_text_view);
								recordTextView.setTextColor(Color.RED);
								Animation anim = new AlphaAnimation(0.0f, 1.0f);
								anim.setDuration(200); // You can manage the time of the blink with this parameter
								anim.setStartOffset(20);
								anim.setRepeatMode(Animation.REVERSE);					
								anim.setRepeatCount(Animation.INFINITE);//Animation.INFINITE				
								recordTextView.startAnimation(anim);

								anim.setFillAfter(true);
							} 	
						}
					}
				}

			}
		});

	}

	private List<LsDeviceInfo> getPairedDeviceInfo()
	{
		List<LsDeviceInfo> deviceList=null;
		String key=PairedDeviceInfo.class.getName();
		PairedDeviceInfo mPairedDeviceInfo=SettingInfoManager.readPairedDeviceInfoFromFile(mAppContext, key);
		if(mPairedDeviceInfo!=null && mPairedDeviceInfo.getPairedDeviceMap()!=null)
		{
			deviceList=new ArrayList<LsDeviceInfo>();
			Map<String, LsDeviceInfo> deviceMap=mPairedDeviceInfo.getPairedDeviceMap();
			Iterator<Entry<String, LsDeviceInfo>> it = deviceMap.entrySet().iterator();
			while (it.hasNext()) 
			{
				Entry<String, LsDeviceInfo> entry = it.next();
				LsDeviceInfo lsDevice=entry.getValue();
				if(lsDevice!=null)
				{
					deviceList.add(lsDevice);
				}
			}
		}
		return deviceList;
	}


	private void showDeviceInfo(LsDeviceInfo device)
	{
		if(device!=null)
		{   
			showInfoTextView.append("paired device information"+"\n");
			showInfoTextView.append("------------------------------------"+"\n");
			showInfoTextView.append("deviceName: "+device.getDeviceName()+"\n");
			showInfoTextView.append("broadcastID: "+device.getBroadcastID()+"\n");
			showInfoTextView.append("deviceType: "+device.getDeviceType()+"\n"); 
			showInfoTextView.append("password: "+device.getPassword()+"\n"); 
			showInfoTextView.append("deviceID: "+device.getDeviceId()+"\n");
			showInfoTextView.append("deviceSN: "+device.getDeviceSn()+"\n");
			showInfoTextView.append("manufactureName: "+device.getManufactureName()+"\n");	        	
			showInfoTextView.append("modelNumber: "+device.getModelNumber()+"\n");  	      	  
			showInfoTextView.append("firmwareVersion: "+device.getFirmwareVersion()+"\n");
			showInfoTextView.append("hardwareVersion: "+device.getHardwareVersion()+"\n");   
			showInfoTextView.append("softwareVersion: "+device.getSoftwareVersion()+"\n");
			showInfoTextView.append("UserNumber: "+device.getDeviceUserNumber()+"\n");
			showInfoTextView.append("maxUserQuantity: "+device.getMaxUserQuantity()+"\n");
			showInfoTextView.append("protocolType: "+device.getProtocolType()+"\n");
			showInfoTextView.append("mac Address: "+device.getMacAddress()+"\n");
		}
		else
		{
			showInfoTextView.append("Failed paired!Please try again"+"\n");
		}	 	       
	}
	/**
	 * ?????????????????????????????????????????????
	 * @param deviceType
	 * @param protocolType 
	 */
	private void showMeasuredData(String deviceType, String protocolType)
	{
		if(deviceType!=null)
		{
			
			
			if(deviceType.equals(DeviceTypeConstants.SPHYGMOMAN_METER))
			{
				showBloodPressureMeasureData(bpDataList);
			}
			else if(deviceType.equals(DeviceTypeConstants.FAT_SCALE))
			{
				if("GENERIC_FAT".equals(protocolType)){

					showWeightMeasureData_A2(wDataList_A2);

					showToast("fatscale scale");

				}else{

					showWeightMeasureData(wDataList_A3);
					showToast("fatscale scale 2");

					mDialogWeight(wDataList_A3);
				}
			}
			else if(deviceType.equals(DeviceTypeConstants.WEIGHT_SCALE))
			{
				showWeightMeasureData_A2(wDataList_A2);

				mDialogWeight(wDataList_A3);

			}

		}
	}

	private void mDialogWeight(List<WeightData_A3> wDataList_A3) {


/*		heightStr = spGetter().getString(SharedPrefUtils.USER_HEIGHT, "");
		ageStr = spGetter().getString(SharedPrefUtils.USER_AGE, "");
		sexUser = spGetter().getBoolean(SharedPrefUtils.USER_SEX,false);*/

		//mCalcBMR(cursor.getString(1),heightStr,sexUser,ageStr),


		//sqliteDBHelper2.deleteBMIData();

	if(wDataList_A3.size()!= 0){

		for (int i = 0; i <wDataList_A3.size() ; i++) {

			sqliteDBHelper2.insertBMIDataS(wDataList_A3.get(i).getWeight()+"",
					"",
					wDataList_A3.get(i).getBodyFatRatio()+"",
					wDataList_A3.get(i).getMuscleMassRatio()+"",
					wDataList_A3.get(i).getVisceralFatLevel()+"",
					wDataList_A3.get(i).getBodyWaterRatio()+"",
					wDataList_A3.get(i).getBoneDensity()+"",
					 "",
					wDataList_A3.get(i).getWeightDifferenceValue()+"",
					wDataList_A3.get(i).getWeightDifferenceValue()+"",
					wDataList_A3.get(i).getDate()+"",
					wDataList_A3.get(i).getUserId()+"");

			Log.d("Bmi Data--",wDataList_A3.get(i).toString());
		}


		mGetBMIDash();



	}

	}


	private void showWeightMeasureData_A2(List<WeightData_A2> wData_A2s){
		if(wData_A2s!=null)
		{
			showInfoTextView.append("----The total number of records:"+wData_A2s.size()+"----"+"\n");
			for(WeightData_A2 wData:wData_A2s)
			{ 
				showMeasuredDataDetails(wData, false);
			}

		}
		else 
		{
			showInfoTextView.append("No measured Record"+"\n");
		}

	}


	/**
	 * ??????????????????????????????
	 * @param wDataList
	 */
	private void showWeightMeasureData(List<WeightData_A3> wDataList) {

		if(wDataList!=null && wDataList.size()>0)
		{
			showInfoTextView.append("---The total number of records:"+wDataList.size()+"----"+"\n");
			for(WeightData_A3 wData:wDataList)
			{
				showMeasuredDataDetails(wData, false);
			}
		}
		else {showInfoTextView.append("No measured records"+"\n");}
	}


	/**
	 * ?????????????????????????????????
	 * @param bpDataList
	 */
	private void showBloodPressureMeasureData(List<BloodPressureData> bpDataList)
	{
		if(bpDataList!=null && bpDataList.size()>0)
		{
			showInfoTextView.append("------The total number of records:"+bpDataList.size()+"----"+"\n");
			for(BloodPressureData bData:bpDataList)
			{
				showMeasuredDataDetails(bData,false);

			}
		}
	}



	private void showMeasuredDataDetails(final Object objectData,final boolean appendData) 
	{
		getActivity().runOnUiThread(new Runnable() {

			@Override
			public void run() {
				if(objectData!=null)
				{
					if(appendData)
					{
						Spanned title=Html.fromHtml("<font color=\"RED\">"+"------new measured data----"+"</font>");
						showInfoTextView.append(title+"\n");
					}


					if(objectData instanceof WeightData_A2)
					{
						WeightData_A2 wData=(WeightData_A2) objectData;
						showInfoTextView.append("Record Number:"+wDataList_A2.indexOf(wData)+"\n");
						showInfoTextView.append("Measuring time???"+ wData.getDate()+"\n");
						showInfoTextView.append("DeviceSN???"+ wData.getDeviceSn()+"\n");
						showInfoTextView.append("UserNumber???"+ wData.getUserNo()+"\n");
						showInfoTextView.append("Weight???"+ wData.getWeight()+"\n");
						showInfoTextView.append("Fat rate???"+ wData.getPbf()+"\n");
						showInfoTextView.append("Resistance_1???"+ wData.getResistance_1()+"\n");
						showInfoTextView.append("Resistance_2???"+ wData.getResistance_2()+"\n");
						showInfoTextView.append("Unit???"+ wData.getDeviceSelectedUnit()+"\n");
						showInfoTextView.append("VoltageData???"+ wData.getVoltageData()+"\n");
						showInfoTextView.append("Battery level:"+(int)wData.getBattery()+"\n");
						if(wData.getResistance_2()>0)
						{
							showInfoTextView.append("BodyFatRatio???"+ wData.getBodyFatRatio()+"\n");
							showInfoTextView.append("BodyWaterRatio???"+ wData.getBodyWaterRatio()+"\n");
							showInfoTextView.append("MuscleMassRatio???"+ wData.getMuscleMassRatio()+"\n");
							showInfoTextView.append("BoneDensity???"+ wData.getBoneDensity()+"\n");
							showInfoTextView.append("BasalMetabolism???"+ wData.getBasalMetabolism()+"\n");
						}
					
//						showInfoTextView.append("LB Weight Value???"+wData.getLbWeightValue() +"\n");
//						showInfoTextView.append("St Weight Value???"+ wData.getStSectionValue()+": "+wData.getStWeightValue()+"\n");
						
						showInfoTextView.append("----------------------------------"+"\n");
					}
					if(objectData instanceof WeightData_A3)
					{
						WeightData_A3 wData=(WeightData_A3) objectData;
						showInfoTextView.append("Record Number:"+wDataList_A3.indexOf(wData)+"\n");
						showInfoTextView.append("Measuring time???"+ wData.getDate()+"\n");
						showInfoTextView.append("DeviceSn???" + wData.getDeviceSn() + "\n");
						showInfoTextView.append("mpedance???"+ wData.getImpedance()+"\n");
						showInfoTextView.append("UserNumber???"+ wData.getUserId()+"\n");
						showInfoTextView.append("isAppendMeasurement???"+ wData.isAppendMeasurement()+"\n");
						showInfoTextView.append("Battery???"+ wData.getBattery()+"\n");
						showInfoTextView.append("WeightStatus???"+ wData.getWeightStatus()+"\n");
						showInfoTextView.append("ImpedanceStatus???"+ wData.getImpedanceStatus()+"\n");
						showInfoTextView.append("AccuracyStatus???"+ wData.getAccuracyStatus()+"\n");    	  
						showInfoTextView.append("Weight???"+ wData.getWeight()+"\n");
						showInfoTextView.append("BodyFatRatio???"+ wData.getBodyFatRatio()+"\n");
						showInfoTextView.append("BodyWaterRatio???"+ wData.getBodyWaterRatio()+"\n");
						showInfoTextView.append("VisceralFatLevel???"+ wData.getVisceralFatLevel()+"\n");
						showInfoTextView.append("MuscleMassRatio???"+ wData.getMuscleMassRatio()+"\n");
						showInfoTextView.append("BoneDensity???"+ wData.getBoneDensity()+"\n");
						showInfoTextView.append("BasalMetabolism???"+ wData.getBasalMetabolism()+"\n");
						showInfoTextView.append("Unit???"+ wData.getDeviceSelectedUnit()+"\n");
//						showInfoTextView.append("LB Weight Value???"+wData.getLbWeightValue() +"\n");
//						showInfoTextView.append("St Weight Value???"+ wData.getStSectionValue()+" : "+wData.getStWeightValue()+"\n");
						showInfoTextView.append("----------------------------------"+"\n");
					}

				}

			}
		});


	}



}
