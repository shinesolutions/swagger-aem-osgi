
package org.openapitools.client.model


case class ComAdobeGraniteContexthubImplContextHubImplProperties (
    _comAdobeGraniteContexthubSilentMode: Option[ConfigNodePropertyBoolean],
    _comAdobeGraniteContexthubShowUi: Option[ConfigNodePropertyBoolean]
)
object ComAdobeGraniteContexthubImplContextHubImplProperties {
    def toStringBody(var_comAdobeGraniteContexthubSilentMode: Object, var_comAdobeGraniteContexthubShowUi: Object) =
        s"""
        | {
        | "comAdobeGraniteContexthubSilentMode":$var_comAdobeGraniteContexthubSilentMode,"comAdobeGraniteContexthubShowUi":$var_comAdobeGraniteContexthubShowUi
        | }
        """.stripMargin
}
