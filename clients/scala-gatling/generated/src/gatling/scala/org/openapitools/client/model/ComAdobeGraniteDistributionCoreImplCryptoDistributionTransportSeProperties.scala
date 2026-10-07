
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties (
    _name: Option[ConfigNodePropertyString],
    _username: Option[ConfigNodePropertyString],
    _encryptedPassword: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties {
    def toStringBody(var_name: Object, var_username: Object, var_encryptedPassword: Object) =
        s"""
        | {
        | "name":$var_name,"username":$var_username,"encryptedPassword":$var_encryptedPassword
        | }
        """.stripMargin
}
