
package org.openapitools.client.model


case class ComAdobeCqProjectsPurgeSchedulerProperties (
    _scheduledpurgeName: Option[ConfigNodePropertyString],
    _scheduledpurgePurgeActive: Option[ConfigNodePropertyBoolean],
    _scheduledpurgeTemplates: Option[ConfigNodePropertyArray],
    _scheduledpurgePurgeGroups: Option[ConfigNodePropertyBoolean],
    _scheduledpurgePurgeAssets: Option[ConfigNodePropertyBoolean],
    _scheduledpurgeTerminateRunningWorkflows: Option[ConfigNodePropertyBoolean],
    _scheduledpurgeDaysold: Option[ConfigNodePropertyInteger],
    _scheduledpurgeSaveThreshold: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqProjectsPurgeSchedulerProperties {
    def toStringBody(var_scheduledpurgeName: Object, var_scheduledpurgePurgeActive: Object, var_scheduledpurgeTemplates: Object, var_scheduledpurgePurgeGroups: Object, var_scheduledpurgePurgeAssets: Object, var_scheduledpurgeTerminateRunningWorkflows: Object, var_scheduledpurgeDaysold: Object, var_scheduledpurgeSaveThreshold: Object) =
        s"""
        | {
        | "scheduledpurgeName":$var_scheduledpurgeName,"scheduledpurgePurgeActive":$var_scheduledpurgePurgeActive,"scheduledpurgeTemplates":$var_scheduledpurgeTemplates,"scheduledpurgePurgeGroups":$var_scheduledpurgePurgeGroups,"scheduledpurgePurgeAssets":$var_scheduledpurgePurgeAssets,"scheduledpurgeTerminateRunningWorkflows":$var_scheduledpurgeTerminateRunningWorkflows,"scheduledpurgeDaysold":$var_scheduledpurgeDaysold,"scheduledpurgeSaveThreshold":$var_scheduledpurgeSaveThreshold
        | }
        """.stripMargin
}
