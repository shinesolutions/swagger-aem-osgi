
package org.openapitools.client.model


case class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties (
    _oauthConfigmanagerImsConfigid: Option[ConfigNodePropertyString],
    _imsOwningEntity: Option[ConfigNodePropertyString],
    _aemInstanceId: Option[ConfigNodePropertyString],
    _imsServiceCode: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {
    def toStringBody(var_oauthConfigmanagerImsConfigid: Object, var_imsOwningEntity: Object, var_aemInstanceId: Object, var_imsServiceCode: Object) =
        s"""
        | {
        | "oauthConfigmanagerImsConfigid":$var_oauthConfigmanagerImsConfigid,"imsOwningEntity":$var_imsOwningEntity,"aemInstanceId":$var_aemInstanceId,"imsServiceCode":$var_imsServiceCode
        | }
        """.stripMargin
}
