
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties (
    _priorityOrder: Option[ConfigNodePropertyInteger],
    _replyEmailPatterns: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCommonsEmailreplyImplAndroidEmailClientProviderProperties {
    def toStringBody(var_priorityOrder: Object, var_replyEmailPatterns: Object) =
        s"""
        | {
        | "priorityOrder":$var_priorityOrder,"replyEmailPatterns":$var_replyEmailPatterns
        | }
        """.stripMargin
}
