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
    
    ConfigNodePropertyString jdbcDriverClass
    
    ConfigNodePropertyString jdbcConnectionUri
    
    ConfigNodePropertyString jdbcUsername
    
    ConfigNodePropertyString jdbcPassword
    
    ConfigNodePropertyString jdbcValidationQuery
    
    ConfigNodePropertyBoolean defaultReadonly
    
    ConfigNodePropertyBoolean defaultAutocommit
    
    ConfigNodePropertyInteger poolSize
    
    ConfigNodePropertyInteger poolMaxWaitMsec
    
    ConfigNodePropertyString datasourceName
    
    ConfigNodePropertyArray datasourceSvcProperties
}
