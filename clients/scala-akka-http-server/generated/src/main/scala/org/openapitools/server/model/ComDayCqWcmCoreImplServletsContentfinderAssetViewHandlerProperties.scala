package org.openapitools.server.model


/**
 * @param damShowexpired  for example: ''null''
 * @param damShowhidden  for example: ''null''
 * @param tagTitleSearch  for example: ''null''
 * @param guessTotal  for example: ''null''
 * @param damExpiryProperty  for example: ''null''
*/
final case class ComDayCqWcmCoreImplServletsContentfinderAssetViewHandlerProperties (
  damShowexpired: Option[ConfigNodePropertyBoolean] = None,
  damShowhidden: Option[ConfigNodePropertyBoolean] = None,
  tagTitleSearch: Option[ConfigNodePropertyBoolean] = None,
  guessTotal: Option[ConfigNodePropertyString] = None,
  damExpiryProperty: Option[ConfigNodePropertyString] = None
)

