package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqAuthImplLoginSelectorHandlerProperties {
    ConfigNodePropertyString path = null

    ConfigNodePropertyInteger serviceRanking = null

    ConfigNodePropertyArray authLoginselectorMappings = null

    ConfigNodePropertyArray authLoginselectorChangepwMappings = null

    ConfigNodePropertyString authLoginselectorDefaultloginpage = null

    ConfigNodePropertyString authLoginselectorDefaultchangepwpage = null

    ConfigNodePropertyArray authLoginselectorHandle = null

    ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions = null

}
