package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.MessagingUserComponentFactoryProperties;

@Canonical
class MessagingUserComponentFactoryInfo {
    
    String pid
    
    String title
    
    String description
    
    MessagingUserComponentFactoryProperties properties
}
