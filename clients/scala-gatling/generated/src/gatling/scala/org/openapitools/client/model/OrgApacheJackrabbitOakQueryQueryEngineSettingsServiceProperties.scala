
package org.openapitools.client.model


case class OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties (
    _queryLimitInMemory: Option[ConfigNodePropertyInteger],
    _queryLimitReads: Option[ConfigNodePropertyInteger],
    _queryFailTraversal: Option[ConfigNodePropertyBoolean],
    _fastQuerySize: Option[ConfigNodePropertyBoolean]
)
object OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties {
    def toStringBody(var_queryLimitInMemory: Object, var_queryLimitReads: Object, var_queryFailTraversal: Object, var_fastQuerySize: Object) =
        s"""
        | {
        | "queryLimitInMemory":$var_queryLimitInMemory,"queryLimitReads":$var_queryLimitReads,"queryFailTraversal":$var_queryFailTraversal,"fastQuerySize":$var_fastQuerySize
        | }
        """.stripMargin
}
