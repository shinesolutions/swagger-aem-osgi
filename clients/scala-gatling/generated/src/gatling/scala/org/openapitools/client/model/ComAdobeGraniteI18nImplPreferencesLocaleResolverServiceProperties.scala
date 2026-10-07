
package org.openapitools.client.model


case class ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties (
    _securityPreferencesName: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteI18nImplPreferencesLocaleResolverServiceProperties {
    def toStringBody(var_securityPreferencesName: Object) =
        s"""
        | {
        | "securityPreferencesName":$var_securityPreferencesName
        | }
        """.stripMargin
}
