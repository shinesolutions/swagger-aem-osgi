
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryHcImplDefaultAccessUserProfileHealthCheProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
