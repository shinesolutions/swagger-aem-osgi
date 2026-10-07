package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConfigNodePropertyArray
import org.openapitools.server.api.model.ConfigNodePropertyString
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(
    val portalOutboxes: ConfigNodePropertyArray? = null,
    val draftDataService: ConfigNodePropertyString? = null,
    val draftMetadataService: ConfigNodePropertyString? = null,
    val submitDataService: ConfigNodePropertyString? = null,
    val submitMetadataService: ConfigNodePropertyString? = null,
    val pendingSignDataService: ConfigNodePropertyString? = null,
    val pendingSignMetadataService: ConfigNodePropertyString? = null
)
