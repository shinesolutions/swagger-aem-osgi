package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqDamIdsImplIDSJobProcessorProperties {
    ConfigNodePropertyBoolean enableMultisession = null

    ConfigNodePropertyBoolean idsCcEnable = null

    ConfigNodePropertyBoolean enableRetry = null

    ConfigNodePropertyBoolean enableRetryScripterror = null

    ConfigNodePropertyString externalizerDomainCqhost = null

    ConfigNodePropertyString externalizerDomainHttp = null

}
