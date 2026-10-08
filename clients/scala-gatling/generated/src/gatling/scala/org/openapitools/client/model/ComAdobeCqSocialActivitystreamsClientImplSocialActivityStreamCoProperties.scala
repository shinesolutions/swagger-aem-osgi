
package org.openapitools.client.model


case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties (
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialActivitystreamsClientImplSocialActivityStreamCoProperties {
    def toStringBody(var_priority: Object) =
        s"""
        | {
        | "priority":$var_priority
        | }
        """.stripMargin
}
