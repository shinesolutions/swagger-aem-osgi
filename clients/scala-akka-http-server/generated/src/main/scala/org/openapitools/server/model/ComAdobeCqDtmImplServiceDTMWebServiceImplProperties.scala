package org.openapitools.server.model


/**
 * @param connectionTimeout  for example: ''null''
 * @param socketTimeout  for example: ''null''
*/
final case class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties (
  connectionTimeout: Option[ConfigNodePropertyInteger] = None,
  socketTimeout: Option[ConfigNodePropertyInteger] = None
)

