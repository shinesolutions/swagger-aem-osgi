
package org.openapitools.client.model


case class OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties (
    _name: Option[ConfigNodePropertyString],
    _queue: Option[ConfigNodePropertyString],
    _dropInvalidItems: Option[ConfigNodePropertyBoolean],
    _agentTarget: Option[ConfigNodePropertyString]
)
object OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties {
    def toStringBody(var_name: Object, var_queue: Object, var_dropInvalidItems: Object, var_agentTarget: Object) =
        s"""
        | {
        | "name":$var_name,"queue":$var_queue,"dropInvalidItems":$var_dropInvalidItems,"agentTarget":$var_agentTarget
        | }
        """.stripMargin
}
