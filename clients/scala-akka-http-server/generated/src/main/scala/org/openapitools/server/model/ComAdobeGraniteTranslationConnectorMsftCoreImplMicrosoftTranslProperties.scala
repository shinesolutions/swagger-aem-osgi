package org.openapitools.server.model


/**
 * @param translationFactory  for example: ''null''
 * @param defaultConnectorLabel  for example: ''null''
 * @param defaultConnectorAttribution  for example: ''null''
 * @param defaultConnectorWorkspaceId  for example: ''null''
 * @param defaultConnectorSubscriptionKey  for example: ''null''
 * @param languageMapLocation  for example: ''null''
 * @param categoryMapLocation  for example: ''null''
 * @param retryAttempts  for example: ''null''
 * @param timeoutCount  for example: ''null''
*/
final case class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties (
  translationFactory: Option[ConfigNodePropertyString] = None,
  defaultConnectorLabel: Option[ConfigNodePropertyString] = None,
  defaultConnectorAttribution: Option[ConfigNodePropertyString] = None,
  defaultConnectorWorkspaceId: Option[ConfigNodePropertyString] = None,
  defaultConnectorSubscriptionKey: Option[ConfigNodePropertyString] = None,
  languageMapLocation: Option[ConfigNodePropertyString] = None,
  categoryMapLocation: Option[ConfigNodePropertyString] = None,
  retryAttempts: Option[ConfigNodePropertyInteger] = None,
  timeoutCount: Option[ConfigNodePropertyInteger] = None
)

