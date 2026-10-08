package org.openapitools.server.model


/**
 * @param graniteInfocollectorIncludeThreadDumps  for example: ''null''
 * @param graniteInfocollectorIncludeHeapDump  for example: ''null''
*/
final case class ComAdobeGraniteInfocollectorInfoCollectorProperties (
  graniteInfocollectorIncludeThreadDumps: Option[ConfigNodePropertyBoolean] = None,
  graniteInfocollectorIncludeHeapDump: Option[ConfigNodePropertyBoolean] = None
)

