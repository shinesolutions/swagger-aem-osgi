package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDatasourceDataSourceFactoryProperties {
    ConfigNodePropertyString datasourceName = null

    ConfigNodePropertyString datasourceSvcPropName = null

    ConfigNodePropertyString driverClassName = null

    ConfigNodePropertyString url = null

    ConfigNodePropertyString username = null

    ConfigNodePropertyString password = null

    ConfigNodePropertyDropDown defaultAutoCommit = null

    ConfigNodePropertyDropDown defaultReadOnly = null

    ConfigNodePropertyDropDown defaultTransactionIsolation = null

    ConfigNodePropertyString defaultCatalog = null

    ConfigNodePropertyInteger maxActive = null

    ConfigNodePropertyInteger maxIdle = null

    ConfigNodePropertyInteger minIdle = null

    ConfigNodePropertyInteger initialSize = null

    ConfigNodePropertyInteger maxWait = null

    ConfigNodePropertyInteger maxAge = null

    ConfigNodePropertyBoolean testOnBorrow = null

    ConfigNodePropertyBoolean testOnReturn = null

    ConfigNodePropertyBoolean testWhileIdle = null

    ConfigNodePropertyString validationQuery = null

    ConfigNodePropertyInteger validationQueryTimeout = null

    ConfigNodePropertyInteger timeBetweenEvictionRunsMillis = null

    ConfigNodePropertyInteger minEvictableIdleTimeMillis = null

    ConfigNodePropertyString connectionProperties = null

    ConfigNodePropertyString initSQL = null

    ConfigNodePropertyString jdbcInterceptors = null

    ConfigNodePropertyInteger validationInterval = null

    ConfigNodePropertyBoolean logValidationErrors = null

    ConfigNodePropertyArray datasourceSvcProperties = null

}
