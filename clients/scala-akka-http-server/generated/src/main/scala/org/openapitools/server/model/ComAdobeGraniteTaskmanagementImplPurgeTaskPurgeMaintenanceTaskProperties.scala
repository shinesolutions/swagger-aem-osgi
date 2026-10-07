package org.openapitools.server.model


/**
 * @param purgeCompleted  for example: ''null''
 * @param completedAge  for example: ''null''
 * @param purgeActive  for example: ''null''
 * @param activeAge  for example: ''null''
 * @param saveThreshold  for example: ''null''
*/
final case class ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties (
  purgeCompleted: Option[ConfigNodePropertyBoolean] = None,
  completedAge: Option[ConfigNodePropertyInteger] = None,
  purgeActive: Option[ConfigNodePropertyBoolean] = None,
  activeAge: Option[ConfigNodePropertyInteger] = None,
  saveThreshold: Option[ConfigNodePropertyInteger] = None
)

