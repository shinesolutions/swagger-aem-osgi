
package org.openapitools.client.model


case class ComAdobeGraniteAuthImsProperties (
    _configid: Option[ConfigNodePropertyString],
    _scope: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthImsProperties {
    def toStringBody(var_configid: Object, var_scope: Object) =
        s"""
        | {
        | "configid":$var_configid,"scope":$var_scope
        | }
        """.stripMargin
}
