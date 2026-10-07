
package org.openapitools.client.model


case class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties (
    _deviceRegistrationTimeout: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties {
    def toStringBody(var_deviceRegistrationTimeout: Object) =
        s"""
        | {
        | "deviceRegistrationTimeout":$var_deviceRegistrationTimeout
        | }
        """.stripMargin
}
