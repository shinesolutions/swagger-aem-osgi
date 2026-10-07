package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties {
    
    ConfigNodePropertyString name
    
    ConfigNodePropertyInteger minPoolSize
    
    ConfigNodePropertyInteger maxPoolSize
    
    ConfigNodePropertyInteger queueSize
    
    ConfigNodePropertyInteger maxThreadAge
    
    ConfigNodePropertyInteger keepAliveTime
    
    ConfigNodePropertyDropDown blockPolicy
    
    ConfigNodePropertyBoolean shutdownGraceful
    
    ConfigNodePropertyBoolean daemon
    
    ConfigNodePropertyInteger shutdownWaitTime
    
    ConfigNodePropertyDropDown priority
}
