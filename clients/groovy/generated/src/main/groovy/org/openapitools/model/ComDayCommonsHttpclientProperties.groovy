package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCommonsHttpclientProperties {
    ConfigNodePropertyBoolean proxyEnabled = null

    ConfigNodePropertyString proxyHost = null

    ConfigNodePropertyString proxyUser = null

    ConfigNodePropertyString proxyPassword = null

    ConfigNodePropertyString proxyNtlmHost = null

    ConfigNodePropertyString proxyNtlmDomain = null

    ConfigNodePropertyArray proxyExceptions = null

}
