package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyBoolean
import org.openapitools.server.api.model.ConfigNodePropertyInteger
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrgApacheSlingServletsPostImplSlingPostServletProperties(
    val servletPostDateFormats: ConfigNodePropertyArray? = null,
    val servletPostNodeNameHints: ConfigNodePropertyArray? = null,
    val servletPostNodeNameMaxLength: ConfigNodePropertyInteger? = null,
    val servletPostCheckinNewVersionableNodes: ConfigNodePropertyBoolean? = null,
    val servletPostAutoCheckout: ConfigNodePropertyBoolean? = null,
    val servletPostAutoCheckin: ConfigNodePropertyBoolean? = null,
    val servletPostIgnorePattern: ConfigNodePropertyString? = null
)
