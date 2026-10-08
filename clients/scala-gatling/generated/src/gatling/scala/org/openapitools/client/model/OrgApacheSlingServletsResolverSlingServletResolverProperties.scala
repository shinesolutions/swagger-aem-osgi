
package org.openapitools.client.model


case class OrgApacheSlingServletsResolverSlingServletResolverProperties (
    _servletresolverServletRoot: Option[ConfigNodePropertyString],
    _servletresolverCacheSize: Option[ConfigNodePropertyInteger],
    _servletresolverPaths: Option[ConfigNodePropertyArray],
    _servletresolverDefaultExtensions: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingServletsResolverSlingServletResolverProperties {
    def toStringBody(var_servletresolverServletRoot: Object, var_servletresolverCacheSize: Object, var_servletresolverPaths: Object, var_servletresolverDefaultExtensions: Object) =
        s"""
        | {
        | "servletresolverServletRoot":$var_servletresolverServletRoot,"servletresolverCacheSize":$var_servletresolverCacheSize,"servletresolverPaths":$var_servletresolverPaths,"servletresolverDefaultExtensions":$var_servletresolverDefaultExtensions
        | }
        """.stripMargin
}
