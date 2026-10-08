
package org.openapitools.client.model


case class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties (
    _featureName: Option[ConfigNodePropertyString],
    _featureDescription: Option[ConfigNodePropertyString],
    _httpHeaderName: Option[ConfigNodePropertyString],
    _httpHeaderValuepattern: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    def toStringBody(var_featureName: Object, var_featureDescription: Object, var_httpHeaderName: Object, var_httpHeaderValuepattern: Object) =
        s"""
        | {
        | "featureName":$var_featureName,"featureDescription":$var_featureDescription,"httpHeaderName":$var_httpHeaderName,"httpHeaderValuepattern":$var_httpHeaderValuepattern
        | }
        """.stripMargin
}
