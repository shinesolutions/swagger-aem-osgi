@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(
    @field:JsonProperty("cq.social.content.fragments.services.enabled")
    val cqSocialContentFragmentsServicesEnabled: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("cq.social.content.fragments.services.waitTimeSeconds")
    val cqSocialContentFragmentsServicesWaitTimeSeconds: ConfigNodePropertyInteger? = null,

)
