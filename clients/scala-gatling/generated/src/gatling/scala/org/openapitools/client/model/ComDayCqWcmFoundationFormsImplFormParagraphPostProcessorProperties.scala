
package org.openapitools.client.model


case class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties (
    _formsFormparagraphpostprocessorEnabled: Option[ConfigNodePropertyBoolean],
    _formsFormparagraphpostprocessorFormresourcetypes: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties {
    def toStringBody(var_formsFormparagraphpostprocessorEnabled: Object, var_formsFormparagraphpostprocessorFormresourcetypes: Object) =
        s"""
        | {
        | "formsFormparagraphpostprocessorEnabled":$var_formsFormparagraphpostprocessorEnabled,"formsFormparagraphpostprocessorFormresourcetypes":$var_formsFormparagraphpostprocessorFormresourcetypes
        | }
        """.stripMargin
}
