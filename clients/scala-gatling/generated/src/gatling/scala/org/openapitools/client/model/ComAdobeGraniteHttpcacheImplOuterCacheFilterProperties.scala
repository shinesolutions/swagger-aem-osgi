
package org.openapitools.client.model


case class ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties (
    _comAdobeGraniteHttpcacheUrlPaths: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteHttpcacheImplOuterCacheFilterProperties {
    def toStringBody(var_comAdobeGraniteHttpcacheUrlPaths: Object) =
        s"""
        | {
        | "comAdobeGraniteHttpcacheUrlPaths":$var_comAdobeGraniteHttpcacheUrlPaths
        | }
        """.stripMargin
}
