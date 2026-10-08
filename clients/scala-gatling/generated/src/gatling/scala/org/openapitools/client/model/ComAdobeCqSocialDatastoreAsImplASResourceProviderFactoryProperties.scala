
package org.openapitools.client.model


case class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties (
    _versionId: Option[ConfigNodePropertyString],
    _cacheOn: Option[ConfigNodePropertyBoolean],
    _concurrencyLevel: Option[ConfigNodePropertyInteger],
    _cacheStartSize: Option[ConfigNodePropertyInteger],
    _cacheTtl: Option[ConfigNodePropertyInteger],
    _cacheSize: Option[ConfigNodePropertyInteger],
    _timeLimit: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties {
    def toStringBody(var_versionId: Object, var_cacheOn: Object, var_concurrencyLevel: Object, var_cacheStartSize: Object, var_cacheTtl: Object, var_cacheSize: Object, var_timeLimit: Object) =
        s"""
        | {
        | "versionId":$var_versionId,"cacheOn":$var_cacheOn,"concurrencyLevel":$var_concurrencyLevel,"cacheStartSize":$var_cacheStartSize,"cacheTtl":$var_cacheTtl,"cacheSize":$var_cacheSize,"timeLimit":$var_timeLimit
        | }
        """.stripMargin
}
