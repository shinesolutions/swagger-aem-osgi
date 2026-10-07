
package org.openapitools.client.model


case class ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties (
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties {
    def toStringBody(var_hcTags: Object) =
        s"""
        | {
        | "hcTags":$var_hcTags
        | }
        """.stripMargin
}
