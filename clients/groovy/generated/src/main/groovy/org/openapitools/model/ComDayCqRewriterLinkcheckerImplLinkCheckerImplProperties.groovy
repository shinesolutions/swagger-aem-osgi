package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
    ConfigNodePropertyInteger schedulerPeriod = null

    ConfigNodePropertyBoolean schedulerConcurrent = null

    ConfigNodePropertyInteger serviceBadLinkToleranceInterval = null

    ConfigNodePropertyArray serviceCheckOverridePatterns = null

    ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks = null

    ConfigNodePropertyArray serviceSpecialLinkPrefix = null

    ConfigNodePropertyArray serviceSpecialLinkPatterns = null

}
