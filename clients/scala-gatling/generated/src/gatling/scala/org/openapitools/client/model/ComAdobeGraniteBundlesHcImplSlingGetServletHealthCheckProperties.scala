
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteBundlesHcImplSlingGetServletHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
