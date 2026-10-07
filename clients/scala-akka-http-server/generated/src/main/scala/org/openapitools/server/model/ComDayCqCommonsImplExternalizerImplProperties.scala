package org.openapitools.server.model


/**
 * @param externalizerDomains  for example: ''null''
 * @param externalizerHost  for example: ''null''
 * @param externalizerContextpath  for example: ''null''
 * @param externalizerEncodedpath  for example: ''null''
*/
final case class ComDayCqCommonsImplExternalizerImplProperties (
  externalizerDomains: Option[ConfigNodePropertyArray] = None,
  externalizerHost: Option[ConfigNodePropertyString] = None,
  externalizerContextpath: Option[ConfigNodePropertyString] = None,
  externalizerEncodedpath: Option[ConfigNodePropertyBoolean] = None
)

