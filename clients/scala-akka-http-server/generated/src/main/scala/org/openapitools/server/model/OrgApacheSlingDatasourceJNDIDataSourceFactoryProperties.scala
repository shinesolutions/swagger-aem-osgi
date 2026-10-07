package org.openapitools.server.model


/**
 * @param datasourceName  for example: ''null''
 * @param datasourceSvcPropName  for example: ''null''
 * @param datasourceJndiName  for example: ''null''
 * @param jndiProperties  for example: ''null''
*/
final case class OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties (
  datasourceName: Option[ConfigNodePropertyString] = None,
  datasourceSvcPropName: Option[ConfigNodePropertyString] = None,
  datasourceJndiName: Option[ConfigNodePropertyString] = None,
  jndiProperties: Option[ConfigNodePropertyArray] = None
)

