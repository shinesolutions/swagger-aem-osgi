package org.openapitools.server.model


/**
 * @param cqDamExpiryNotificationSchedulerIstimebased  for example: ''null''
 * @param cqDamExpiryNotificationSchedulerTimebasedRule  for example: ''null''
 * @param cqDamExpiryNotificationSchedulerPeriodRule  for example: ''null''
 * @param sendEmail  for example: ''null''
 * @param assetExpiredLimit  for example: ''null''
 * @param priorNotificationSeconds  for example: ''null''
 * @param cqDamExpiryNotificationUrlProtocol  for example: ''null''
*/
final case class ComDayCqDamCoreImplExpiryNotificationJobImplProperties (
  cqDamExpiryNotificationSchedulerIstimebased: Option[ConfigNodePropertyBoolean] = None,
  cqDamExpiryNotificationSchedulerTimebasedRule: Option[ConfigNodePropertyString] = None,
  cqDamExpiryNotificationSchedulerPeriodRule: Option[ConfigNodePropertyInteger] = None,
  sendEmail: Option[ConfigNodePropertyBoolean] = None,
  assetExpiredLimit: Option[ConfigNodePropertyInteger] = None,
  priorNotificationSeconds: Option[ConfigNodePropertyInteger] = None,
  cqDamExpiryNotificationUrlProtocol: Option[ConfigNodePropertyString] = None
)

