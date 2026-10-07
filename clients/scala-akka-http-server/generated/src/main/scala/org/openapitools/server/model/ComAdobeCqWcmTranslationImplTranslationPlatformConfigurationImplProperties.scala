package org.openapitools.server.model


/**
 * @param syncTranslationStateSchedulingFormat  for example: ''null''
 * @param schedulingRepeatTranslationSchedulingFormat  for example: ''null''
 * @param syncTranslationStateLockTimeoutInMinutes  for example: ''null''
 * @param exportFormat  for example: ''null''
*/
final case class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties (
  syncTranslationStateSchedulingFormat: Option[ConfigNodePropertyString] = None,
  schedulingRepeatTranslationSchedulingFormat: Option[ConfigNodePropertyString] = None,
  syncTranslationStateLockTimeoutInMinutes: Option[ConfigNodePropertyString] = None,
  exportFormat: Option[ConfigNodePropertyDropDown] = None
)

