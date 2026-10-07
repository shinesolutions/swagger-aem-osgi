
package org.openapitools.client.model


case class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties (
    _wcmcommandservletDeleteWhitelist: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {
    def toStringBody(var_wcmcommandservletDeleteWhitelist: Object) =
        s"""
        | {
        | "wcmcommandservletDeleteWhitelist":$var_wcmcommandservletDeleteWhitelist
        | }
        """.stripMargin
}
