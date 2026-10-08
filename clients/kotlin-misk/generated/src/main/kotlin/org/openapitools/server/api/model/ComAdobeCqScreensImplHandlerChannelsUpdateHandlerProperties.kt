package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(
    val cqPagesupdatehandlerImageresourcetypes: ConfigNodePropertyArray? = null,
    val cqPagesupdatehandlerProductresourcetypes: ConfigNodePropertyArray? = null,
    val cqPagesupdatehandlerVideoresourcetypes: ConfigNodePropertyArray? = null,
    val cqPagesupdatehandlerDynamicsequenceresourcetypes: ConfigNodePropertyArray? = null,
    val cqPagesupdatehandlerPreviewmodepaths: ConfigNodePropertyArray? = null
)
