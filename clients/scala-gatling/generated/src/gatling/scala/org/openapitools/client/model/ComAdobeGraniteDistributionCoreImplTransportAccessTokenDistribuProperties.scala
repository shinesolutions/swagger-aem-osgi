
package org.openapitools.client.model


case class ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties (
    _name: Option[ConfigNodePropertyString],
    _serviceName: Option[ConfigNodePropertyString],
    _userId: Option[ConfigNodePropertyString],
    _accessTokenProviderTarget: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties {
    def toStringBody(var_name: Object, var_serviceName: Object, var_userId: Object, var_accessTokenProviderTarget: Object) =
        s"""
        | {
        | "name":$var_name,"serviceName":$var_serviceName,"userId":$var_userId,"accessTokenProviderTarget":$var_accessTokenProviderTarget
        | }
        """.stripMargin
}
