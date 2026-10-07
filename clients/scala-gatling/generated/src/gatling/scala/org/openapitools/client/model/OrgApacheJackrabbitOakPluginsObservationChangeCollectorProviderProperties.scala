
package org.openapitools.client.model


case class OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties (
    _maxItems: Option[ConfigNodePropertyInteger],
    _maxPathDepth: Option[ConfigNodePropertyInteger],
    _enabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakPluginsObservationChangeCollectorProviderProperties {
    def toStringBody(var_maxItems: Object, var_maxPathDepth: Object, var_enabled: Object) =
        s"""
        | {
        | "maxItems":$var_maxItems,"maxPathDepth":$var_maxPathDepth,"enabled":$var_enabled
        | }
        """.stripMargin
}
