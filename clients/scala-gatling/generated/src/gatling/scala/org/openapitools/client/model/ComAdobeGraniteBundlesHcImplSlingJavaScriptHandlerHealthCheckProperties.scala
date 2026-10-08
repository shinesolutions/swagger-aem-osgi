
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteBundlesHcImplSlingJavaScriptHandlerHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
