
package org.openapitools.client.model


case class ComDayCqDamCoreImplDamEventRecorderImplProperties (
    _eventFilter: Option[ConfigNodePropertyString],
    _eventQueueLength: Option[ConfigNodePropertyInteger],
    _eventrecorderEnabled: Option[ConfigNodePropertyBoolean],
    _eventrecorderBlacklist: Option[ConfigNodePropertyArray],
    _eventrecorderEventtypes: Option[ConfigNodePropertyDropDown]
)
object ComDayCqDamCoreImplDamEventRecorderImplProperties {
    def toStringBody(var_eventFilter: Object, var_eventQueueLength: Object, var_eventrecorderEnabled: Object, var_eventrecorderBlacklist: Object, var_eventrecorderEventtypes: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter,"eventQueueLength":$var_eventQueueLength,"eventrecorderEnabled":$var_eventrecorderEnabled,"eventrecorderBlacklist":$var_eventrecorderBlacklist,"eventrecorderEventtypes":$var_eventrecorderEventtypes
        | }
        """.stripMargin
}
