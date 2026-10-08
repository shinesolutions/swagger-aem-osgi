
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _excludeSearchPath: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {
    def toStringBody(var_hcTags: Object, var_excludeSearchPath: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"excludeSearchPath":$var_excludeSearchPath
        | }
        """.stripMargin
}
