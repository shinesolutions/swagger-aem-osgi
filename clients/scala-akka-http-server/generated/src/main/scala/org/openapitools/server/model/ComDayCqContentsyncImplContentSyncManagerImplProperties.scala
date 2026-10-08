package org.openapitools.server.model


/**
 * @param contentsyncFallbackAuthorizable  for example: ''null''
 * @param contentsyncFallbackUpdateuser  for example: ''null''
*/
final case class ComDayCqContentsyncImplContentSyncManagerImplProperties (
  contentsyncFallbackAuthorizable: Option[ConfigNodePropertyString] = None,
  contentsyncFallbackUpdateuser: Option[ConfigNodePropertyString] = None
)

