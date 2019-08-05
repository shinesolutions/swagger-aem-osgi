package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqAuthImplCugCugSupportImplProperties {
    ConfigNodePropertyArray cugExemptedPrincipals = null

    ConfigNodePropertyBoolean cugEnabled = null

    ConfigNodePropertyString cugPrincipalsRegex = null

    ConfigNodePropertyString cugPrincipalsReplacement = null

}
