
package org.openapitools.client.model


case class OrgApacheFelixSystemreadyImplServicesCheckProperties (
    _servicesList: Option[ConfigNodePropertyArray],
    _type: Option[ConfigNodePropertyDropDown]
)
object OrgApacheFelixSystemreadyImplServicesCheckProperties {
    def toStringBody(var_servicesList: Object, var_type: Object) =
        s"""
        | {
        | "servicesList":$var_servicesList,"type":$var_type
        | }
        """.stripMargin
}
