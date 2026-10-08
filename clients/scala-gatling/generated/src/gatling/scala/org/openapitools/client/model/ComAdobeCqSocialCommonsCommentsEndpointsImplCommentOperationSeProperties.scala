
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties (
    _fieldWhitelist: Option[ConfigNodePropertyArray],
    _attachmentTypeBlacklist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialCommonsCommentsEndpointsImplCommentOperationSeProperties {
    def toStringBody(var_fieldWhitelist: Object, var_attachmentTypeBlacklist: Object) =
        s"""
        | {
        | "fieldWhitelist":$var_fieldWhitelist,"attachmentTypeBlacklist":$var_attachmentTypeBlacklist
        | }
        """.stripMargin
}
