package org.openapitools.server.model


/**
 * @param scriptFilename  for example: ''null''
 * @param scriptDisplay  for example: ''null''
 * @param scriptPath  for example: ''null''
 * @param scriptPlatform  for example: ''null''
 * @param interval  for example: ''null''
 * @param jmxdomain  for example: ''null''
*/
final case class ComAdobeGraniteMonitoringImplScriptConfigImplProperties (
  scriptFilename: Option[ConfigNodePropertyString] = None,
  scriptDisplay: Option[ConfigNodePropertyString] = None,
  scriptPath: Option[ConfigNodePropertyString] = None,
  scriptPlatform: Option[ConfigNodePropertyArray] = None,
  interval: Option[ConfigNodePropertyInteger] = None,
  jmxdomain: Option[ConfigNodePropertyString] = None
)

