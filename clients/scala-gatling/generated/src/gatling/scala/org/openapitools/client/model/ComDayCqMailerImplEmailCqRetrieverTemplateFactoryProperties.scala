
package org.openapitools.client.model


case class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties (
    _mailerEmailEmbed: Option[ConfigNodePropertyBoolean],
    _mailerEmailCharset: Option[ConfigNodePropertyString],
    _mailerEmailRetrieverUserID: Option[ConfigNodePropertyString],
    _mailerEmailRetrieverUserPWD: Option[ConfigNodePropertyString]
)
object ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    def toStringBody(var_mailerEmailEmbed: Object, var_mailerEmailCharset: Object, var_mailerEmailRetrieverUserID: Object, var_mailerEmailRetrieverUserPWD: Object) =
        s"""
        | {
        | "mailerEmailEmbed":$var_mailerEmailEmbed,"mailerEmailCharset":$var_mailerEmailCharset,"mailerEmailRetrieverUserID":$var_mailerEmailRetrieverUserID,"mailerEmailRetrieverUserPWD":$var_mailerEmailRetrieverUserPWD
        | }
        """.stripMargin
}
