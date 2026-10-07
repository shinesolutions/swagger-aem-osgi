
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties (
    _ranking: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties {
    def toStringBody(var_ranking: Object) =
        s"""
        | {
        | "ranking":$var_ranking
        | }
        """.stripMargin
}
