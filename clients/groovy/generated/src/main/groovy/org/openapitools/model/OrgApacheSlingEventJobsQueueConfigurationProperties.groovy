package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyFloat;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingEventJobsQueueConfigurationProperties {
    
    ConfigNodePropertyString queueName
    
    ConfigNodePropertyArray queueTopics
    
    ConfigNodePropertyDropDown queueType
    
    ConfigNodePropertyDropDown queuePriority
    
    ConfigNodePropertyInteger queueRetries
    
    ConfigNodePropertyInteger queueRetrydelay
    
    ConfigNodePropertyFloat queueMaxparallel
    
    ConfigNodePropertyBoolean queueKeepJobs
    
    ConfigNodePropertyBoolean queuePreferRunOnCreationInstance
    
    ConfigNodePropertyInteger queueThreadPoolSize
    
    ConfigNodePropertyInteger serviceRanking
}
