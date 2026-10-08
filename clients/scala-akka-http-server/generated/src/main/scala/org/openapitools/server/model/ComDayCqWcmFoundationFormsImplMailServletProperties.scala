package org.openapitools.server.model


/**
 * @param slingServletResourceTypes  for example: ''null''
 * @param slingServletSelectors  for example: ''null''
 * @param resourceWhitelist  for example: ''null''
 * @param resourceBlacklist  for example: ''null''
*/
final case class ComDayCqWcmFoundationFormsImplMailServletProperties (
  slingServletResourceTypes: Option[ConfigNodePropertyString] = None,
  slingServletSelectors: Option[ConfigNodePropertyString] = None,
  resourceWhitelist: Option[ConfigNodePropertyArray] = None,
  resourceBlacklist: Option[ConfigNodePropertyString] = None
)

