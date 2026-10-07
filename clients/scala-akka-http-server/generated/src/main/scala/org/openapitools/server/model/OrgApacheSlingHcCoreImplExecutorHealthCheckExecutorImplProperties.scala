package org.openapitools.server.model


/**
 * @param timeoutInMs  for example: ''null''
 * @param longRunningFutureThresholdForCriticalMs  for example: ''null''
 * @param resultCacheTtlInMs  for example: ''null''
*/
final case class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties (
  timeoutInMs: Option[ConfigNodePropertyInteger] = None,
  longRunningFutureThresholdForCriticalMs: Option[ConfigNodePropertyInteger] = None,
  resultCacheTtlInMs: Option[ConfigNodePropertyInteger] = None
)

