package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqSocialUgcbaseSecurityImplDefaultAttachmentTypeBlackliProperties(
    val defaultAttachmentTypeBlacklist: ConfigNodePropertyArray? = null,
    val baselineAttachmentTypeBlacklist: ConfigNodePropertyArray? = null
)
