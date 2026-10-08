
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties (
    _eventTopics: Option[ConfigNodePropertyString],
    _eventFilter: Option[ConfigNodePropertyString],
    _verbs: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCommonsUgclimiterImplUGCLimiterServiceImplProperties {
    def toStringBody(var_eventTopics: Object, var_eventFilter: Object, var_verbs: Object) =
        s"""
        | {
        | "eventTopics":$var_eventTopics,"eventFilter":$var_eventFilter,"verbs":$var_verbs
        | }
        """.stripMargin
}
