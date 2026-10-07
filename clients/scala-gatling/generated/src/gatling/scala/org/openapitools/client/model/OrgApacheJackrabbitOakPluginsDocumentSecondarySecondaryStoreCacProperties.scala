
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties (
    _includedPaths: Option[ConfigNodePropertyArray],
    _enableAsyncObserver: Option[ConfigNodePropertyBoolean],
    _observerQueueSize: Option[ConfigNodePropertyInteger]
)
object OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties {
    def toStringBody(var_includedPaths: Object, var_enableAsyncObserver: Object, var_observerQueueSize: Object) =
        s"""
        | {
        | "includedPaths":$var_includedPaths,"enableAsyncObserver":$var_enableAsyncObserver,"observerQueueSize":$var_observerQueueSize
        | }
        """.stripMargin
}
