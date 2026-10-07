
package org.openapitools.client.model


case class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties (
    _accepted: Option[ConfigNodePropertyBoolean],
    _ranked: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties {
    def toStringBody(var_accepted: Object, var_ranked: Object) =
        s"""
        | {
        | "accepted":$var_accepted,"ranked":$var_ranked
        | }
        """.stripMargin
}
