
package org.openapitools.client.model


case class ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties (
    _oauthProviderId: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthImsImplExternalUserIdMappingProviderExtensionProperties {
    def toStringBody(var_oauthProviderId: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId
        | }
        """.stripMargin
}
