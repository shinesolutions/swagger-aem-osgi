package org.openapitools.server.model


/**
 * @param translateLanguage  for example: ''null''
 * @param translateDisplay  for example: ''null''
 * @param translateAttribution  for example: ''null''
 * @param translateCaching  for example: ''null''
 * @param translateSmartRendering  for example: ''null''
 * @param translateCachingDuration  for example: ''null''
 * @param translateSessionSaveInterval  for example: ''null''
 * @param translateSessionSaveBatchLimit  for example: ''null''
*/
final case class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties (
  translateLanguage: Option[ConfigNodePropertyDropDown] = None,
  translateDisplay: Option[ConfigNodePropertyDropDown] = None,
  translateAttribution: Option[ConfigNodePropertyBoolean] = None,
  translateCaching: Option[ConfigNodePropertyDropDown] = None,
  translateSmartRendering: Option[ConfigNodePropertyDropDown] = None,
  translateCachingDuration: Option[ConfigNodePropertyString] = None,
  translateSessionSaveInterval: Option[ConfigNodePropertyString] = None,
  translateSessionSaveBatchLimit: Option[ConfigNodePropertyString] = None
)

