
package org.openapitools.client.model


case class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties (
    _workflowpackageinfoproviderFilter: Option[ConfigNodePropertyArray],
    _workflowpackageinfoproviderFilterRootpath: Option[ConfigNodePropertyString]
)
object ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties {
    def toStringBody(var_workflowpackageinfoproviderFilter: Object, var_workflowpackageinfoproviderFilterRootpath: Object) =
        s"""
        | {
        | "workflowpackageinfoproviderFilter":$var_workflowpackageinfoproviderFilter,"workflowpackageinfoproviderFilterRootpath":$var_workflowpackageinfoproviderFilterRootpath
        | }
        """.stripMargin
}
