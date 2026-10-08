
package org.openapitools.client.model


case class ComAdobeGraniteRestImplServletDefaultGETServletProperties (
    _defaultLimit: Option[ConfigNodePropertyInteger],
    _useAbsoluteUri: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteRestImplServletDefaultGETServletProperties {
    def toStringBody(var_defaultLimit: Object, var_useAbsoluteUri: Object) =
        s"""
        | {
        | "defaultLimit":$var_defaultLimit,"useAbsoluteUri":$var_useAbsoluteUri
        | }
        """.stripMargin
}
