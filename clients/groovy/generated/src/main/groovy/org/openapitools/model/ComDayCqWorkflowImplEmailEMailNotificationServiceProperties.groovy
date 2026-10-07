package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCqWorkflowImplEmailEMailNotificationServiceProperties {
    
    ConfigNodePropertyString fromAddress
    
    ConfigNodePropertyString hostPrefix
    
    ConfigNodePropertyBoolean notifyOnabort
    
    ConfigNodePropertyBoolean notifyOncomplete
    
    ConfigNodePropertyBoolean notifyOncontainercomplete
    
    ConfigNodePropertyBoolean notifyUseronly
}
