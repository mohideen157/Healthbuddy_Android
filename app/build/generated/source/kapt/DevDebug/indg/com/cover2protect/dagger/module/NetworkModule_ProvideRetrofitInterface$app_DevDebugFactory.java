// Generated by Dagger (https://google.github.io/dagger).
package indg.com.cover2protect.dagger.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideRetrofitInterface$app_DevDebugFactory
    implements Factory<Retrofit> {
  private static final NetworkModule_ProvideRetrofitInterface$app_DevDebugFactory INSTANCE =
      new NetworkModule_ProvideRetrofitInterface$app_DevDebugFactory();

  @Override
  public Retrofit get() {
    return provideInstance();
  }

  public static Retrofit provideInstance() {
    return proxyProvideRetrofitInterface$app_DevDebug();
  }

  public static NetworkModule_ProvideRetrofitInterface$app_DevDebugFactory create() {
    return INSTANCE;
  }

  public static Retrofit proxyProvideRetrofitInterface$app_DevDebug() {
    return Preconditions.checkNotNull(
        NetworkModule.provideRetrofitInterface$app_DevDebug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
