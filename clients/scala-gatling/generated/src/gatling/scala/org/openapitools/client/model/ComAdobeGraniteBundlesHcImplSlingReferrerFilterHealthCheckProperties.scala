
package org.openapitools.client.model


case class ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteBundlesHcImplSlingReferrerFilterHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
