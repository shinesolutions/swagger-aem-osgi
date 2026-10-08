@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqHistoryImplHistoryServiceImplProperties(
    @field:JsonProperty("history.service.resourceTypes")
    val historyServiceResourceTypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("history.service.pathFilter")
    val historyServicePathFilter: ConfigNodePropertyArray? = null,

)
