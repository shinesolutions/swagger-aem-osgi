
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
