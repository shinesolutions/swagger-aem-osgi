
package org.openapitools.client.model


case class ComDayCqReplicationImplAgentManagerImplProperties (
    _jobTopics: Option[ConfigNodePropertyString],
    _serviceUserTarget: Option[ConfigNodePropertyString],
    _agentProviderTarget: Option[ConfigNodePropertyString]
)
object ComDayCqReplicationImplAgentManagerImplProperties {
    def toStringBody(var_jobTopics: Object, var_serviceUserTarget: Object, var_agentProviderTarget: Object) =
        s"""
        | {
        | "jobTopics":$var_jobTopics,"serviceUserTarget":$var_serviceUserTarget,"agentProviderTarget":$var_agentProviderTarget
        | }
        """.stripMargin
}
