package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

@Canonical
class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
    
    ConfigNodePropertyInteger schedulerPeriod
    
    ConfigNodePropertyBoolean schedulerConcurrent
    
    ConfigNodePropertyInteger serviceBadLinkToleranceInterval
    
    ConfigNodePropertyArray serviceCheckOverridePatterns
    
    ConfigNodePropertyBoolean serviceCacheBrokenInternalLinks
    
    ConfigNodePropertyArray serviceSpecialLinkPrefix
    
    ConfigNodePropertyArray serviceSpecialLinkPatterns
}
