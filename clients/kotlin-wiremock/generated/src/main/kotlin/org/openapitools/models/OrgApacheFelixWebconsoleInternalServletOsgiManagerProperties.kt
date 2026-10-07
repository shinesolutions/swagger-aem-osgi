@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties(
    @field:JsonProperty("manager.root")
    val managerRoot: ConfigNodePropertyString? = null,

    @field:JsonProperty("http.service.filter")
    val httpServiceFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("default.render")
    val defaultRender: ConfigNodePropertyString? = null,

    @field:JsonProperty("realm")
    val realm: ConfigNodePropertyString? = null,

    @field:JsonProperty("username")
    val username: ConfigNodePropertyString? = null,

    @field:JsonProperty("password")
    val password: ConfigNodePropertyString? = null,

    @field:JsonProperty("category")
    val category: ConfigNodePropertyString? = null,

    @field:JsonProperty("locale")
    val locale: ConfigNodePropertyString? = null,

    @field:JsonProperty("loglevel")
    val loglevel: ConfigNodePropertyDropDown? = null,

    @field:JsonProperty("plugins")
    val plugins: ConfigNodePropertyDropDown? = null,

)
