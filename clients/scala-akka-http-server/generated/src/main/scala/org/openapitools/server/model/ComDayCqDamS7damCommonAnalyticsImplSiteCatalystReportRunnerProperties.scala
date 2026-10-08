package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param schedulerConcurrent  for example: ''null''
*/
final case class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  schedulerConcurrent: Option[ConfigNodePropertyBoolean] = None
)

