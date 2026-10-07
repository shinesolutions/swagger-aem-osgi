
package org.openapitools.client.model


case class ComDayCqDamCoreImplEventDamEventAuditListenerProperties (
    _eventFilter: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplEventDamEventAuditListenerProperties {
    def toStringBody(var_eventFilter: Object, var_enabled: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter,"enabled":$var_enabled
        | }
        """.stripMargin
}
