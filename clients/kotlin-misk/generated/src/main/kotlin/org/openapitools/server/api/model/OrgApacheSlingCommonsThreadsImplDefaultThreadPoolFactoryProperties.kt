package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties(
    val name: ConfigNodePropertyString? = null,
    val minPoolSize: ConfigNodePropertyInteger? = null,
    val maxPoolSize: ConfigNodePropertyInteger? = null,
    val queueSize: ConfigNodePropertyInteger? = null,
    val maxThreadAge: ConfigNodePropertyInteger? = null,
    val keepAliveTime: ConfigNodePropertyInteger? = null,
    val blockPolicy: ConfigNodePropertyDropDown? = null,
    val shutdownGraceful: ConfigNodePropertyBoolean? = null,
    val daemon: ConfigNodePropertyBoolean? = null,
    val shutdownWaitTime: ConfigNodePropertyInteger? = null,
    val priority: ConfigNodePropertyDropDown? = null
)
