
package org.openapitools.client.model


case class ComAdobeGraniteLicenseImplLicenseCheckFilterProperties (
    _checkInternval: Option[ConfigNodePropertyInteger],
    _excludeIds: Option[ConfigNodePropertyArray],
    _encryptPing: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteLicenseImplLicenseCheckFilterProperties {
    def toStringBody(var_checkInternval: Object, var_excludeIds: Object, var_encryptPing: Object) =
        s"""
        | {
        | "checkInternval":$var_checkInternval,"excludeIds":$var_excludeIds,"encryptPing":$var_encryptPing
        | }
        """.stripMargin
}
