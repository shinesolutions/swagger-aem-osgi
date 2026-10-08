
package org.openapitools.client.model


case class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties (
    _scene7FlashTemplatesRti: Option[ConfigNodePropertyString],
    _scene7FlashTemplatesRsi: Option[ConfigNodePropertyString],
    _scene7FlashTemplatesRb: Option[ConfigNodePropertyString],
    _scene7FlashTemplatesRurl: Option[ConfigNodePropertyString],
    _scene7FlashTemplateUrlFormatParameter: Option[ConfigNodePropertyString]
)
object ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
    def toStringBody(var_scene7FlashTemplatesRti: Object, var_scene7FlashTemplatesRsi: Object, var_scene7FlashTemplatesRb: Object, var_scene7FlashTemplatesRurl: Object, var_scene7FlashTemplateUrlFormatParameter: Object) =
        s"""
        | {
        | "scene7FlashTemplatesRti":$var_scene7FlashTemplatesRti,"scene7FlashTemplatesRsi":$var_scene7FlashTemplatesRsi,"scene7FlashTemplatesRb":$var_scene7FlashTemplatesRb,"scene7FlashTemplatesRurl":$var_scene7FlashTemplatesRurl,"scene7FlashTemplateUrlFormatParameter":$var_scene7FlashTemplateUrlFormatParameter
        | }
        """.stripMargin
}
