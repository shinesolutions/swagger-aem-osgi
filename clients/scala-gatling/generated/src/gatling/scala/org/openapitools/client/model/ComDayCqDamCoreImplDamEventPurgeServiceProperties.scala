
package org.openapitools.client.model


case class ComDayCqDamCoreImplDamEventPurgeServiceProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _maxSavedActivities: Option[ConfigNodePropertyInteger],
    _saveInterval: Option[ConfigNodePropertyInteger],
    _enableActivityPurge: Option[ConfigNodePropertyBoolean],
    _eventTypes: Option[ConfigNodePropertyDropDown]
)
object ComDayCqDamCoreImplDamEventPurgeServiceProperties {
    def toStringBody(var_schedulerExpression: Object, var_maxSavedActivities: Object, var_saveInterval: Object, var_enableActivityPurge: Object, var_eventTypes: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"maxSavedActivities":$var_maxSavedActivities,"saveInterval":$var_saveInterval,"enableActivityPurge":$var_enableActivityPurge,"eventTypes":$var_eventTypes
        | }
        """.stripMargin
}
