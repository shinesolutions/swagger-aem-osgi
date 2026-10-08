
package org.openapitools.client.model


case class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties (
    _enabled: Option[ConfigNodePropertyBoolean],
    _intervalSeconds: Option[ConfigNodePropertyInteger],
    _commitsPerIntervalThreshold: Option[ConfigNodePropertyInteger],
    _maxLocationLength: Option[ConfigNodePropertyInteger],
    _maxDetailsShown: Option[ConfigNodePropertyInteger],
    _minDetailsPercentage: Option[ConfigNodePropertyInteger],
    _threadMatchers: Option[ConfigNodePropertyArray],
    _maxGreedyDepth: Option[ConfigNodePropertyInteger],
    _greedyStackMatchers: Option[ConfigNodePropertyString],
    _stackFilters: Option[ConfigNodePropertyArray],
    _stackMatchers: Option[ConfigNodePropertyArray],
    _stackCategorizers: Option[ConfigNodePropertyArray],
    _stackShorteners: Option[ConfigNodePropertyArray]
)
object ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
    def toStringBody(var_enabled: Object, var_intervalSeconds: Object, var_commitsPerIntervalThreshold: Object, var_maxLocationLength: Object, var_maxDetailsShown: Object, var_minDetailsPercentage: Object, var_threadMatchers: Object, var_maxGreedyDepth: Object, var_greedyStackMatchers: Object, var_stackFilters: Object, var_stackMatchers: Object, var_stackCategorizers: Object, var_stackShorteners: Object) =
        s"""
        | {
        | "enabled":$var_enabled,"intervalSeconds":$var_intervalSeconds,"commitsPerIntervalThreshold":$var_commitsPerIntervalThreshold,"maxLocationLength":$var_maxLocationLength,"maxDetailsShown":$var_maxDetailsShown,"minDetailsPercentage":$var_minDetailsPercentage,"threadMatchers":$var_threadMatchers,"maxGreedyDepth":$var_maxGreedyDepth,"greedyStackMatchers":$var_greedyStackMatchers,"stackFilters":$var_stackFilters,"stackMatchers":$var_stackMatchers,"stackCategorizers":$var_stackCategorizers,"stackShorteners":$var_stackShorteners
        | }
        """.stripMargin
}
