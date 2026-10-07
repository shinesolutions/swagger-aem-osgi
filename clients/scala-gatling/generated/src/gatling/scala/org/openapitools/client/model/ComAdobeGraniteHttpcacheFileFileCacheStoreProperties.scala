
package org.openapitools.client.model


case class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties (
    _comAdobeGraniteHttpcacheFileDocumentRoot: Option[ConfigNodePropertyString],
    _comAdobeGraniteHttpcacheFileIncludeHost: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {
    def toStringBody(var_comAdobeGraniteHttpcacheFileDocumentRoot: Object, var_comAdobeGraniteHttpcacheFileIncludeHost: Object) =
        s"""
        | {
        | "comAdobeGraniteHttpcacheFileDocumentRoot":$var_comAdobeGraniteHttpcacheFileDocumentRoot,"comAdobeGraniteHttpcacheFileIncludeHost":$var_comAdobeGraniteHttpcacheFileIncludeHost
        | }
        """.stripMargin
}
