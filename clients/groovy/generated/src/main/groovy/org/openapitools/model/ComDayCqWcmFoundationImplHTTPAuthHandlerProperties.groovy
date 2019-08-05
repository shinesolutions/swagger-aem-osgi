package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWcmFoundationImplHTTPAuthHandlerProperties {
    ConfigNodePropertyString path = null

    ConfigNodePropertyBoolean authHttpNologin = null

    ConfigNodePropertyString authHttpRealm = null

    ConfigNodePropertyString authDefaultLoginpage = null

    ConfigNodePropertyArray authCredForm = null

    ConfigNodePropertyArray authCredUtf8 = null

}
