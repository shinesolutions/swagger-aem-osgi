
package org.openapitools.client.model


case class ComDayCqMailerImplCqMailingServiceProperties (
    _maxRecipientCount: Option[ConfigNodePropertyString]
)
object ComDayCqMailerImplCqMailingServiceProperties {
    def toStringBody(var_maxRecipientCount: Object) =
        s"""
        | {
        | "maxRecipientCount":$var_maxRecipientCount
        | }
        """.stripMargin
}
