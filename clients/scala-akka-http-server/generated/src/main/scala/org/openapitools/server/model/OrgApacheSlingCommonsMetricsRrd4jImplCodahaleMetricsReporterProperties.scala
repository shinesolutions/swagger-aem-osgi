package org.openapitools.server.model


/**
 * @param datasources  for example: ''null''
 * @param step  for example: ''null''
 * @param archives  for example: ''null''
 * @param path  for example: ''null''
*/
final case class OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties (
  datasources: Option[ConfigNodePropertyArray] = None,
  step: Option[ConfigNodePropertyInteger] = None,
  archives: Option[ConfigNodePropertyArray] = None,
  path: Option[ConfigNodePropertyString] = None
)

