@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(
    @field:JsonProperty("referencesearchservlet.maxReferencesPerPage")
    val referencesearchservletMaxReferencesPerPage: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("referencesearchservlet.maxPages")
    val referencesearchservletMaxPages: ConfigNodePropertyInteger? = null,

)
