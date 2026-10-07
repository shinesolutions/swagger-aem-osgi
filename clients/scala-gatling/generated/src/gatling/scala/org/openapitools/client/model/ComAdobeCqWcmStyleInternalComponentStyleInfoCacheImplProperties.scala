
package org.openapitools.client.model


case class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties (
    _size: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties {
    def toStringBody(var_size: Object) =
        s"""
        | {
        | "size":$var_size
        | }
        """.stripMargin
}
