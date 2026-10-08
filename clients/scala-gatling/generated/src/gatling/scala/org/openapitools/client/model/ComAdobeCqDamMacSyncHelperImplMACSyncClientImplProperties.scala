
package org.openapitools.client.model


case class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties (
    _comAdobeDamMacSyncClientSoTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties {
    def toStringBody(var_comAdobeDamMacSyncClientSoTimeout: Object) =
        s"""
        | {
        | "comAdobeDamMacSyncClientSoTimeout":$var_comAdobeDamMacSyncClientSoTimeout
        | }
        """.stripMargin
}
