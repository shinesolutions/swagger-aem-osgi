
package org.openapitools.client.model


case class ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties (
    _adapterCondition: Option[ConfigNodePropertyString],
    _taskmanagerAdmingroups: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteTaskmanagementImplServiceTaskManagerAdapterFactorProperties {
    def toStringBody(var_adapterCondition: Object, var_taskmanagerAdmingroups: Object) =
        s"""
        | {
        | "adapterCondition":$var_adapterCondition,"taskmanagerAdmingroups":$var_taskmanagerAdmingroups
        | }
        """.stripMargin
}
