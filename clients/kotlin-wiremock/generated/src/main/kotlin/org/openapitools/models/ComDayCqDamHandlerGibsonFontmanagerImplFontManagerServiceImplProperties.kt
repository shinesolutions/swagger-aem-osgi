@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(
    @field:JsonProperty("event.filter")
    val eventFilter: ConfigNodePropertyString? = null,

    @field:JsonProperty("fontmgr.system.font.dir")
    val fontmgrSystemFontDir: ConfigNodePropertyArray? = null,

    @field:JsonProperty("fontmgr.adobe.font.dir")
    val fontmgrAdobeFontDir: ConfigNodePropertyString? = null,

    @field:JsonProperty("fontmgr.customer.font.dir")
    val fontmgrCustomerFontDir: ConfigNodePropertyString? = null,

)
