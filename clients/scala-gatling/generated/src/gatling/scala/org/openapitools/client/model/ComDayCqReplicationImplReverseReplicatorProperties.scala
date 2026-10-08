
package org.openapitools.client.model


case class ComDayCqReplicationImplReverseReplicatorProperties (
    _schedulerPeriod: Option[ConfigNodePropertyInteger]
)
object ComDayCqReplicationImplReverseReplicatorProperties {
    def toStringBody(var_schedulerPeriod: Object) =
        s"""
        | {
        | "schedulerPeriod":$var_schedulerPeriod
        | }
        """.stripMargin
}
