
package org.openapitools.client.model


case class ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties (
    _dmreplicateonmodifyEnabled: Option[ConfigNodePropertyBoolean],
    _dmreplicateonmodifyForcesyncdeletes: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties {
    def toStringBody(var_dmreplicateonmodifyEnabled: Object, var_dmreplicateonmodifyForcesyncdeletes: Object) =
        s"""
        | {
        | "dmreplicateonmodifyEnabled":$var_dmreplicateonmodifyEnabled,"dmreplicateonmodifyForcesyncdeletes":$var_dmreplicateonmodifyForcesyncdeletes
        | }
        """.stripMargin
}
