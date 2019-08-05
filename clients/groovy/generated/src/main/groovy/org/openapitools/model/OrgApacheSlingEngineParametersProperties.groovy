package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEngineParametersProperties {
    ConfigNodePropertyString slingDefaultParameterEncoding = null

    ConfigNodePropertyInteger slingDefaultMaxParameters = null

    ConfigNodePropertyString fileLocation = null

    ConfigNodePropertyInteger fileThreshold = null

    ConfigNodePropertyInteger fileMax = null

    ConfigNodePropertyInteger requestMax = null

    ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters = null

}
