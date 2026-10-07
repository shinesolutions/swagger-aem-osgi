
package org.openapitools.client.model


case class ComAdobeCqHcContentPackagesHealthCheckProperties (
    _hcName: Option[ConfigNodePropertyString],
    _hcTags: Option[ConfigNodePropertyArray],
    _hcMbeanName: Option[ConfigNodePropertyString],
    _packageNames: Option[ConfigNodePropertyArray]
)
object ComAdobeCqHcContentPackagesHealthCheckProperties {
    def toStringBody(var_hcName: Object, var_hcTags: Object, var_hcMbeanName: Object, var_packageNames: Object) =
        s"""
        | {
        | "hcName":$var_hcName,"hcTags":$var_hcTags,"hcMbeanName":$var_hcMbeanName,"packageNames":$var_packageNames
        | }
        """.stripMargin
}
