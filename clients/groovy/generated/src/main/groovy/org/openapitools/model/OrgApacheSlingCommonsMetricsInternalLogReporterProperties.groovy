package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingCommonsMetricsInternalLogReporterProperties {
    ConfigNodePropertyInteger period = null

    ConfigNodePropertyDropDown timeUnit = null

    ConfigNodePropertyDropDown level = null

    ConfigNodePropertyString loggerName = null

    ConfigNodePropertyString prefix = null

    ConfigNodePropertyString pattern = null

    ConfigNodePropertyString registryName = null

}
