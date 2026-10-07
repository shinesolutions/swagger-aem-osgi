@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingDatasourceDataSourceFactoryProperties(
    @field:JsonProperty("datasource.name")
    val datasourceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("datasource.svc.prop.name")
    val datasourceSvcPropName: ConfigNodePropertyString? = null,

    @field:JsonProperty("driverClassName")
    val driverClassName: ConfigNodePropertyString? = null,

    @field:JsonProperty("url")
    val url: ConfigNodePropertyString? = null,

    @field:JsonProperty("username")
    val username: ConfigNodePropertyString? = null,

    @field:JsonProperty("password")
    val password: ConfigNodePropertyString? = null,

    @field:JsonProperty("defaultAutoCommit")
    val defaultAutoCommit: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("defaultReadOnly")
    val defaultReadOnly: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("defaultTransactionIsolation")
    val defaultTransactionIsolation: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("defaultCatalog")
    val defaultCatalog: ConfigNodePropertyString? = null,

    @field:JsonProperty("maxActive")
    val maxActive: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxIdle")
    val maxIdle: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("minIdle")
    val minIdle: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("initialSize")
    val initialSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxWait")
    val maxWait: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxAge")
    val maxAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("testOnBorrow")
    val testOnBorrow: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("testOnReturn")
    val testOnReturn: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("testWhileIdle")
    val testWhileIdle: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("validationQuery")
    val validationQuery: ConfigNodePropertyString? = null,

    @field:JsonProperty("validationQueryTimeout")
    val validationQueryTimeout: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("timeBetweenEvictionRunsMillis")
    val timeBetweenEvictionRunsMillis: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("minEvictableIdleTimeMillis")
    val minEvictableIdleTimeMillis: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("connectionProperties")
    val connectionProperties: ConfigNodePropertyString? = null,

    @field:JsonProperty("initSQL")
    val initSQL: ConfigNodePropertyString? = null,

    @field:JsonProperty("jdbcInterceptors")
    val jdbcInterceptors: ConfigNodePropertyString? = null,

    @field:JsonProperty("validationInterval")
    val validationInterval: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("logValidationErrors")
    val logValidationErrors: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("datasource.svc.properties")
    val datasourceSvcProperties: ConfigNodePropertyArray? = null,

)
