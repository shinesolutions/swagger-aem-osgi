package org.openapitools.server.model


/**
 * @param rootPath  for example: ''null''
 * @param fixInconsistencies  for example: ''null''
*/
final case class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties (
  rootPath: Option[ConfigNodePropertyString] = None,
  fixInconsistencies: Option[ConfigNodePropertyBoolean] = None
)

