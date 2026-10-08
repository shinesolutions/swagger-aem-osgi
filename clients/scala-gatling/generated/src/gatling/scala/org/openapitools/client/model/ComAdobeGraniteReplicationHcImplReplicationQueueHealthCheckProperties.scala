
package org.openapitools.client.model


case class ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties (
    _numberOfRetriesAllowed: Option[ConfigNodePropertyInteger],
    _hcTags: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteReplicationHcImplReplicationQueueHealthCheckProperties {
    def toStringBody(var_numberOfRetriesAllowed: Object, var_hcTags: Object) =
        s"""
        | {
        | "numberOfRetriesAllowed":$var_numberOfRetriesAllowed,"hcTags":$var_hcTags
        | }
        """.stripMargin
}
