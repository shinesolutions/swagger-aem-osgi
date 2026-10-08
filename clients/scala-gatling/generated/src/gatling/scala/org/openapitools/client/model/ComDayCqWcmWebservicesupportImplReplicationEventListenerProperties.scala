
package org.openapitools.client.model


case class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties (
    _flushAgents: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {
    def toStringBody(var_flushAgents: Object) =
        s"""
        | {
        | "flushAgents":$var_flushAgents
        | }
        """.stripMargin
}
