
package org.openapitools.client.model


case class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties (
    _cacheEnable: Option[ConfigNodePropertyBoolean],
    _cacheRootPaths: Option[ConfigNodePropertyArray],
    _cacheMaxSize: Option[ConfigNodePropertyInteger],
    _cacheMaxEntries: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {
    def toStringBody(var_cacheEnable: Object, var_cacheRootPaths: Object, var_cacheMaxSize: Object, var_cacheMaxEntries: Object) =
        s"""
        | {
        | "cacheEnable":$var_cacheEnable,"cacheRootPaths":$var_cacheRootPaths,"cacheMaxSize":$var_cacheMaxSize,"cacheMaxEntries":$var_cacheMaxEntries
        | }
        """.stripMargin
}
