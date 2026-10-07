@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(
    @field:JsonProperty("name")
    val name: ConfigNodePropertyString? = null,

    @field:JsonProperty("minPoolSize")
    val minPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxPoolSize")
    val maxPoolSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("queueSize")
    val queueSize: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("maxThreadAge")
    val maxThreadAge: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("keepAliveTime")
    val keepAliveTime: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("blockPolicy")
    val blockPolicy: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("shutdownGraceful")
    val shutdownGraceful: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("daemon")
    val daemon: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("shutdownWaitTime")
    val shutdownWaitTime: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("priority")
    val priority: ConfigNodePropertyDropDown? = null,

)
