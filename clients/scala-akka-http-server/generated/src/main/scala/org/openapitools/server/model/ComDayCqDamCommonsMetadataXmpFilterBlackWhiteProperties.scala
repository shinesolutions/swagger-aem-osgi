package org.openapitools.server.model


/**
 * @param xmpFilterApplyWhitelist  for example: ''null''
 * @param xmpFilterWhitelist  for example: ''null''
 * @param xmpFilterApplyBlacklist  for example: ''null''
 * @param xmpFilterBlacklist  for example: ''null''
*/
final case class ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties (
  xmpFilterApplyWhitelist: Option[ConfigNodePropertyBoolean] = None,
  xmpFilterWhitelist: Option[ConfigNodePropertyArray] = None,
  xmpFilterApplyBlacklist: Option[ConfigNodePropertyBoolean] = None,
  xmpFilterBlacklist: Option[ConfigNodePropertyArray] = None
)

