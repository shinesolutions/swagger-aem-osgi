
package org.openapitools.client.model


case class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties (
    _ranking: Option[ConfigNodePropertyInteger],
    _enable: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {
    def toStringBody(var_ranking: Object, var_enable: Object) =
        s"""
        | {
        | "ranking":$var_ranking,"enable":$var_enable
        | }
        """.stripMargin
}
