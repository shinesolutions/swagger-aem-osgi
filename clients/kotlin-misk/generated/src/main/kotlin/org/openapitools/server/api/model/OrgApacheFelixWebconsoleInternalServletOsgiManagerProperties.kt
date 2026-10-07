package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyDropDown
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(
    val managerRoot: ConfigNodePropertyString? = null,
    val httpServiceFilter: ConfigNodePropertyString? = null,
    val defaultRender: ConfigNodePropertyString? = null,
    val realm: ConfigNodePropertyString? = null,
    val username: ConfigNodePropertyString? = null,
    val password: ConfigNodePropertyString? = null,
    val category: ConfigNodePropertyString? = null,
    val locale: ConfigNodePropertyString? = null,
    val loglevel: ConfigNodePropertyDropDown? = null,
    val plugins: ConfigNodePropertyDropDown? = null
)
