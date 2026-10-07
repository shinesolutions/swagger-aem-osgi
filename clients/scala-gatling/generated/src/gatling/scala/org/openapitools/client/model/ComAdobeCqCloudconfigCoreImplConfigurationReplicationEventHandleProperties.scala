
package org.openapitools.client.model


case class ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties (
    _flushAgents: Option[ConfigNodePropertyArray]
)
object ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {
    def toStringBody(var_flushAgents: Object) =
        s"""
        | {
        | "flushAgents":$var_flushAgents
        | }
        """.stripMargin
}
