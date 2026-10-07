package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param maxSavedReports  for example: ''null''
 * @param timeDuration  for example: ''null''
 * @param enableReportPurge  for example: ''null''
*/
final case class ComDayCqDamCoreImplReportsReportPurgeServiceProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  maxSavedReports: Option[ConfigNodePropertyInteger] = None,
  timeDuration: Option[ConfigNodePropertyInteger] = None,
  enableReportPurge: Option[ConfigNodePropertyBoolean] = None
)

