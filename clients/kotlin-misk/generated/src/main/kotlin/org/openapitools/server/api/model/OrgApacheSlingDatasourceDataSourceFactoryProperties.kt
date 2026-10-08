package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingDatasourceDataSourceFactoryProperties(
    val datasourceName: ConfigNodePropertyString? = null,
    val datasourceSvcPropName: ConfigNodePropertyString? = null,
    val driverClassName: ConfigNodePropertyString? = null,
    val url: ConfigNodePropertyString? = null,
    val username: ConfigNodePropertyString? = null,
    val password: ConfigNodePropertyString? = null,
    val defaultAutoCommit: ConfigNodePropertyDropDown? = null,
    val defaultReadOnly: ConfigNodePropertyDropDown? = null,
    val defaultTransactionIsolation: ConfigNodePropertyDropDown? = null,
    val defaultCatalog: ConfigNodePropertyString? = null,
    val maxActive: ConfigNodePropertyInteger? = null,
    val maxIdle: ConfigNodePropertyInteger? = null,
    val minIdle: ConfigNodePropertyInteger? = null,
    val initialSize: ConfigNodePropertyInteger? = null,
    val maxWait: ConfigNodePropertyInteger? = null,
    val maxAge: ConfigNodePropertyInteger? = null,
    val testOnBorrow: ConfigNodePropertyBoolean? = null,
    val testOnReturn: ConfigNodePropertyBoolean? = null,
    val testWhileIdle: ConfigNodePropertyBoolean? = null,
    val validationQuery: ConfigNodePropertyString? = null,
    val validationQueryTimeout: ConfigNodePropertyInteger? = null,
    val timeBetweenEvictionRunsMillis: ConfigNodePropertyInteger? = null,
    val minEvictableIdleTimeMillis: ConfigNodePropertyInteger? = null,
    val connectionProperties: ConfigNodePropertyString? = null,
    val initSQL: ConfigNodePropertyString? = null,
    val jdbcInterceptors: ConfigNodePropertyString? = null,
    val validationInterval: ConfigNodePropertyInteger? = null,
    val logValidationErrors: ConfigNodePropertyBoolean? = null,
    val datasourceSvcProperties: ConfigNodePropertyArray? = null
)
