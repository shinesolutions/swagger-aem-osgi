
package org.openapitools.client.model


case class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties (
    _providerRoot: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {
    def toStringBody(var_providerRoot: Object) =
        s"""
        | {
        | "providerRoot":$var_providerRoot
        | }
        """.stripMargin
}
