package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {
    ConfigNodePropertyInteger schedulerPeriod = null

    ConfigNodePropertyBoolean schedulerConcurrent = null

    ConfigNodePropertyInteger goodLinkTestInterval = null

    ConfigNodePropertyInteger badLinkTestInterval = null

    ConfigNodePropertyInteger linkUnusedInterval = null

    ConfigNodePropertyInteger connectionTimeout = null

}
