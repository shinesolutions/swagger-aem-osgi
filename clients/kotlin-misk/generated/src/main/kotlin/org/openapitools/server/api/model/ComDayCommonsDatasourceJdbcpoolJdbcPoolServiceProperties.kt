package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties(
    val jdbcDriverClass: ConfigNodePropertyString? = null,
    val jdbcConnectionUri: ConfigNodePropertyString? = null,
    val jdbcUsername: ConfigNodePropertyString? = null,
    val jdbcPassword: ConfigNodePropertyString? = null,
    val jdbcValidationQuery: ConfigNodePropertyString? = null,
    val defaultReadonly: ConfigNodePropertyBoolean? = null,
    val defaultAutocommit: ConfigNodePropertyBoolean? = null,
    val poolSize: ConfigNodePropertyInteger? = null,
    val poolMaxWaitMsec: ConfigNodePropertyInteger? = null,
    val datasourceName: ConfigNodePropertyString? = null,
    val datasourceSvcProperties: ConfigNodePropertyArray? = null
)
