package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties {
    ConfigNodePropertyString poolName = null

    ConfigNodePropertyArray allowedPoolNames = null

    ConfigNodePropertyBoolean schedulerUseleaderforsingle = null

    ConfigNodePropertyArray metricsFilters = null

    ConfigNodePropertyInteger slowThresholdMillis = null

}
