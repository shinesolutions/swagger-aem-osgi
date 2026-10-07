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
    
    ConfigNodePropertyString datasourceName
    
    ConfigNodePropertyString datasourceSvcPropName
    
    ConfigNodePropertyString driverClassName
    
    ConfigNodePropertyString url
    
    ConfigNodePropertyString username
    
    ConfigNodePropertyString password
    
    ConfigNodePropertyDropDown defaultAutoCommit
    
    ConfigNodePropertyDropDown defaultReadOnly
    
    ConfigNodePropertyDropDown defaultTransactionIsolation
    
    ConfigNodePropertyString defaultCatalog
    
    ConfigNodePropertyInteger maxActive
    
    ConfigNodePropertyInteger maxIdle
    
    ConfigNodePropertyInteger minIdle
    
    ConfigNodePropertyInteger initialSize
    
    ConfigNodePropertyInteger maxWait
    
    ConfigNodePropertyInteger maxAge
    
    ConfigNodePropertyBoolean testOnBorrow
    
    ConfigNodePropertyBoolean testOnReturn
    
    ConfigNodePropertyBoolean testWhileIdle
    
    ConfigNodePropertyString validationQuery
    
    ConfigNodePropertyInteger validationQueryTimeout
    
    ConfigNodePropertyInteger timeBetweenEvictionRunsMillis
    
    ConfigNodePropertyInteger minEvictableIdleTimeMillis
    
    ConfigNodePropertyString connectionProperties
    
    ConfigNodePropertyString initSQL
    
    ConfigNodePropertyString jdbcInterceptors
    
    ConfigNodePropertyInteger validationInterval
    
    ConfigNodePropertyBoolean logValidationErrors
    
    ConfigNodePropertyArray datasourceSvcProperties
}
