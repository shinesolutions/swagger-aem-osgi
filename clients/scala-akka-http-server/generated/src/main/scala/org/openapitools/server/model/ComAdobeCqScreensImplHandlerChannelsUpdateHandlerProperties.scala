package org.openapitools.server.model


/**
 * @param cqPagesupdatehandlerImageresourcetypes  for example: ''null''
 * @param cqPagesupdatehandlerProductresourcetypes  for example: ''null''
 * @param cqPagesupdatehandlerVideoresourcetypes  for example: ''null''
 * @param cqPagesupdatehandlerDynamicsequenceresourcetypes  for example: ''null''
 * @param cqPagesupdatehandlerPreviewmodepaths  for example: ''null''
*/
final case class ComAdobeCqScreensImplHandlerChannelsUpdateHandlerProperties (
  cqPagesupdatehandlerImageresourcetypes: Option[ConfigNodePropertyArray] = None,
  cqPagesupdatehandlerProductresourcetypes: Option[ConfigNodePropertyArray] = None,
  cqPagesupdatehandlerVideoresourcetypes: Option[ConfigNodePropertyArray] = None,
  cqPagesupdatehandlerDynamicsequenceresourcetypes: Option[ConfigNodePropertyArray] = None,
  cqPagesupdatehandlerPreviewmodepaths: Option[ConfigNodePropertyArray] = None
)

