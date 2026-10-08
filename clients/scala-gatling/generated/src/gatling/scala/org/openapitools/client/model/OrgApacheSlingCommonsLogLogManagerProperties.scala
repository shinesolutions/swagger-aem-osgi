
package org.openapitools.client.model


case class OrgApacheSlingCommonsLogLogManagerProperties (
    _orgApacheSlingCommonsLogLevel: Option[ConfigNodePropertyDropDown],
    _orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogFileNumber: Option[ConfigNodePropertyInteger],
    _orgApacheSlingCommonsLogFileSize: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogPattern: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogConfigurationFile: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogPackagingDataEnabled: Option[ConfigNodePropertyBoolean],
    _orgApacheSlingCommonsLogMaxCallerDataDepth: Option[ConfigNodePropertyInteger],
    _orgApacheSlingCommonsLogMaxOldFileCountInDump: Option[ConfigNodePropertyInteger],
    _orgApacheSlingCommonsLogNumOfLines: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingCommonsLogLogManagerProperties {
    def toStringBody(var_orgApacheSlingCommonsLogLevel: Object, var_orgApacheSlingCommonsLogFile: Object, var_orgApacheSlingCommonsLogFileNumber: Object, var_orgApacheSlingCommonsLogFileSize: Object, var_orgApacheSlingCommonsLogPattern: Object, var_orgApacheSlingCommonsLogConfigurationFile: Object, var_orgApacheSlingCommonsLogPackagingDataEnabled: Object, var_orgApacheSlingCommonsLogMaxCallerDataDepth: Object, var_orgApacheSlingCommonsLogMaxOldFileCountInDump: Object, var_orgApacheSlingCommonsLogNumOfLines: Object) =
        s"""
        | {
        | "orgApacheSlingCommonsLogLevel":$var_orgApacheSlingCommonsLogLevel,"orgApacheSlingCommonsLogFile":$var_orgApacheSlingCommonsLogFile,"orgApacheSlingCommonsLogFileNumber":$var_orgApacheSlingCommonsLogFileNumber,"orgApacheSlingCommonsLogFileSize":$var_orgApacheSlingCommonsLogFileSize,"orgApacheSlingCommonsLogPattern":$var_orgApacheSlingCommonsLogPattern,"orgApacheSlingCommonsLogConfigurationFile":$var_orgApacheSlingCommonsLogConfigurationFile,"orgApacheSlingCommonsLogPackagingDataEnabled":$var_orgApacheSlingCommonsLogPackagingDataEnabled,"orgApacheSlingCommonsLogMaxCallerDataDepth":$var_orgApacheSlingCommonsLogMaxCallerDataDepth,"orgApacheSlingCommonsLogMaxOldFileCountInDump":$var_orgApacheSlingCommonsLogMaxOldFileCountInDump,"orgApacheSlingCommonsLogNumOfLines":$var_orgApacheSlingCommonsLogNumOfLines
        | }
        """.stripMargin
}
