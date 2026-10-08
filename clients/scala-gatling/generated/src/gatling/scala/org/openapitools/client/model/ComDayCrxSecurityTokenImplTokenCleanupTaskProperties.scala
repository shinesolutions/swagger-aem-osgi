
package org.openapitools.client.model


case class ComDayCrxSecurityTokenImplTokenCleanupTaskProperties (
    _enableTokenCleanupTask: Option[ConfigNodePropertyBoolean],
    _schedulerExpression: Option[ConfigNodePropertyString],
    _batchSize: Option[ConfigNodePropertyInteger]
)
object ComDayCrxSecurityTokenImplTokenCleanupTaskProperties {
    def toStringBody(var_enableTokenCleanupTask: Object, var_schedulerExpression: Object, var_batchSize: Object) =
        s"""
        | {
        | "enableTokenCleanupTask":$var_enableTokenCleanupTask,"schedulerExpression":$var_schedulerExpression,"batchSize":$var_batchSize
        | }
        """.stripMargin
}
