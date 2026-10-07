package org.openapitools.server.model


/**
 * @param cqCommerceCataloggeneratorBucketsize  for example: ''null''
 * @param cqCommerceCataloggeneratorBucketname  for example: ''null''
 * @param cqCommerceCataloggeneratorExcludedtemplateproperties  for example: ''null''
*/
final case class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties (
  cqCommerceCataloggeneratorBucketsize: Option[ConfigNodePropertyInteger] = None,
  cqCommerceCataloggeneratorBucketname: Option[ConfigNodePropertyString] = None,
  cqCommerceCataloggeneratorExcludedtemplateproperties: Option[ConfigNodePropertyArray] = None
)

