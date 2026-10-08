
package org.openapitools.client.model


case class ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties (
    _schedulerExpression: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteOauthServerImplAccessTokenCleanupTaskProperties {
    def toStringBody(var_schedulerExpression: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression
        | }
        """.stripMargin
}
