
package org.openapitools.client.model


case class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties (
    _orgApacheSlingCommonsLogLevel: Option[ConfigNodePropertyDropDown],
    _orgApacheSlingCommonsLogFile: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogPattern: Option[ConfigNodePropertyString],
    _orgApacheSlingCommonsLogNames: Option[ConfigNodePropertyArray],
    _orgApacheSlingCommonsLogAdditiv: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {
    def toStringBody(var_orgApacheSlingCommonsLogLevel: Object, var_orgApacheSlingCommonsLogFile: Object, var_orgApacheSlingCommonsLogPattern: Object, var_orgApacheSlingCommonsLogNames: Object, var_orgApacheSlingCommonsLogAdditiv: Object) =
        s"""
        | {
        | "orgApacheSlingCommonsLogLevel":$var_orgApacheSlingCommonsLogLevel,"orgApacheSlingCommonsLogFile":$var_orgApacheSlingCommonsLogFile,"orgApacheSlingCommonsLogPattern":$var_orgApacheSlingCommonsLogPattern,"orgApacheSlingCommonsLogNames":$var_orgApacheSlingCommonsLogNames,"orgApacheSlingCommonsLogAdditiv":$var_orgApacheSlingCommonsLogAdditiv
        | }
        """.stripMargin
}
