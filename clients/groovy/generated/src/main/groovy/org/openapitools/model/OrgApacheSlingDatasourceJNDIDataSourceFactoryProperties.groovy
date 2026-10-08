package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
    
    ConfigNodePropertyString datasourceName
    
    ConfigNodePropertyString datasourceSvcPropName
    
    ConfigNodePropertyString datasourceJndiName
    
    ConfigNodePropertyArray jndiProperties
}
