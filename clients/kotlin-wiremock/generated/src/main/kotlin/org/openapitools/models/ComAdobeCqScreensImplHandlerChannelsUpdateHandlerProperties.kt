@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties(
    @field:JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
    val cqPagesupdatehandlerImageresourcetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.pagesupdatehandler.productresourcetypes")
    val cqPagesupdatehandlerProductresourcetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.pagesupdatehandler.videoresourcetypes")
    val cqPagesupdatehandlerVideoresourcetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.pagesupdatehandler.dynamicsequenceresourcetypes")
    val cqPagesupdatehandlerDynamicsequenceresourcetypes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("cq.pagesupdatehandler.previewmodepaths")
    val cqPagesupdatehandlerPreviewmodepaths: ConfigNodePropertyArray? = null,

)
