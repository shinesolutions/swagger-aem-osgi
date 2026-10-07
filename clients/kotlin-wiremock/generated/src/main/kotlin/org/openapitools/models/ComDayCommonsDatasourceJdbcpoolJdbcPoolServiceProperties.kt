@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(
    @field:JsonProperty("jdbc.driver.class")
    val jdbcDriverClass: ConfigNodePropertyString? = null,

    @field:JsonProperty("jdbc.connection.uri")
    val jdbcConnectionUri: ConfigNodePropertyString? = null,

    @field:JsonProperty("jdbc.username")
    val jdbcUsername: ConfigNodePropertyString? = null,

    @field:JsonProperty("jdbc.password")
    val jdbcPassword: ConfigNodePropertyString? = null,

    @field:JsonProperty("jdbc.validation.query")
    val jdbcValidationQuery: ConfigNodePropertyString? = null,

    @field:JsonProperty("default.readonly")
    val defaultReadonly: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("default.autocommit")
    val defaultAutocommit: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("pool.size")
    val poolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("pool.max.wait.msec")
    val poolMaxWaitMsec: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("datasource.name")
    val datasourceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("datasource.svc.properties")
    val datasourceSvcProperties: ConfigNodePropertyArray? = null,

)
