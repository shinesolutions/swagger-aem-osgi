
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties (
    _replyEmailPatterns: Option[ConfigNodePropertyArray],
    _priorityOrder: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties {
    def toStringBody(var_replyEmailPatterns: Object, var_priorityOrder: Object) =
        s"""
        | {
        | "replyEmailPatterns":$var_replyEmailPatterns,"priorityOrder":$var_priorityOrder
        | }
        """.stripMargin
}
