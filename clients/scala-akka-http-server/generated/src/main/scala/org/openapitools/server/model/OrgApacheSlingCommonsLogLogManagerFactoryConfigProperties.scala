package org.openapitools.server.model


/**
 * @param orgApacheSlingCommonsLogLevel  for example: ''null''
 * @param orgApacheSlingCommonsLogFile  for example: ''null''
 * @param orgApacheSlingCommonsLogPattern  for example: ''null''
 * @param orgApacheSlingCommonsLogNames  for example: ''null''
 * @param orgApacheSlingCommonsLogAdditiv  for example: ''null''
*/
final case class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties (
  orgApacheSlingCommonsLogLevel: Option[ConfigNodePropertyDropDown] = None,
  orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogPattern: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogNames: Option[ConfigNodePropertyArray] = None,
  orgApacheSlingCommonsLogAdditiv: Option[ConfigNodePropertyBoolean] = None
)

