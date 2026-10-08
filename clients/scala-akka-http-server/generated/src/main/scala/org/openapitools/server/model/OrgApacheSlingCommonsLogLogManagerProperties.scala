package org.openapitools.server.model


/**
 * @param orgApacheSlingCommonsLogLevel  for example: ''null''
 * @param orgApacheSlingCommonsLogFile  for example: ''null''
 * @param orgApacheSlingCommonsLogFileNumber  for example: ''null''
 * @param orgApacheSlingCommonsLogFileSize  for example: ''null''
 * @param orgApacheSlingCommonsLogPattern  for example: ''null''
 * @param orgApacheSlingCommonsLogConfigurationFile  for example: ''null''
 * @param orgApacheSlingCommonsLogPackagingDataEnabled  for example: ''null''
 * @param orgApacheSlingCommonsLogMaxCallerDataDepth  for example: ''null''
 * @param orgApacheSlingCommonsLogMaxOldFileCountInDump  for example: ''null''
 * @param orgApacheSlingCommonsLogNumOfLines  for example: ''null''
*/
final case class OrgApacheSlingCommonsLogLogManagerProperties (
  orgApacheSlingCommonsLogLevel: Option[ConfigNodePropertyDropDown] = None,
  orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogFileNumber: Option[ConfigNodePropertyInteger] = None,
  orgApacheSlingCommonsLogFileSize: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogPattern: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogConfigurationFile: Option[ConfigNodePropertyString] = None,
  orgApacheSlingCommonsLogPackagingDataEnabled: Option[ConfigNodePropertyBoolean] = None,
  orgApacheSlingCommonsLogMaxCallerDataDepth: Option[ConfigNodePropertyInteger] = None,
  orgApacheSlingCommonsLogMaxOldFileCountInDump: Option[ConfigNodePropertyInteger] = None,
  orgApacheSlingCommonsLogNumOfLines: Option[ConfigNodePropertyInteger] = None
)

