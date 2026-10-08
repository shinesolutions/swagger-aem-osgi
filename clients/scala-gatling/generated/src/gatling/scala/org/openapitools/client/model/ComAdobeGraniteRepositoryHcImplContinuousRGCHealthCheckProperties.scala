
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryHcImplContinuousRGCHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
