package org.openapitools.server.model


/**
 * @param period  for example: ''null''
 * @param timeUnit  for example: ''null''
 * @param level  for example: ''null''
 * @param loggerName  for example: ''null''
 * @param prefix  for example: ''null''
 * @param pattern  for example: ''null''
 * @param registryName  for example: ''null''
*/
final case class OrgApacheSlingCommonsMetricsInternalLogReporterProperties (
  period: Option[ConfigNodePropertyInteger] = None,
  timeUnit: Option[ConfigNodePropertyDropDown] = None,
  level: Option[ConfigNodePropertyDropDown] = None,
  loggerName: Option[ConfigNodePropertyString] = None,
  prefix: Option[ConfigNodePropertyString] = None,
  pattern: Option[ConfigNodePropertyString] = None,
  registryName: Option[ConfigNodePropertyString] = None
)

