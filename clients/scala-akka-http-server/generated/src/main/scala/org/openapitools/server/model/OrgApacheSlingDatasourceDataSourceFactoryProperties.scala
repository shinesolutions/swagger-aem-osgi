package org.openapitools.server.model


/**
 * @param datasourceName  for example: ''null''
 * @param datasourceSvcPropName  for example: ''null''
 * @param driverClassName  for example: ''null''
 * @param url  for example: ''null''
 * @param username  for example: ''null''
 * @param password  for example: ''null''
 * @param defaultAutoCommit  for example: ''null''
 * @param defaultReadOnly  for example: ''null''
 * @param defaultTransactionIsolation  for example: ''null''
 * @param defaultCatalog  for example: ''null''
 * @param maxActive  for example: ''null''
 * @param maxIdle  for example: ''null''
 * @param minIdle  for example: ''null''
 * @param initialSize  for example: ''null''
 * @param maxWait  for example: ''null''
 * @param maxAge  for example: ''null''
 * @param testOnBorrow  for example: ''null''
 * @param testOnReturn  for example: ''null''
 * @param testWhileIdle  for example: ''null''
 * @param validationQuery  for example: ''null''
 * @param validationQueryTimeout  for example: ''null''
 * @param timeBetweenEvictionRunsMillis  for example: ''null''
 * @param minEvictableIdleTimeMillis  for example: ''null''
 * @param connectionProperties  for example: ''null''
 * @param initSQL  for example: ''null''
 * @param jdbcInterceptors  for example: ''null''
 * @param validationInterval  for example: ''null''
 * @param logValidationErrors  for example: ''null''
 * @param datasourceSvcProperties  for example: ''null''
*/
final case class OrgApacheSlingDatasourceDataSourceFactoryProperties (
  datasourceName: Option[ConfigNodePropertyString] = None,
  datasourceSvcPropName: Option[ConfigNodePropertyString] = None,
  driverClassName: Option[ConfigNodePropertyString] = None,
  url: Option[ConfigNodePropertyString] = None,
  username: Option[ConfigNodePropertyString] = None,
  password: Option[ConfigNodePropertyString] = None,
  defaultAutoCommit: Option[ConfigNodePropertyDropDown] = None,
  defaultReadOnly: Option[ConfigNodePropertyDropDown] = None,
  defaultTransactionIsolation: Option[ConfigNodePropertyDropDown] = None,
  defaultCatalog: Option[ConfigNodePropertyString] = None,
  maxActive: Option[ConfigNodePropertyInteger] = None,
  maxIdle: Option[ConfigNodePropertyInteger] = None,
  minIdle: Option[ConfigNodePropertyInteger] = None,
  initialSize: Option[ConfigNodePropertyInteger] = None,
  maxWait: Option[ConfigNodePropertyInteger] = None,
  maxAge: Option[ConfigNodePropertyInteger] = None,
  testOnBorrow: Option[ConfigNodePropertyBoolean] = None,
  testOnReturn: Option[ConfigNodePropertyBoolean] = None,
  testWhileIdle: Option[ConfigNodePropertyBoolean] = None,
  validationQuery: Option[ConfigNodePropertyString] = None,
  validationQueryTimeout: Option[ConfigNodePropertyInteger] = None,
  timeBetweenEvictionRunsMillis: Option[ConfigNodePropertyInteger] = None,
  minEvictableIdleTimeMillis: Option[ConfigNodePropertyInteger] = None,
  connectionProperties: Option[ConfigNodePropertyString] = None,
  initSQL: Option[ConfigNodePropertyString] = None,
  jdbcInterceptors: Option[ConfigNodePropertyString] = None,
  validationInterval: Option[ConfigNodePropertyInteger] = None,
  logValidationErrors: Option[ConfigNodePropertyBoolean] = None,
  datasourceSvcProperties: Option[ConfigNodePropertyArray] = None
)

