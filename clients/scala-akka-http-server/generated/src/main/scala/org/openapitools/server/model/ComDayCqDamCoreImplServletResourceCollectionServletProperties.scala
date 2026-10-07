package org.openapitools.server.model


/**
 * @param slingServletResourceTypes  for example: ''null''
 * @param slingServletMethods  for example: ''null''
 * @param slingServletSelectors  for example: ''null''
 * @param downloadConfig  for example: ''null''
 * @param viewSelector  for example: ''null''
 * @param sendEmail  for example: ''null''
*/
final case class ComDayCqDamCoreImplServletResourceCollectionServletProperties (
  slingServletResourceTypes: Option[ConfigNodePropertyArray] = None,
  slingServletMethods: Option[ConfigNodePropertyString] = None,
  slingServletSelectors: Option[ConfigNodePropertyString] = None,
  downloadConfig: Option[ConfigNodePropertyString] = None,
  viewSelector: Option[ConfigNodePropertyString] = None,
  sendEmail: Option[ConfigNodePropertyBoolean] = None
)

