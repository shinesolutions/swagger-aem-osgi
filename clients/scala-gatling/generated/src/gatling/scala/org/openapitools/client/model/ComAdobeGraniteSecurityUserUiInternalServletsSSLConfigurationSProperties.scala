
package org.openapitools.client.model


case class ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteSecurityUserUiInternalServletsSSLConfigurationSProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
