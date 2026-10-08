
package org.openapitools.client.model


case class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties (
    _fontList: Option[ConfigNodePropertyArray]
)
object AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties {
    def toStringBody(var_fontList: Object) =
        s"""
        | {
        | "fontList":$var_fontList
        | }
        """.stripMargin
}
