
package org.openapitools.client.model


case class ComDayCqWcmNotificationEmailImplEmailChannelProperties (
    _emailFrom: Option[ConfigNodePropertyString]
)
object ComDayCqWcmNotificationEmailImplEmailChannelProperties {
    def toStringBody(var_emailFrom: Object) =
        s"""
        | {
        | "emailFrom":$var_emailFrom
        | }
        """.stripMargin
}
