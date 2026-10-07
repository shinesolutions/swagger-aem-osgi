package org.openapitools.server.model


/**
 * @param archivingEnabled  for example: ''null''
 * @param schedulerExpression  for example: ''null''
 * @param archiveSinceDaysCompleted  for example: ''null''
*/
final case class ComAdobeGraniteTaskmanagementImplJcrTaskArchiveServiceProperties (
  archivingEnabled: Option[ConfigNodePropertyBoolean] = None,
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  archiveSinceDaysCompleted: Option[ConfigNodePropertyInteger] = None
)

