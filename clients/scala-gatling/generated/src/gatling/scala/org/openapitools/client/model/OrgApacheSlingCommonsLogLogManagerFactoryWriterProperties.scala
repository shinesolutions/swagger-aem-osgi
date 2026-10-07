
package org.openapitools.client.model


case class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties (
    _orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogFileNumber: Option[ConfigNodePropertyInteger],
    _orgApacheSlingCommonsLogFileSize: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogFileBuffered: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {
    def toStringBody(var_orgApacheSlingCommonsLogFile: Object, var_orgApacheSlingCommonsLogFileNumber: Object, var_orgApacheSlingCommonsLogFileSize: Object, var_orgApacheSlingCommonsLogFileBuffered: Object) =
        s"""
        | {
        | "orgApacheSlingCommonsLogFile":$var_orgApacheSlingCommonsLogFile,"orgApacheSlingCommonsLogFileNumber":$var_orgApacheSlingCommonsLogFileNumber,"orgApacheSlingCommonsLogFileSize":$var_orgApacheSlingCommonsLogFileSize,"orgApacheSlingCommonsLogFileBuffered":$var_orgApacheSlingCommonsLogFileBuffered
        | }
        """.stripMargin
}
