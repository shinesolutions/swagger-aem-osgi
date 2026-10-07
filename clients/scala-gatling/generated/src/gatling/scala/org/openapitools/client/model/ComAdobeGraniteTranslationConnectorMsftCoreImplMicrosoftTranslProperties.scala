
package org.openapitools.client.model


case class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties (
    _translationFactory: Option[ConfigNodePropertyString],
    _defaultConnectorLabel: Option[ConfigNodePropertyString],
    _defaultConnectorAttribution: Option[ConfigNodePropertyString],
    _defaultConnectorWorkspaceId: Option[ConfigNodePropertyString],
    _defaultConnectorSubscriptionKey: Option[ConfigNodePropertyString],
    _languageMapLocation: Option[ConfigNodePropertyString],
    _categoryMapLocation: Option[ConfigNodePropertyString],
    _retryAttempts: Option[ConfigNodePropertyInteger],
    _timeoutCount: Option[ConfigNodePropertyInteger]
)
object ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
    def toStringBody(var_translationFactory: Object, var_defaultConnectorLabel: Object, var_defaultConnectorAttribution: Object, var_defaultConnectorWorkspaceId: Object, var_defaultConnectorSubscriptionKey: Object, var_languageMapLocation: Object, var_categoryMapLocation: Object, var_retryAttempts: Object, var_timeoutCount: Object) =
        s"""
        | {
        | "translationFactory":$var_translationFactory,"defaultConnectorLabel":$var_defaultConnectorLabel,"defaultConnectorAttribution":$var_defaultConnectorAttribution,"defaultConnectorWorkspaceId":$var_defaultConnectorWorkspaceId,"defaultConnectorSubscriptionKey":$var_defaultConnectorSubscriptionKey,"languageMapLocation":$var_languageMapLocation,"categoryMapLocation":$var_categoryMapLocation,"retryAttempts":$var_retryAttempts,"timeoutCount":$var_timeoutCount
        | }
        """.stripMargin
}
