
package org.openapitools.client.model


case class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties (
    _tcpPort: Option[ConfigNodePropertyString],
    _allowRemoteAccess: Option[ConfigNodePropertyBoolean],
    _maxRenderRgnPixels: Option[ConfigNodePropertyString],
    _maxMessageSize: Option[ConfigNodePropertyString],
    _randomAccessUrlTimeout: Option[ConfigNodePropertyInteger],
    _workerThreads: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
    def toStringBody(var_tcpPort: Object, var_allowRemoteAccess: Object, var_maxRenderRgnPixels: Object, var_maxMessageSize: Object, var_randomAccessUrlTimeout: Object, var_workerThreads: Object) =
        s"""
        | {
        | "tcpPort":$var_tcpPort,"allowRemoteAccess":$var_allowRemoteAccess,"maxRenderRgnPixels":$var_maxRenderRgnPixels,"maxMessageSize":$var_maxMessageSize,"randomAccessUrlTimeout":$var_randomAccessUrlTimeout,"workerThreads":$var_workerThreads
        | }
        """.stripMargin
}
