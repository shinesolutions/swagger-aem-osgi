@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(
    @field:JsonProperty("scheduler.expression")
    val schedulerExpression: ConfigNodePropertyString? = null,

    @field:JsonProperty("jmx.objectname")
    val jmxObjectname: ConfigNodePropertyString? = null,

)
