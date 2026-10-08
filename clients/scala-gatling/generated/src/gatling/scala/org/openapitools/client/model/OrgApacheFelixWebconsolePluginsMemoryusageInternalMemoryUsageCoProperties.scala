
package org.openapitools.client.model


case class OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties (
    _felixMemoryusageDumpThreshold: Option[ConfigNodePropertyInteger],
    _felixMemoryusageDumpInterval: Option[ConfigNodePropertyInteger],
    _felixMemoryusageDumpLocation: Option[ConfigNodePropertyString]
)
object OrgApacheFelixWebconsolePluginsMemoryusageInternalMemoryUsageCoProperties {
    def toStringBody(var_felixMemoryusageDumpThreshold: Object, var_felixMemoryusageDumpInterval: Object, var_felixMemoryusageDumpLocation: Object) =
        s"""
        | {
        | "felixMemoryusageDumpThreshold":$var_felixMemoryusageDumpThreshold,"felixMemoryusageDumpInterval":$var_felixMemoryusageDumpInterval,"felixMemoryusageDumpLocation":$var_felixMemoryusageDumpLocation
        | }
        """.stripMargin
}
