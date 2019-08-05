package org.openapitools.api.factories;

import org.openapitools.api.SystemApiService;
import org.openapitools.api.impl.SystemApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-08-05T00:58:47.028Z[GMT]")
public class SystemApiServiceFactory {
    private final static SystemApiService service = new SystemApiServiceImpl();

    public static SystemApiService getSystemApi() {
        return service;
    }
}
