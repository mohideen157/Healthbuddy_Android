package indg.com.cover2protect.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J>\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J>\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J>\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032$\b\u0001\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\b2\b\b\u0001\u0010\t\u001a\u00020\u0007H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\'\u00a8\u0006\u0013"}, d2 = {"Lindg/com/cover2protect/presenter/NutrionApi;", "", "GetNutrionExcerciseResponse", "Lretrofit2/Call;", "Lindg/com/cover2protect/model/excercisemodel/ExcerciseModelResponse;", "headerData", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "query", "GetNutrionInstant", "Lio/reactivex/Observable;", "Lindg/com/cover2protect/model/nutrition/nutitionmodel/NutritionModelResponse;", "GetNutrionResponse", "Lindg/com/cover2protect/model/nutrition/nutritiongetresponse/NutritionGetResponse;", "MedicalReport", "Lindg/com/cover2protect/model/MedicalReportResponse;", "file_name", "Lokhttp3/RequestBody;", "app_DevDebug"})
public abstract interface NutrionApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/v2/search/instant")
    public abstract io.reactivex.Observable<indg.com.cover2protect.model.nutrition.nutitionmodel.NutritionModelResponse> GetNutrionInstant(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.HashMap<java.lang.String, java.lang.String> headerData, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "query")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v2/natural/nutrients")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<indg.com.cover2protect.model.nutrition.nutritiongetresponse.NutritionGetResponse> GetNutrionResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.HashMap<java.lang.String, java.lang.String> headerData, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "query")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v2/natural/exercise")
    @retrofit2.http.FormUrlEncoded()
    public abstract retrofit2.Call<indg.com.cover2protect.model.excercisemodel.ExcerciseModelResponse> GetNutrionExcerciseResponse(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.HeaderMap()
    java.util.HashMap<java.lang.String, java.lang.String> headerData, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "query")
    java.lang.String query);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "medreportreader")
    public abstract retrofit2.Call<indg.com.cover2protect.model.MedicalReportResponse> MedicalReport(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    okhttp3.RequestBody file_name);
}