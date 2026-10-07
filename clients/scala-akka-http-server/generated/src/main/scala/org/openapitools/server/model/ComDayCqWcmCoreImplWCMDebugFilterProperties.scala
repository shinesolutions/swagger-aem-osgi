package org.openapitools.server.model


/**
 * @param wcmdbgfilterEnabled  for example: ''null''
 * @param wcmdbgfilterJspDebug  for example: ''null''
*/
final case class ComDayCqWcmCoreImplWCMDebugFilterProperties (
  wcmdbgfilterEnabled: Option[ConfigNodePropertyBoolean] = None,
  wcmdbgfilterJspDebug: Option[ConfigNodePropertyBoolean] = None
)

