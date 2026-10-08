
package org.openapitools.client.model


case class ComAdobeCqSocialNotificationsImplNotificationsRouterProperties (
    _eventTopics: Option[ConfigNodePropertyString],
    _eventFilter: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialNotificationsImplNotificationsRouterProperties {
    def toStringBody(var_eventTopics: Object, var_eventFilter: Object) =
        s"""
        | {
        | "eventTopics":$var_eventTopics,"eventFilter":$var_eventFilter
        | }
        """.stripMargin
}
