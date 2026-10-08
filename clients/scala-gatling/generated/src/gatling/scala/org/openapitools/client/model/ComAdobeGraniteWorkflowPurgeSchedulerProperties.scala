
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowPurgeSchedulerProperties (
    _scheduledpurgeName: Option[ConfigNodePropertyString],
    _scheduledpurgeWorkflowStatus: Option[ConfigNodePropertyDropDown],
    _scheduledpurgeModelIds: Option[ConfigNodePropertyArray],
    _scheduledpurgeDaysold: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteWorkflowPurgeSchedulerProperties {
    def toStringBody(var_scheduledpurgeName: Object, var_scheduledpurgeWorkflowStatus: Object, var_scheduledpurgeModelIds: Object, var_scheduledpurgeDaysold: Object) =
        s"""
        | {
        | "scheduledpurgeName":$var_scheduledpurgeName,"scheduledpurgeWorkflowStatus":$var_scheduledpurgeWorkflowStatus,"scheduledpurgeModelIds":$var_scheduledpurgeModelIds,"scheduledpurgeDaysold":$var_scheduledpurgeDaysold
        | }
        """.stripMargin
}
