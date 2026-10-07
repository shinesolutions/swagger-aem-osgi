
package org.openapitools.client.model


case class ComDayCqReplicationImplReplicatorImplProperties (
    _distributeEvents: Option[ConfigNodePropertyBoolean]
)
object ComDayCqReplicationImplReplicatorImplProperties {
    def toStringBody(var_distributeEvents: Object) =
        s"""
        | {
        | "distributeEvents":$var_distributeEvents
        | }
        """.stripMargin
}
