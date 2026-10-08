package org.openapitools.server.model


/**
 * @param alloworigin  for example: ''null''
 * @param alloworiginregexp  for example: ''null''
 * @param allowedpaths  for example: ''null''
 * @param exposedheaders  for example: ''null''
 * @param maxage  for example: ''null''
 * @param supportedheaders  for example: ''null''
 * @param supportedmethods  for example: ''null''
 * @param supportscredentials  for example: ''null''
*/
final case class ComAdobeGraniteCorsImplCORSPolicyImplProperties (
  alloworigin: Option[ConfigNodePropertyArray] = None,
  alloworiginregexp: Option[ConfigNodePropertyArray] = None,
  allowedpaths: Option[ConfigNodePropertyArray] = None,
  exposedheaders: Option[ConfigNodePropertyArray] = None,
  maxage: Option[ConfigNodePropertyInteger] = None,
  supportedheaders: Option[ConfigNodePropertyArray] = None,
  supportedmethods: Option[ConfigNodePropertyArray] = None,
  supportscredentials: Option[ConfigNodePropertyBoolean] = None
)

