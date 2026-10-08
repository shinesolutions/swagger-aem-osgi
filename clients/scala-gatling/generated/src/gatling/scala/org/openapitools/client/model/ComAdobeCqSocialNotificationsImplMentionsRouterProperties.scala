
package org.openapitools.client.model


case class ComAdobeCqSocialNotificationsImplMentionsRouterProperties (
    _eventTopics: Option[ConfigNodePropertyString],
    _eventFilter: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialNotificationsImplMentionsRouterProperties {
    def toStringBody(var_eventTopics: Object, var_eventFilter: Object) =
        s"""
        | {
        | "eventTopics":$var_eventTopics,"eventFilter":$var_eventFilter
        | }
        """.stripMargin
}
