
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties (
    _eventTopics: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties {
    def toStringBody(var_eventTopics: Object) =
        s"""
        | {
        | "eventTopics":$var_eventTopics
        | }
        """.stripMargin
}
