package org.openapitools.server.model


/**
 * @param portalOutboxes  for example: ''null''
 * @param draftDataService  for example: ''null''
 * @param draftMetadataService  for example: ''null''
 * @param submitDataService  for example: ''null''
 * @param submitMetadataService  for example: ''null''
 * @param pendingSignDataService  for example: ''null''
 * @param pendingSignMetadataService  for example: ''null''
*/
final case class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties (
  portalOutboxes: Option[ConfigNodePropertyArray] = None,
  draftDataService: Option[ConfigNodePropertyString] = None,
  draftMetadataService: Option[ConfigNodePropertyString] = None,
  submitDataService: Option[ConfigNodePropertyString] = None,
  submitMetadataService: Option[ConfigNodePropertyString] = None,
  pendingSignDataService: Option[ConfigNodePropertyString] = None,
  pendingSignMetadataService: Option[ConfigNodePropertyString] = None
)

