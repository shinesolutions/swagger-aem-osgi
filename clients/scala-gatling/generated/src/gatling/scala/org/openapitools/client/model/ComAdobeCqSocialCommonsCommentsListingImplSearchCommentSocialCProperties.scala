
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties (
    _numUserLimit: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties {
    def toStringBody(var_numUserLimit: Object) =
        s"""
        | {
        | "numUserLimit":$var_numUserLimit
        | }
        """.stripMargin
}
