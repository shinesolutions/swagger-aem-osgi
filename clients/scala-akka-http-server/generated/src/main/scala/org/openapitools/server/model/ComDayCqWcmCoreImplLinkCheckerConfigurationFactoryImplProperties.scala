package org.openapitools.server.model


/**
 * @param linkExpiredPrefix  for example: ''null''
 * @param linkExpiredRemove  for example: ''null''
 * @param linkExpiredSuffix  for example: ''null''
 * @param linkInvalidPrefix  for example: ''null''
 * @param linkInvalidRemove  for example: ''null''
 * @param linkInvalidSuffix  for example: ''null''
 * @param linkPredatedPrefix  for example: ''null''
 * @param linkPredatedRemove  for example: ''null''
 * @param linkPredatedSuffix  for example: ''null''
 * @param linkWcmmodes  for example: ''null''
*/
final case class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties (
  linkExpiredPrefix: Option[ConfigNodePropertyString] = None,
  linkExpiredRemove: Option[ConfigNodePropertyBoolean] = None,
  linkExpiredSuffix: Option[ConfigNodePropertyString] = None,
  linkInvalidPrefix: Option[ConfigNodePropertyString] = None,
  linkInvalidRemove: Option[ConfigNodePropertyBoolean] = None,
  linkInvalidSuffix: Option[ConfigNodePropertyString] = None,
  linkPredatedPrefix: Option[ConfigNodePropertyString] = None,
  linkPredatedRemove: Option[ConfigNodePropertyBoolean] = None,
  linkPredatedSuffix: Option[ConfigNodePropertyString] = None,
  linkWcmmodes: Option[ConfigNodePropertyArray] = None
)

