
package org.openapitools.client.model


case class ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties (
    _priority: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialActivitystreamsClientImplSocialActivityComponenProperties {
    def toStringBody(var_priority: Object) =
        s"""
        | {
        | "priority":$var_priority
        | }
        """.stripMargin
}
