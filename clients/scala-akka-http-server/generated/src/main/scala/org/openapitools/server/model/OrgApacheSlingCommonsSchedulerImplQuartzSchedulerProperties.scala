package org.openapitools.server.model


/**
 * @param poolName  for example: ''null''
 * @param allowedPoolNames  for example: ''null''
 * @param schedulerUseleaderforsingle  for example: ''null''
 * @param metricsFilters  for example: ''null''
 * @param slowThresholdMillis  for example: ''null''
*/
final case class OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties (
  poolName: Option[ConfigNodePropertyString] = None,
  allowedPoolNames: Option[ConfigNodePropertyArray] = None,
  schedulerUseleaderforsingle: Option[ConfigNodePropertyBoolean] = None,
  metricsFilters: Option[ConfigNodePropertyArray] = None,
  slowThresholdMillis: Option[ConfigNodePropertyInteger] = None
)

