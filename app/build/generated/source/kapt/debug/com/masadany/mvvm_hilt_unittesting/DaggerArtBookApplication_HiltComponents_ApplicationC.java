package com.masadany.mvvm_hilt_unittesting;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.RequestManager;
import com.masadany.dependencyinjection.AppModule;
import com.masadany.dependencyinjection.AppModule_InjectDaoFactory;
import com.masadany.dependencyinjection.AppModule_InjectGlideFactory;
import com.masadany.dependencyinjection.AppModule_InjectNormalRepoFactory;
import com.masadany.dependencyinjection.AppModule_InjectRetrofitAPIFactory;
import com.masadany.dependencyinjection.AppModule_InjectRoomDatabaseFactory;
import com.masadany.mvvm_hilt_unittesting.adapter.ArtRecyclerAdapter;
import com.masadany.mvvm_hilt_unittesting.adapter.ImageRecyclerAdapter;
import com.masadany.mvvm_hilt_unittesting.api.RetrofitAPI;
import com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface;
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDao;
import com.masadany.mvvm_hilt_unittesting.roomdb.ArtDatabase;
import com.masadany.mvvm_hilt_unittesting.view.ArtFragment;
import com.masadany.mvvm_hilt_unittesting.view.ArtFragmentFactory;
import com.masadany.mvvm_hilt_unittesting.view.MainActivity;
import com.masadany.mvvm_hilt_unittesting.view.MainActivity_MembersInjector;
import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel_AssistedFactory;
import com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerArtBookApplication_HiltComponents_ApplicationC extends ArtBookApplication_HiltComponents.ApplicationC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object requestManager = new MemoizedSentinel();

  private volatile Object artDatabase = new MemoizedSentinel();

  private volatile Object artDao = new MemoizedSentinel();

  private volatile Object retrofitAPI = new MemoizedSentinel();

  private volatile Object artRepositoryInterface = new MemoizedSentinel();

  private volatile Provider<ArtRepositoryInterface> injectNormalRepoProvider;

  private DaggerArtBookApplication_HiltComponents_ApplicationC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private RequestManager getRequestManager() {
    Object local = requestManager;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = requestManager;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_InjectGlideFactory.injectGlide(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          requestManager = DoubleCheck.reentrantCheck(requestManager, local);
        }
      }
    }
    return (RequestManager) local;
  }

  private ArtDatabase getArtDatabase() {
    Object local = artDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = artDatabase;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_InjectRoomDatabaseFactory.injectRoomDatabase(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
          artDatabase = DoubleCheck.reentrantCheck(artDatabase, local);
        }
      }
    }
    return (ArtDatabase) local;
  }

  private ArtDao getArtDao() {
    Object local = artDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = artDao;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_InjectDaoFactory.injectDao(getArtDatabase());
          artDao = DoubleCheck.reentrantCheck(artDao, local);
        }
      }
    }
    return (ArtDao) local;
  }

  private RetrofitAPI getRetrofitAPI() {
    Object local = retrofitAPI;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = retrofitAPI;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_InjectRetrofitAPIFactory.injectRetrofitAPI();
          retrofitAPI = DoubleCheck.reentrantCheck(retrofitAPI, local);
        }
      }
    }
    return (RetrofitAPI) local;
  }

  private ArtRepositoryInterface getArtRepositoryInterface() {
    Object local = artRepositoryInterface;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = artRepositoryInterface;
        if (local instanceof MemoizedSentinel) {
          local = AppModule_InjectNormalRepoFactory.injectNormalRepo(getArtDao(), getRetrofitAPI());
          artRepositoryInterface = DoubleCheck.reentrantCheck(artRepositoryInterface, local);
        }
      }
    }
    return (ArtRepositoryInterface) local;
  }

  private Provider<ArtRepositoryInterface> getArtRepositoryInterfaceProvider() {
    Object local = injectNormalRepoProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      injectNormalRepoProvider = (Provider<ArtRepositoryInterface>) local;
    }
    return (Provider<ArtRepositoryInterface>) local;
  }

  @Override
  public void injectArtBookApplication(ArtBookApplication artBookApplication) {
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder appModule(AppModule appModule) {
      Preconditions.checkNotNull(appModule);
      return this;
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    public ArtBookApplication_HiltComponents.ApplicationC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerArtBookApplication_HiltComponents_ApplicationC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements ArtBookApplication_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public ArtBookApplication_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends ArtBookApplication_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements ArtBookApplication_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity activity) {
        this.activity = Preconditions.checkNotNull(activity);
        return this;
      }

      @Override
      public ArtBookApplication_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends ArtBookApplication_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<ArtViewModel_AssistedFactory> artViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private ArtRecyclerAdapter getArtRecyclerAdapter() {
        return new ArtRecyclerAdapter(DaggerArtBookApplication_HiltComponents_ApplicationC.this.getRequestManager());
      }

      private ImageRecyclerAdapter getImageRecyclerAdapter() {
        return new ImageRecyclerAdapter(DaggerArtBookApplication_HiltComponents_ApplicationC.this.getRequestManager());
      }

      private ArtFragmentFactory getArtFragmentFactory() {
        return new ArtFragmentFactory(getArtRecyclerAdapter(), getImageRecyclerAdapter(), DaggerArtBookApplication_HiltComponents_ApplicationC.this.getRequestManager());
      }

      private ArtViewModel_AssistedFactory getArtViewModel_AssistedFactory() {
        return ArtViewModel_AssistedFactory_Factory.newInstance(DaggerArtBookApplication_HiltComponents_ApplicationC.this.getArtRepositoryInterfaceProvider());
      }

      private Provider<ArtViewModel_AssistedFactory> getArtViewModel_AssistedFactoryProvider() {
        Object local = artViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          artViewModel_AssistedFactoryProvider = (Provider<ArtViewModel_AssistedFactory>) local;
        }
        return (Provider<ArtViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return Collections.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>singletonMap("com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel", (Provider) getArtViewModel_AssistedFactoryProvider());
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerArtBookApplication_HiltComponents_ApplicationC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectHiltTestActivity(HiltTestActivity hiltTestActivity) {
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
        injectMainActivity2(mainActivity);
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private MainActivity injectMainActivity2(MainActivity instance) {
        MainActivity_MembersInjector.injectFragmentFactory(instance, getArtFragmentFactory());
        return instance;
      }

      private final class FragmentCBuilder implements ArtBookApplication_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment fragment) {
          this.fragment = Preconditions.checkNotNull(fragment);
          return this;
        }

        @Override
        public ArtBookApplication_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends ArtBookApplication_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerArtBookApplication_HiltComponents_ApplicationC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectArtFragment(ArtFragment artFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements ArtBookApplication_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View view) {
            this.view = Preconditions.checkNotNull(view);
            return this;
          }

          @Override
          public ArtBookApplication_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends ArtBookApplication_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements ArtBookApplication_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View view) {
          this.view = Preconditions.checkNotNull(view);
          return this;
        }

        @Override
        public ArtBookApplication_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends ArtBookApplication_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.masadany.mvvm_hilt_unittesting.viewmodel.ArtViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getArtViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements ArtBookApplication_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service service) {
      this.service = Preconditions.checkNotNull(service);
      return this;
    }

    @Override
    public ArtBookApplication_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends ArtBookApplication_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.masadany.mvvm_hilt_unittesting.repo.ArtRepositoryInterface 
        return (T) DaggerArtBookApplication_HiltComponents_ApplicationC.this.getArtRepositoryInterface();

        default: throw new AssertionError(id);
      }
    }
  }
}
