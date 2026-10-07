
package org.openapitools.client.model


case class ComDayCqReplicationAuditReplicationEventListenerProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object ComDayCqReplicationAuditReplicationEventListenerProperties {
    def toStringBody(var_serviceRanking: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
