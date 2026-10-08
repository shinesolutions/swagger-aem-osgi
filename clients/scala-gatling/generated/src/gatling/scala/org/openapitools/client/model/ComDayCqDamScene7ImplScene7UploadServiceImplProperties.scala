
package org.openapitools.client.model


case class ComDayCqDamScene7ImplScene7UploadServiceImplProperties (
    _cqDamScene7UploadserviceActivejobtimeoutLabel: Option[ConfigNodePropertyInteger],
    _cqDamScene7UploadserviceConnectionmaxperrouteLabel: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamScene7ImplScene7UploadServiceImplProperties {
    def toStringBody(var_cqDamScene7UploadserviceActivejobtimeoutLabel: Object, var_cqDamScene7UploadserviceConnectionmaxperrouteLabel: Object) =
        s"""
        | {
        | "cqDamScene7UploadserviceActivejobtimeoutLabel":$var_cqDamScene7UploadserviceActivejobtimeoutLabel,"cqDamScene7UploadserviceConnectionmaxperrouteLabel":$var_cqDamScene7UploadserviceConnectionmaxperrouteLabel
        | }
        """.stripMargin
}
