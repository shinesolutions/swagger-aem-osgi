package org.openapitools.server.model


/**
 * @param reportFetchAttempts  for example: ''null''
 * @param reportFetchDelay  for example: ''null''
*/
final case class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties (
  reportFetchAttempts: Option[ConfigNodePropertyInteger] = None,
  reportFetchDelay: Option[ConfigNodePropertyInteger] = None
)

