package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.GuideLocalizationServiceProperties;

@Canonical
class GuideLocalizationServiceInfo {
    
    String pid
    
    String title
    
    String description
    
    GuideLocalizationServiceProperties properties
}
