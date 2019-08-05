package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
    ConfigNodePropertyString requestLogServiceFormat = null

    ConfigNodePropertyString requestLogServiceOutput = null

    ConfigNodePropertyDropDown requestLogServiceOutputtype = null

    ConfigNodePropertyBoolean requestLogServiceOnentry = null

}
