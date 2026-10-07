
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties (
    _priorityOrder: Option[ConfigNodePropertyInteger],
    _replyEmailPatterns: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCommonsEmailreplyImplOutLookEmailClientProviderProperties {
    def toStringBody(var_priorityOrder: Object, var_replyEmailPatterns: Object) =
        s"""
        | {
        | "priorityOrder":$var_priorityOrder,"replyEmailPatterns":$var_replyEmailPatterns
        | }
        """.stripMargin
}
