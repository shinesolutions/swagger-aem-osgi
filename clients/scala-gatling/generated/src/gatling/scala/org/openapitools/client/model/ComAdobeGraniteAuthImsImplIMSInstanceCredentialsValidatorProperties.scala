
package org.openapitools.client.model


case class ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties (
    _oauthProviderId: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthImsImplIMSInstanceCredentialsValidatorProperties {
    def toStringBody(var_oauthProviderId: Object) =
        s"""
        | {
        | "oauthProviderId":$var_oauthProviderId
        | }
        """.stripMargin
}
