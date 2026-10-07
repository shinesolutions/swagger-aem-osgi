
package org.openapitools.client.model


case class ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties (
    _cqCommerceCataloggeneratorBucketsize: Option[ConfigNodePropertyInteger],
    _cqCommerceCataloggeneratorBucketname: Option[ConfigNodePropertyString],
    _cqCommerceCataloggeneratorExcludedtemplateproperties: Option[ConfigNodePropertyArray]
)
object ComAdobeCqCommercePimImplCataloggeneratorCatalogGeneratorImplProperties {
    def toStringBody(var_cqCommerceCataloggeneratorBucketsize: Object, var_cqCommerceCataloggeneratorBucketname: Object, var_cqCommerceCataloggeneratorExcludedtemplateproperties: Object) =
        s"""
        | {
        | "cqCommerceCataloggeneratorBucketsize":$var_cqCommerceCataloggeneratorBucketsize,"cqCommerceCataloggeneratorBucketname":$var_cqCommerceCataloggeneratorBucketname,"cqCommerceCataloggeneratorExcludedtemplateproperties":$var_cqCommerceCataloggeneratorExcludedtemplateproperties
        | }
        """.stripMargin
}
