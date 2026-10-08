package org.openapitools.server.model


/**
 * @param eventTopics  for example: ''null''
 * @param eventFilter  for example: ''null''
 * @param translateListenerType  for example: ''null''
 * @param translatePropertyList  for example: ''null''
 * @param poolSize  for example: ''null''
 * @param maxPoolSize  for example: ''null''
 * @param queueSize  for example: ''null''
 * @param keepAliveTime  for example: ''null''
*/
final case class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties (
  eventTopics: Option[ConfigNodePropertyString] = None,
  eventFilter: Option[ConfigNodePropertyString] = None,
  translateListenerType: Option[ConfigNodePropertyArray] = None,
  translatePropertyList: Option[ConfigNodePropertyArray] = None,
  poolSize: Option[ConfigNodePropertyInteger] = None,
  maxPoolSize: Option[ConfigNodePropertyInteger] = None,
  queueSize: Option[ConfigNodePropertyInteger] = None,
  keepAliveTime: Option[ConfigNodePropertyInteger] = None
)

