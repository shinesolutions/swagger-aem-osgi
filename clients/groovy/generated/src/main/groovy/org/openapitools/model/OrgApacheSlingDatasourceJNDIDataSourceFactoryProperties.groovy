package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

@Canonical
class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties {
    ConfigNodePropertyString datasourceName = null

    ConfigNodePropertyString datasourceSvcPropName = null

    ConfigNodePropertyString datasourceJndiName = null

    ConfigNodePropertyArray jndiProperties = null

}
