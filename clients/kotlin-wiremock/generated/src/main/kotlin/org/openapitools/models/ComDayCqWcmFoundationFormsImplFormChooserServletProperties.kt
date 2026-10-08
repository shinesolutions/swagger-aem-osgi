@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmFoundationFormsImplFormChooserServletProperties(
    @field:JsonProperty("service.name")
    val serviceName: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.resourceTypes")
    val slingServletResourceTypes: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.selectors")
    val slingServletSelectors: ConfigNodePropertyString? = null,

    @field:JsonProperty("sling.servlet.methods")
    val slingServletMethods: ConfigNodePropertyArray? = null,

    @field:JsonProperty("forms.formchooserservlet.advansesearch.require")
    val formsFormchooserservletAdvansesearchRequire: ConfigNodePropertyBoolean? = null,

)
