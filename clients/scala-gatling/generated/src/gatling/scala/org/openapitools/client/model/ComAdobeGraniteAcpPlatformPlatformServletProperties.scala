
package org.openapitools.client.model


case class ComAdobeGraniteAcpPlatformPlatformServletProperties (
    _queryLimit: Option[ConfigNodePropertyInteger],
    _fileTypeExtensionMap: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteAcpPlatformPlatformServletProperties {
    def toStringBody(var_queryLimit: Object, var_fileTypeExtensionMap: Object) =
        s"""
        | {
        | "queryLimit":$var_queryLimit,"fileTypeExtensionMap":$var_fileTypeExtensionMap
        | }
        """.stripMargin
}
