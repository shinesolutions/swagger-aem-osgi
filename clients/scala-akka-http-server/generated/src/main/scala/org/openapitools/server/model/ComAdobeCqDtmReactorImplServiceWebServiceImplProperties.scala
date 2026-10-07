package org.openapitools.server.model


/**
 * @param endpointUri  for example: ''null''
 * @param connectionTimeout  for example: ''null''
 * @param socketTimeout  for example: ''null''
*/
final case class ComAdobeCqDtmReactorImplServiceWebServiceImplProperties (
  endpointUri: Option[ConfigNodePropertyString] = None,
  connectionTimeout: Option[ConfigNodePropertyInteger] = None,
  socketTimeout: Option[ConfigNodePropertyInteger] = None
)

