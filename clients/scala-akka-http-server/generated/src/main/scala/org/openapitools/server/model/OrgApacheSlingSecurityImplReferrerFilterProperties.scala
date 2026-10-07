package org.openapitools.server.model


/**
 * @param allowEmpty  for example: ''null''
 * @param allowHosts  for example: ''null''
 * @param allowHostsRegexp  for example: ''null''
 * @param filterMethods  for example: ''null''
 * @param excludeAgentsRegexp  for example: ''null''
*/
final case class OrgApacheSlingSecurityImplReferrerFilterProperties (
  allowEmpty: Option[ConfigNodePropertyBoolean] = None,
  allowHosts: Option[ConfigNodePropertyArray] = None,
  allowHostsRegexp: Option[ConfigNodePropertyArray] = None,
  filterMethods: Option[ConfigNodePropertyArray] = None,
  excludeAgentsRegexp: Option[ConfigNodePropertyArray] = None
)

