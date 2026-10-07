
package org.openapitools.client.model


case class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties (
    _eventFilter: Option[ConfigNodePropertyString],
    _fontmgrSystemFontDir: Option[ConfigNodePropertyArray],
    _fontmgrAdobeFontDir: Option[ConfigNodePropertyString],
    _fontmgrCustomerFontDir: Option[ConfigNodePropertyString]
)
object ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {
    def toStringBody(var_eventFilter: Object, var_fontmgrSystemFontDir: Object, var_fontmgrAdobeFontDir: Object, var_fontmgrCustomerFontDir: Object) =
        s"""
        | {
        | "eventFilter":$var_eventFilter,"fontmgrSystemFontDir":$var_fontmgrSystemFontDir,"fontmgrAdobeFontDir":$var_fontmgrAdobeFontDir,"fontmgrCustomerFontDir":$var_fontmgrCustomerFontDir
        | }
        """.stripMargin
}
