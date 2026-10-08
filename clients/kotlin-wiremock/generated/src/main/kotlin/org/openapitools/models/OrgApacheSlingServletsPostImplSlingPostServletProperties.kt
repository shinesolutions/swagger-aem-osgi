@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrgApacheSlingServletsPostImplSlingPostServletProperties(
    @field:JsonProperty("servlet.post.dateFormats")
    val servletPostDateFormats: ConfigNodePropertyArray? = null,

    @field:JsonProperty("servlet.post.nodeNameHints")
    val servletPostNodeNameHints: ConfigNodePropertyArray? = null,

    @field:JsonProperty("servlet.post.nodeNameMaxLength")
    val servletPostNodeNameMaxLength: ConfigNodePropertyInteger? = null,

    @field:JsonProperty("servlet.post.checkinNewVersionableNodes")
    val servletPostCheckinNewVersionableNodes: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("servlet.post.autoCheckout")
    val servletPostAutoCheckout: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("servlet.post.autoCheckin")
    val servletPostAutoCheckin: ConfigNodePropertyBoolean? = null,

    @field:JsonProperty("servlet.post.ignorePattern")
    val servletPostIgnorePattern: ConfigNodePropertyString? = null,

)
