
package org.openapitools.client.model


case class ComDayCqNotificationImplNotificationServiceImplProperties (
    _eventFilter: Option[ConfigNodePropertyString]
)
object ComDayCqNotificationImplNotificationServiceImplProperties {
    def toStringBody(var_eventFilter: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter
        | }
        """.stripMargin
}
