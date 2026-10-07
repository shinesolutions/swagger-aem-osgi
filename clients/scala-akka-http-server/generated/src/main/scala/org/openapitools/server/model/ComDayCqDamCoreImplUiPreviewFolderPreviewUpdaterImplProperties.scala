package org.openapitools.server.model


/**
 * @param createPreviewEnabled  for example: ''null''
 * @param updatePreviewEnabled  for example: ''null''
 * @param queueSize  for example: ''null''
 * @param folderPreviewRenditionRegex  for example: ''null''
*/
final case class ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties (
  createPreviewEnabled: Option[ConfigNodePropertyBoolean] = None,
  updatePreviewEnabled: Option[ConfigNodePropertyBoolean] = None,
  queueSize: Option[ConfigNodePropertyInteger] = None,
  folderPreviewRenditionRegex: Option[ConfigNodePropertyString] = None
)

