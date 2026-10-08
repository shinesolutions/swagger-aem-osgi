
package org.openapitools.client.model


case class ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties (
    _deviceInfoTransformerEnabled: Option[ConfigNodePropertyBoolean],
    _deviceInfoTransformerCssStyle: Option[ConfigNodePropertyString]
)
object ComDayCqWcmMobileCoreImplDeviceDeviceInfoTransformerFactoryProperties {
    def toStringBody(var_deviceInfoTransformerEnabled: Object, var_deviceInfoTransformerCssStyle: Object) =
        s"""
        | {
        | "deviceInfoTransformerEnabled":$var_deviceInfoTransformerEnabled,"deviceInfoTransformerCssStyle":$var_deviceInfoTransformerCssStyle
        | }
        """.stripMargin
}
