@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWidgetImplWidgetExtensionProviderImplProperties(
    @field:JsonProperty("extendable.widgets")
    val extendableWidgets: ConfigNodePropertyArray? = null,

    @field:JsonProperty("widgetextensionprovider.debug")
    val widgetextensionproviderDebug: ConfigNodePropertyBoolean? = null,

)
