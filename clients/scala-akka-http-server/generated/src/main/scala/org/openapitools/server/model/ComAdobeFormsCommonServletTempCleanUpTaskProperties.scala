package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param durationForTemporaryStorage  for example: ''null''
 * @param durationForAnonymousStorage  for example: ''null''
*/
final case class ComAdobeFormsCommonServletTempCleanUpTaskProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  durationForTemporaryStorage: Option[ConfigNodePropertyString] = None,
  durationForAnonymousStorage: Option[ConfigNodePropertyString] = None
)

