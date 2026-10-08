
package org.openapitools.client.model


case class ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties (
    _cqStoreListenerAdditionalStorePaths: Option[ConfigNodePropertyArray]
)
object ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {
    def toStringBody(var_cqStoreListenerAdditionalStorePaths: Object) =
        s"""
        | {
        | "cqStoreListenerAdditionalStorePaths":$var_cqStoreListenerAdditionalStorePaths
        | }
        """.stripMargin
}
