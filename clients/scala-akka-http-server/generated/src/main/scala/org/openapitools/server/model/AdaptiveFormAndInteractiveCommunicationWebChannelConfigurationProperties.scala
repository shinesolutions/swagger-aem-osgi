package org.openapitools.server.model


/**
 * @param showPlaceholder  for example: ''null''
 * @param maximumCacheEntries  for example: ''null''
 * @param afScriptingCompatversion  for example: ''null''
 * @param makeFileNameUnique  for example: ''null''
 * @param generatingCompliantData  for example: ''null''
*/
final case class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties (
  showPlaceholder: Option[ConfigNodePropertyBoolean] = None,
  maximumCacheEntries: Option[ConfigNodePropertyInteger] = None,
  afScriptingCompatversion: Option[ConfigNodePropertyDropDown] = None,
  makeFileNameUnique: Option[ConfigNodePropertyBoolean] = None,
  generatingCompliantData: Option[ConfigNodePropertyBoolean] = None
)

