
package org.openapitools.client.model


case class ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties (
    _solrZkTimeout: Option[ConfigNodePropertyString],
    _solrCommit: Option[ConfigNodePropertyString],
    _cacheOn: Option[ConfigNodePropertyBoolean],
    _concurrencyLevel: Option[ConfigNodePropertyInteger],
    _cacheStartSize: Option[ConfigNodePropertyInteger],
    _cacheTtl: Option[ConfigNodePropertyInteger],
    _cacheSize: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties {
    def toStringBody(var_solrZkTimeout: Object, var_solrCommit: Object, var_cacheOn: Object, var_concurrencyLevel: Object, var_cacheStartSize: Object, var_cacheTtl: Object, var_cacheSize: Object) =
        s"""
        | {
        | "solrZkTimeout":$var_solrZkTimeout,"solrCommit":$var_solrCommit,"cacheOn":$var_cacheOn,"concurrencyLevel":$var_concurrencyLevel,"cacheStartSize":$var_cacheStartSize,"cacheTtl":$var_cacheTtl,"cacheSize":$var_cacheSize
        | }
        """.stripMargin
}
