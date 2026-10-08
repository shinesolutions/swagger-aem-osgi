package org.openapitools.server.model


/**
 * @param includePaths  for example: ''null''
 * @param exporterUser  for example: ''null''
*/
final case class ComAdobeCqScheduledExporterImplScheduledExporterImplProperties (
  includePaths: Option[ConfigNodePropertyArray] = None,
  exporterUser: Option[ConfigNodePropertyString] = None
)

