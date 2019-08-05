package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties {
    ConfigNodePropertyString jdbcDriverClass = null

    ConfigNodePropertyString jdbcConnectionUri = null

    ConfigNodePropertyString jdbcUsername = null

    ConfigNodePropertyString jdbcPassword = null

    ConfigNodePropertyString jdbcValidationQuery = null

    ConfigNodePropertyBoolean defaultReadonly = null

    ConfigNodePropertyBoolean defaultAutocommit = null

    ConfigNodePropertyInteger poolSize = null

    ConfigNodePropertyInteger poolMaxWaitMsec = null

    ConfigNodePropertyString datasourceName = null

    ConfigNodePropertyArray datasourceSvcProperties = null

}
