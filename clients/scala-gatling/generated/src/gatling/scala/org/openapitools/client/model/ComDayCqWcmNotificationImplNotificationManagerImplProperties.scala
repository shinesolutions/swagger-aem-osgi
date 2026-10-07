
package org.openapitools.client.model


case class ComDayCqWcmNotificationImplNotificationManagerImplProperties (
    _eventTopics: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmNotificationImplNotificationManagerImplProperties {
    def toStringBody(var_eventTopics: Object) =
        s"""
        | {
        | "eventTopics":$var_eventTopics
        | }
        """.stripMargin
}
