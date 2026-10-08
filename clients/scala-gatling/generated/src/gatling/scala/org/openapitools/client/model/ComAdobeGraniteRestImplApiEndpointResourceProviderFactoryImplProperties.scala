
package org.openapitools.client.model


case class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties (
    _providerRoots: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {
    def toStringBody(var_providerRoots: Object) =
        s"""
        | {
        | "providerRoots":$var_providerRoots
        | }
        """.stripMargin
}
