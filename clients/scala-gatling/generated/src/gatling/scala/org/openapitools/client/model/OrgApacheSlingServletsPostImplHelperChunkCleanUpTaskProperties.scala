
package org.openapitools.client.model


case class OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _schedulerConcurrent: Option[ConfigNodePropertyBoolean],
    _chunkCleanupAge: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
    def toStringBody(var_schedulerExpression: Object, var_schedulerConcurrent: Object, var_chunkCleanupAge: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"schedulerConcurrent":$var_schedulerConcurrent,"chunkCleanupAge":$var_chunkCleanupAge
        | }
        """.stripMargin
}
