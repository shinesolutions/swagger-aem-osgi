
package org.openapitools.client.model


case class ComDayCqMailerDefaultMailServiceProperties (
    _smtpHost: Option[ConfigNodePropertyString],
    _smtpPort: Option[ConfigNodePropertyInteger],
    _smtpUser: Option[ConfigNodePropertyString],
    _smtpPassword: Option[ConfigNodePropertyString],
    _fromAddress: Option[ConfigNodePropertyString],
    _smtpSsl: Option[ConfigNodePropertyBoolean],
    _smtpStarttls: Option[ConfigNodePropertyBoolean],
    _debugEmail: Option[ConfigNodePropertyBoolean]
)
object ComDayCqMailerDefaultMailServiceProperties {
    def toStringBody(var_smtpHost: Object, var_smtpPort: Object, var_smtpUser: Object, var_smtpPassword: Object, var_fromAddress: Object, var_smtpSsl: Object, var_smtpStarttls: Object, var_debugEmail: Object) =
        s"""
        | {
        | "smtpHost":$var_smtpHost,"smtpPort":$var_smtpPort,"smtpUser":$var_smtpUser,"smtpPassword":$var_smtpPassword,"fromAddress":$var_fromAddress,"smtpSsl":$var_smtpSsl,"smtpStarttls":$var_smtpStarttls,"debugEmail":$var_debugEmail
        | }
        """.stripMargin
}
