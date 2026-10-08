@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(
    @field:JsonProperty("inbox.impl.typeprovider.registrypaths")
    val inboxImplTypeproviderRegistrypaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("inbox.impl.typeprovider.legacypaths")
    val inboxImplTypeproviderLegacypaths: ConfigNodePropertyArray? = null,

    @field:JsonProperty("inbox.impl.typeprovider.defaulturl.failureitem")
    val inboxImplTypeproviderDefaulturlFailureitem: ConfigNodePropertyString? = null,

    @field:JsonProperty("inbox.impl.typeprovider.defaulturl.workitem")
    val inboxImplTypeproviderDefaulturlWorkitem: ConfigNodePropertyString? = null,

    @field:JsonProperty("inbox.impl.typeprovider.defaulturl.task")
    val inboxImplTypeproviderDefaulturlTask: ConfigNodePropertyString? = null,

)
