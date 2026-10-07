package org.openapitools.server.model


/**
 * @param cqAnalyticsSitecatalystServiceDatacenterUrl  for example: ''null''
 * @param devhostnamepatterns  for example: ''null''
 * @param connectionTimeout  for example: ''null''
 * @param socketTimeout  for example: ''null''
*/
final case class ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties (
  cqAnalyticsSitecatalystServiceDatacenterUrl: Option[ConfigNodePropertyArray] = None,
  devhostnamepatterns: Option[ConfigNodePropertyArray] = None,
  connectionTimeout: Option[ConfigNodePropertyInteger] = None,
  socketTimeout: Option[ConfigNodePropertyInteger] = None
)

