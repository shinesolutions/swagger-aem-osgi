package org.openapitools.server.model


/**
 * @param damCfmComponentResourceType  for example: ''null''
 * @param damCfmComponentFileReferenceProp  for example: ''null''
 * @param damCfmComponentElementsProp  for example: ''null''
 * @param damCfmComponentVariationProp  for example: ''null''
*/
final case class ComAdobeCqDamCfmImplComponentComponentConfigImplProperties (
  damCfmComponentResourceType: Option[ConfigNodePropertyString] = None,
  damCfmComponentFileReferenceProp: Option[ConfigNodePropertyString] = None,
  damCfmComponentElementsProp: Option[ConfigNodePropertyString] = None,
  damCfmComponentVariationProp: Option[ConfigNodePropertyString] = None
)

