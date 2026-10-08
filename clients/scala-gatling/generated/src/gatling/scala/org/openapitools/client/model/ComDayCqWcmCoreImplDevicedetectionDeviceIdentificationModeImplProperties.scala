
package org.openapitools.client.model


case class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties (
    _dimDefaultMode: Option[ConfigNodePropertyDropDown],
    _dimAppcacheEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {
    def toStringBody(var_dimDefaultMode: Object, var_dimAppcacheEnabled: Object) =
        s"""
        | {
        | "dimDefaultMode":$var_dimDefaultMode,"dimAppcacheEnabled":$var_dimAppcacheEnabled
        | }
        """.stripMargin
}
