
package org.openapitools.client.model


case class OrgApacheFelixSystemreadyImplComponentsCheckProperties (
    _componentsList: Option[ConfigNodePropertyArray],
    _type: Option[ConfigNodePropertyDropDown]
)
object OrgApacheFelixSystemreadyImplComponentsCheckProperties {
    def toStringBody(var_componentsList: Object, var_type: Object) =
        s"""
        | {
        | "componentsList":$var_componentsList,"type":$var_type
        | }
        """.stripMargin
}
