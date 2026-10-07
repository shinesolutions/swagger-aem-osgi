@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(
    @field:JsonProperty("portal.outboxes")
    val portalOutboxes: ConfigNodePropertyArray? = null,

    @field:JsonProperty("draft.data.service")
    val draftDataService: ConfigNodePropertyString? = null,

    @field:JsonProperty("draft.metadata.service")
    val draftMetadataService: ConfigNodePropertyString? = null,

    @field:JsonProperty("submit.data.service")
    val submitDataService: ConfigNodePropertyString? = null,

    @field:JsonProperty("submit.metadata.service")
    val submitMetadataService: ConfigNodePropertyString? = null,

    @field:JsonProperty("pendingSign.data.service")
    val pendingSignDataService: ConfigNodePropertyString? = null,

    @field:JsonProperty("pendingSign.metadata.service")
    val pendingSignMetadataService: ConfigNodePropertyString? = null,

)
