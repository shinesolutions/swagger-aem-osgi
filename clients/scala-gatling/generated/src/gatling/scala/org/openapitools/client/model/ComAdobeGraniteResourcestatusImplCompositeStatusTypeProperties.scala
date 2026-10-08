
package org.openapitools.client.model


case class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties (
    _name: Option[ConfigNodePropertyString],
    _types: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {
    def toStringBody(var_name: Object, var_types: Object) =
        s"""
        | {
        | "name":$var_name,"types":$var_types
        | }
        """.stripMargin
}
