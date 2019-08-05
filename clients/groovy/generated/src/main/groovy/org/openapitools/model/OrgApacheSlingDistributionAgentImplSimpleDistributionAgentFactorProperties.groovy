package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDistributionAgentImplSimpleDistributionAgentFactorProperties {
    ConfigNodePropertyString name = null

    ConfigNodePropertyString title = null

    ConfigNodePropertyString details = null

    ConfigNodePropertyBoolean enabled = null

    ConfigNodePropertyString serviceName = null

    ConfigNodePropertyDropDown logLevel = null

    ConfigNodePropertyBoolean queueProcessingEnabled = null

    ConfigNodePropertyString packageExporterTarget = null

    ConfigNodePropertyString packageImporterTarget = null

    ConfigNodePropertyString requestAuthorizationStrategyTarget = null

    ConfigNodePropertyString triggersTarget = null

}
