
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties (
    _priorityOrder: Option[ConfigNodePropertyInteger],
    _replyEmailPatterns: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCommonsEmailreplyImplGmailEmailClientProviderProperties {
    def toStringBody(var_priorityOrder: Object, var_replyEmailPatterns: Object) =
        s"""
        | {
        | "priorityOrder":$var_priorityOrder,"replyEmailPatterns":$var_replyEmailPatterns
        | }
        """.stripMargin
}
