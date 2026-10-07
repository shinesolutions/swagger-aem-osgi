package org.openapitools.server.model


/**
 * @param orgApacheSlingCommonsLogFile  for example: ''null''
 * @param orgApacheSlingCommonsLogFileNumber  for example: ''null''
 * @param orgApacheSlingCommonsLogFileSize  for example: ''null''
 * @param orgApacheSlingCommonsLogFileBuffered  for example: ''null''
*/
final case class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties (
  orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogFileNumber: Option[ConfigNodePropertyInteger] = None,
  orgApacheSlingCommonsLogFileSize: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogFileBuffered: Option[ConfigNodePropertyBoolean] = None
)

