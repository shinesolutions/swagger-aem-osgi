package org.openapitools.server.model


/**
 * @param host  for example: ''null''
 * @param port  for example: ''null''
*/
final case class ComDayCqReplicationContentStaticContentBuilderProperties (
  host: Option[ConfigNodePropertyString] = None,
  port: Option[ConfigNodePropertyInteger] = None
)

