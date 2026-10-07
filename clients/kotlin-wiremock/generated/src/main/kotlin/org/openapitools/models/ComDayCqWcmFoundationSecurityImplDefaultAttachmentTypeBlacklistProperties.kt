@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComDayCqWcmFoundationSecurityImplDefaultAttachmentTypeBlacklistProperties(
    @field:JsonProperty("default.attachment.type.blacklist")
    val defaultAttachmentTypeBlacklist: ConfigNodePropertyArray? = null,

    @field:JsonProperty("baseline.attachment.type.blacklist")
    val baselineAttachmentTypeBlacklist: ConfigNodePropertyArray? = null,

)
