package org.openapitools.server.model


/**
 * @param serviceMaxLinksPerHost  for example: ''null''
 * @param serviceSaveExternalLinkReferences  for example: ''null''
*/
final case class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties (
  serviceMaxLinksPerHost: Option[ConfigNodePropertyInteger] = None,
  serviceSaveExternalLinkReferences: Option[ConfigNodePropertyBoolean] = None
)

