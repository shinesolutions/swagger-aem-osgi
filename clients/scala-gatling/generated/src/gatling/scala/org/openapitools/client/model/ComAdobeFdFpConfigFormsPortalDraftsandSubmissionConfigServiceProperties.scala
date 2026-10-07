
package org.openapitools.client.model


case class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties (
    _portalOutboxes: Option[ConfigNodePropertyArray],
    _draftDataService: Option[ConfigNodePropertyString],
    _draftMetadataService: Option[ConfigNodePropertyString],
    _submitDataService: Option[ConfigNodePropertyString],
    _submitMetadataService: Option[ConfigNodePropertyString],
    _pendingSignDataService: Option[ConfigNodePropertyString],
    _pendingSignMetadataService: Option[ConfigNodePropertyString]
)
object ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties {
    def toStringBody(var_portalOutboxes: Object, var_draftDataService: Object, var_draftMetadataService: Object, var_submitDataService: Object, var_submitMetadataService: Object, var_pendingSignDataService: Object, var_pendingSignMetadataService: Object) =
        s"""
        | {
        | "portalOutboxes":$var_portalOutboxes,"draftDataService":$var_draftDataService,"draftMetadataService":$var_draftMetadataService,"submitDataService":$var_submitDataService,"submitMetadataService":$var_submitMetadataService,"pendingSignDataService":$var_pendingSignDataService,"pendingSignMetadataService":$var_pendingSignMetadataService
        | }
        """.stripMargin
}
