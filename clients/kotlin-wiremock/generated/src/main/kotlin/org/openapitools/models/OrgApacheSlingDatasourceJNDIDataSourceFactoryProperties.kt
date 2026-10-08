@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties(
    @field:JsonProperty("datasource.name")
    val datasourceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("datasource.svc.prop.name")
    val datasourceSvcPropName: ConfigNodePropertyString? = null,

    @field:JsonProperty("datasource.jndi.name")
    val datasourceJndiName: ConfigNodePropertyString? = null,

    @field:JsonProperty("jndi.properties")
    val jndiProperties: ConfigNodePropertyArray? = null,

)
