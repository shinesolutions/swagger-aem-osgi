
package org.openapitools.client.model


case class ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties (
    _mailerEmailCharset: Option[ConfigNodePropertyString]
)
object ComDayCqMailerImplEmailCqEmailTemplateFactoryProperties {
    def toStringBody(var_mailerEmailCharset: Object) =
        s"""
        | {
        | "mailerEmailCharset":$var_mailerEmailCharset
        | }
        """.stripMargin
}
