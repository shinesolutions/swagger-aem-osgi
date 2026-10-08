@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties(
    @field:JsonProperty("group2member.relationship.outgoing")
    val group2memberRelationshipOutgoing: ConfigNodePropertyString? = null,

    @field:JsonProperty("group2member.excluded.outgoing")
    val group2memberExcludedOutgoing: ConfigNodePropertyArray? = null,

    @field:JsonProperty("group2member.relationship.incoming")
    val group2memberRelationshipIncoming: ConfigNodePropertyString? = null,

    @field:JsonProperty("group2member.excluded.incoming")
    val group2memberExcludedIncoming: ConfigNodePropertyArray? = null,

)
