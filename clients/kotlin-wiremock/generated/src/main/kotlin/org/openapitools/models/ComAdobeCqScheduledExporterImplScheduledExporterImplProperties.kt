@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties(
    @field:JsonProperty("include.paths")
    val includePaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("exporter.user")
    val exporterUser: ConfigNodePropertyString? = null,

)
