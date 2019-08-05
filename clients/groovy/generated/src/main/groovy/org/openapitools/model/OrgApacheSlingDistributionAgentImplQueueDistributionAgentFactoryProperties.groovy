package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties {
    ConfigNodePropertyString name = null

    ConfigNodePropertyString title = null

    ConfigNodePropertyString details = null

    ConfigNodePropertyBoolean enabled = null

    ConfigNodePropertyString serviceName = null

    ConfigNodePropertyDropDown logLevel = null

    ConfigNodePropertyArray allowedRoots = null

    ConfigNodePropertyString requestAuthorizationStrategyTarget = null

    ConfigNodePropertyString queueProviderFactoryTarget = null

    ConfigNodePropertyString packageBuilderTarget = null

    ConfigNodePropertyString triggersTarget = null

    ConfigNodePropertyArray priorityQueues = null

}
