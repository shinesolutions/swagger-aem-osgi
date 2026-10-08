package org.openapitools.server.model


/**
 * @param cqDamMissingmetadataNotificationSchedulerIstimebased  for example: ''null''
 * @param cqDamMissingmetadataNotificationSchedulerTimebasedRule  for example: ''null''
 * @param cqDamMissingmetadataNotificationSchedulerPeriodRule  for example: ''null''
 * @param cqDamMissingmetadataNotificationRecipient  for example: ''null''
*/
final case class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties (
  cqDamMissingmetadataNotificationSchedulerIstimebased: Option[ConfigNodePropertyBoolean] = None,
  cqDamMissingmetadataNotificationSchedulerTimebasedRule: Option[ConfigNodePropertyString] = None,
  cqDamMissingmetadataNotificationSchedulerPeriodRule: Option[ConfigNodePropertyInteger] = None,
  cqDamMissingmetadataNotificationRecipient: Option[ConfigNodePropertyString] = None
)

