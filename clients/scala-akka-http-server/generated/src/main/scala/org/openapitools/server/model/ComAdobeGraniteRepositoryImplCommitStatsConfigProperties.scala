package org.openapitools.server.model


/**
 * @param enabled  for example: ''null''
 * @param intervalSeconds  for example: ''null''
 * @param commitsPerIntervalThreshold  for example: ''null''
 * @param maxLocationLength  for example: ''null''
 * @param maxDetailsShown  for example: ''null''
 * @param minDetailsPercentage  for example: ''null''
 * @param threadMatchers  for example: ''null''
 * @param maxGreedyDepth  for example: ''null''
 * @param greedyStackMatchers  for example: ''null''
 * @param stackFilters  for example: ''null''
 * @param stackMatchers  for example: ''null''
 * @param stackCategorizers  for example: ''null''
 * @param stackShorteners  for example: ''null''
*/
final case class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties (
  enabled: Option[ConfigNodePropertyBoolean] = None,
  intervalSeconds: Option[ConfigNodePropertyInteger] = None,
  commitsPerIntervalThreshold: Option[ConfigNodePropertyInteger] = None,
  maxLocationLength: Option[ConfigNodePropertyInteger] = None,
  maxDetailsShown: Option[ConfigNodePropertyInteger] = None,
  minDetailsPercentage: Option[ConfigNodePropertyInteger] = None,
  threadMatchers: Option[ConfigNodePropertyArray] = None,
  maxGreedyDepth: Option[ConfigNodePropertyInteger] = None,
  greedyStackMatchers: Option[ConfigNodePropertyString] = None,
  stackFilters: Option[ConfigNodePropertyArray] = None,
  stackMatchers: Option[ConfigNodePropertyArray] = None,
  stackCategorizers: Option[ConfigNodePropertyArray] = None,
  stackShorteners: Option[ConfigNodePropertyArray] = None
)

