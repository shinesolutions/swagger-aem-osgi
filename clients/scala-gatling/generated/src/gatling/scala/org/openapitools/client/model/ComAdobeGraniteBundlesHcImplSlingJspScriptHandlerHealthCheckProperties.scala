
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteBundlesHcImplSlingJspScriptHandlerHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
