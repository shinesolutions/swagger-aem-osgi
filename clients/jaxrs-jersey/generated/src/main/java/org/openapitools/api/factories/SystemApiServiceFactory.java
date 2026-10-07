package org.openapitools.api.factories;

import org.openapitools.api.SystemApiService;
import org.openapitools.api.impl.SystemApiServiceImpl;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-10-07T12:54:10.605414884Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SystemApiServiceFactory {
    private static final SystemApiService service = new SystemApiServiceImpl();

    public static SystemApiService getSystemApi() {
        return service;
    }
}
