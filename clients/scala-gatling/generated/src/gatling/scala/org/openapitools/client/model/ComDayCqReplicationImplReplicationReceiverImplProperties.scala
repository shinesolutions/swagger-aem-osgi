
package org.openapitools.client.model


case class ComDayCqReplicationImplReplicationReceiverImplProperties (
    _receiverTmpfileThreshold: Option[ConfigNodePropertyInteger],
    _receiverPackagesUseInstall: Option[ConfigNodePropertyBoolean]
)
object ComDayCqReplicationImplReplicationReceiverImplProperties {
    def toStringBody(var_receiverTmpfileThreshold: Object, var_receiverPackagesUseInstall: Object) =
        s"""
        | {
        | "receiverTmpfileThreshold":$var_receiverTmpfileThreshold,"receiverPackagesUseInstall":$var_receiverPackagesUseInstall
        | }
        """.stripMargin
}
