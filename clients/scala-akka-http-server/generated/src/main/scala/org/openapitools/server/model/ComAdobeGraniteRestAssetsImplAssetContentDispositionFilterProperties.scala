package org.openapitools.server.model


/**
 * @param mimeAllowEmpty  for example: ''null''
 * @param mimeAllowed  for example: ''null''
*/
final case class ComAdobeGraniteRestAssetsImplAssetContentDispositionFilterProperties (
  mimeAllowEmpty: Option[ConfigNodePropertyBoolean] = None,
  mimeAllowed: Option[ConfigNodePropertyArray] = None
)

