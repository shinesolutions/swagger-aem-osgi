package org.openapitools.server.model


/**
 * @param parameterGuavaCacheEnabled  for example: ''null''
 * @param parameterGuavaCacheParams  for example: ''null''
 * @param parameterGuavaCacheReload  for example: ''null''
 * @param serviceRanking  for example: ''null''
*/
final case class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties (
  parameterGuavaCacheEnabled: Option[ConfigNodePropertyBoolean] = None,
  parameterGuavaCacheParams: Option[ConfigNodePropertyString] = None,
  parameterGuavaCacheReload: Option[ConfigNodePropertyBoolean] = None,
  serviceRanking: Option[ConfigNodePropertyInteger] = None
)

