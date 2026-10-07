
package org.openapitools.client.model


case class OrgApacheAriesJmxFrameworkStateConfigProperties (
    _attributeChangeNotificationEnabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheAriesJmxFrameworkStateConfigProperties {
    def toStringBody(var_attributeChangeNotificationEnabled: Object) =
        s"""
        | {
        | "attributeChangeNotificationEnabled":$var_attributeChangeNotificationEnabled
        | }
        """.stripMargin
}
