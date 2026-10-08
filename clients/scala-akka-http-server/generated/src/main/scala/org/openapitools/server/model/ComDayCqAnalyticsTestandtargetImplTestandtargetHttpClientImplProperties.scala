package org.openapitools.server.model


/**
 * @param cqAnalyticsTestandtargetApiUrl  for example: ''null''
 * @param cqAnalyticsTestandtargetTimeout  for example: ''null''
 * @param cqAnalyticsTestandtargetSockettimeout  for example: ''null''
 * @param cqAnalyticsTestandtargetRecommendationsUrlReplace  for example: ''null''
 * @param cqAnalyticsTestandtargetRecommendationsUrlReplacewith  for example: ''null''
*/
final case class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties (
  cqAnalyticsTestandtargetApiUrl: Option[ConfigNodePropertyString] = None,
  cqAnalyticsTestandtargetTimeout: Option[ConfigNodePropertyInteger] = None,
  cqAnalyticsTestandtargetSockettimeout: Option[ConfigNodePropertyInteger] = None,
  cqAnalyticsTestandtargetRecommendationsUrlReplace: Option[ConfigNodePropertyString] = None,
  cqAnalyticsTestandtargetRecommendationsUrlReplacewith: Option[ConfigNodePropertyString] = None
)

