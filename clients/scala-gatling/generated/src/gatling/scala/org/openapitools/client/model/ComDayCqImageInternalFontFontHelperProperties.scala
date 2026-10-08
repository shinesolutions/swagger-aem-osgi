
package org.openapitools.client.model


case class ComDayCqImageInternalFontFontHelperProperties (
    _fontpath: Option[ConfigNodePropertyArray],
    _oversamplingFactor: Option[ConfigNodePropertyInteger]
)
object ComDayCqImageInternalFontFontHelperProperties {
    def toStringBody(var_fontpath: Object, var_oversamplingFactor: Object) =
        s"""
        | {
        | "fontpath":$var_fontpath,"oversamplingFactor":$var_oversamplingFactor
        | }
        """.stripMargin
}
