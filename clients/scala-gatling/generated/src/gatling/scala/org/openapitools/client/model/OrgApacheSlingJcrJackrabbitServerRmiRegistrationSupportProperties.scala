
package org.openapitools.client.model


case class OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties (
    _port: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties {
    def toStringBody(var_port: Object) =
        s"""
        | {
        | "port":$var_port
        | }
        """.stripMargin
}
