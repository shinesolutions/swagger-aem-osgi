
package org.openapitools.client.model


case class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties (
    _showPlaceholder: Option[ConfigNodePropertyBoolean],
    _maximumCacheEntries: Option[ConfigNodePropertyInteger],
    _afScriptingCompatversion: Option[ConfigNodePropertyDropDown],
    _makeFileNameUnique: Option[ConfigNodePropertyBoolean],
    _generatingCompliantData: Option[ConfigNodePropertyBoolean]
)
object AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties {
    def toStringBody(var_showPlaceholder: Object, var_maximumCacheEntries: Object, var_afScriptingCompatversion: Object, var_makeFileNameUnique: Object, var_generatingCompliantData: Object) =
        s"""
        | {
        | "showPlaceholder":$var_showPlaceholder,"maximumCacheEntries":$var_maximumCacheEntries,"afScriptingCompatversion":$var_afScriptingCompatversion,"makeFileNameUnique":$var_makeFileNameUnique,"generatingCompliantData":$var_generatingCompliantData
        | }
        """.stripMargin
}
