package org.openapitools.server.model


/**
 * @param jdbcDriverClass  for example: ''null''
 * @param jdbcConnectionUri  for example: ''null''
 * @param jdbcUsername  for example: ''null''
 * @param jdbcPassword  for example: ''null''
 * @param jdbcValidationQuery  for example: ''null''
 * @param defaultReadonly  for example: ''null''
 * @param defaultAutocommit  for example: ''null''
 * @param poolSize  for example: ''null''
 * @param poolMaxWaitMsec  for example: ''null''
 * @param datasourceName  for example: ''null''
 * @param datasourceSvcProperties  for example: ''null''
*/
final case class ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties (
  jdbcDriverClass: Option[ConfigNodePropertyString] = None,
  jdbcConnectionUri: Option[ConfigNodePropertyString] = None,
  jdbcUsername: Option[ConfigNodePropertyString] = None,
  jdbcPassword: Option[ConfigNodePropertyString] = None,
  jdbcValidationQuery: Option[ConfigNodePropertyString] = None,
  defaultReadonly: Option[ConfigNodePropertyBoolean] = None,
  defaultAutocommit: Option[ConfigNodePropertyBoolean] = None,
  poolSize: Option[ConfigNodePropertyInteger] = None,
  poolMaxWaitMsec: Option[ConfigNodePropertyInteger] = None,
  datasourceName: Option[ConfigNodePropertyString] = None,
  datasourceSvcProperties: Option[ConfigNodePropertyArray] = None
)

