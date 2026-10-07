
package org.openapitools.client.model


case class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties (
    _numberOfDays: Option[ConfigNodePropertyInteger],
    _ageOfFile: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {
    def toStringBody(var_numberOfDays: Object, var_ageOfFile: Object) =
        s"""
        | {
        | "numberOfDays":$var_numberOfDays,"ageOfFile":$var_ageOfFile
        | }
        """.stripMargin
}
