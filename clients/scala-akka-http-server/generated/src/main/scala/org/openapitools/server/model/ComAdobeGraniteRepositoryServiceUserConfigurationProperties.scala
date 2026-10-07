package org.openapitools.server.model


/**
 * @param serviceRanking  for example: ''null''
 * @param serviceusersSimpleSubjectPopulation  for example: ''null''
 * @param serviceusersList  for example: ''null''
*/
final case class ComAdobeGraniteRepositoryServiceUserConfigurationProperties (
  serviceRanking: Option[ConfigNodePropertyInteger] = None,
  serviceusersSimpleSubjectPopulation: Option[ConfigNodePropertyBoolean] = None,
  serviceusersList: Option[ConfigNodePropertyArray] = None
)

