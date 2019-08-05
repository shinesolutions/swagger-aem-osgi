package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineImplLogRequestLoggerProperties {
    ConfigNodePropertyString requestLogOutput = null

    ConfigNodePropertyDropDown requestLogOutputtype = null

    ConfigNodePropertyBoolean requestLogEnabled = null

    ConfigNodePropertyString accessLogOutput = null

    ConfigNodePropertyDropDown accessLogOutputtype = null

    ConfigNodePropertyBoolean accessLogEnabled = null

}
