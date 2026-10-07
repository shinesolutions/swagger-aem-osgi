
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties (
    _hcTags: Option[ConfigNodePropertyArray],
    _diskSpaceWarnThreshold: Option[ConfigNodePropertyInteger],
    _diskSpaceErrorThreshold: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties {
    def toStringBody(var_hcTags: Object, var_diskSpaceWarnThreshold: Object, var_diskSpaceErrorThreshold: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags,"diskSpaceWarnThreshold":$var_diskSpaceWarnThreshold,"diskSpaceErrorThreshold":$var_diskSpaceErrorThreshold
        | }
        """.stripMargin
}
