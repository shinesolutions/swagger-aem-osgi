
package org.openapitools.client.model


case class ComAdobeGraniteFragsImplRandomFeatureProperties (
    _featureName: Option[ConfigNodePropertyString],
    _featureDescription: Option[ConfigNodePropertyString],
    _activePercentage: Option[ConfigNodePropertyString],
    _cookieName: Option[ConfigNodePropertyString],
    _cookieMaxAge: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteFragsImplRandomFeatureProperties {
    def toStringBody(var_featureName: Object, var_featureDescription: Object, var_activePercentage: Object, var_cookieName: Object, var_cookieMaxAge: Object) =
        s"""
        | {
        | "featureName":$var_featureName,"featureDescription":$var_featureDescription,"activePercentage":$var_activePercentage,"cookieName":$var_cookieName,"cookieMaxAge":$var_cookieMaxAge
        | }
        """.stripMargin
}
