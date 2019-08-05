import com.google.inject.AbstractModule;

import controllers.*;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(ConfigmgrApiControllerImpInterface.class).to(ConfigmgrApiControllerImp.class);
    }
}