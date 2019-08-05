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
    ConfigNodePropertyString queueName = null

    ConfigNodePropertyArray queueTopics = null

    ConfigNodePropertyDropDown queueType = null

    ConfigNodePropertyDropDown queuePriority = null

    ConfigNodePropertyInteger queueRetries = null

    ConfigNodePropertyInteger queueRetrydelay = null

    ConfigNodePropertyFloat queueMaxparallel = null

    ConfigNodePropertyBoolean queueKeepJobs = null

    ConfigNodePropertyBoolean queuePreferRunOnCreationInstance = null

    ConfigNodePropertyInteger queueThreadPoolSize = null

    ConfigNodePropertyInteger serviceRanking = null

}
