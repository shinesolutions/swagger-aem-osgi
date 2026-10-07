
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties (
    _cqWorkflowConfigWorkflowPackagesRootPath: Option[ConfigNodePropertyArray],
    _cqWorkflowConfigWorkflowProcessLegacyMode: Option[ConfigNodePropertyBoolean],
    _cqWorkflowConfigAllowLocking: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteWorkflowCoreWorkflowConfigProperties {
    def toStringBody(var_cqWorkflowConfigWorkflowPackagesRootPath: Object, var_cqWorkflowConfigWorkflowProcessLegacyMode: Object, var_cqWorkflowConfigAllowLocking: Object) =
        s"""
        | {
        | "cqWorkflowConfigWorkflowPackagesRootPath":$var_cqWorkflowConfigWorkflowPackagesRootPath,"cqWorkflowConfigWorkflowProcessLegacyMode":$var_cqWorkflowConfigWorkflowProcessLegacyMode,"cqWorkflowConfigAllowLocking":$var_cqWorkflowConfigAllowLocking
        | }
        """.stripMargin
}
