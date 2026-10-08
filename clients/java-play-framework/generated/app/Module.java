import com.google.inject.AbstractModule;

import controllers.*;
import openapitools.SecurityAPIUtils;

public class Module extends AbstractModule {

    @Override
    protected void configure() {
        bind(ConfigmgrApiControllerImpInterface.class).to(ConfigmgrApiControllerImp.class);
        bind(SecurityAPIUtils.class);
    }
}