
package org.openapitools.client.model


case class ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties (
    _replicationContentUseFileStorage: Option[ConfigNodePropertyBoolean],
    _replicationContentMaxCommitAttempts: Option[ConfigNodePropertyInteger]
)
object ComDayCqReplicationImplReplicationContentFactoryProviderImplProperties {
    def toStringBody(var_replicationContentUseFileStorage: Object, var_replicationContentMaxCommitAttempts: Object) =
        s"""
        | {
        | "replicationContentUseFileStorage":$var_replicationContentUseFileStorage,"replicationContentMaxCommitAttempts":$var_replicationContentMaxCommitAttempts
        | }
        """.stripMargin
}
