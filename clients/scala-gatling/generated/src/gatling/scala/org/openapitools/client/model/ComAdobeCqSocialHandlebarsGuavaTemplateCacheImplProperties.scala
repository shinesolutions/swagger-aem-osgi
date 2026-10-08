
package org.openapitools.client.model


case class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties (
    _parameterGuavaCacheEnabled: Option[ConfigNodePropertyBoolean],
    _parameterGuavaCacheParams: Option[ConfigNodePropertyString],
    _parameterGuavaCacheReload: Option[ConfigNodePropertyBoolean],
    _serviceRanking: Option[ConfigNodePropertyInteger]
)
object ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties {
    def toStringBody(var_parameterGuavaCacheEnabled: Object, var_parameterGuavaCacheParams: Object, var_parameterGuavaCacheReload: Object, var_serviceRanking: Object) =
        s"""
        | {
        | "parameterGuavaCacheEnabled":$var_parameterGuavaCacheEnabled,"parameterGuavaCacheParams":$var_parameterGuavaCacheParams,"parameterGuavaCacheReload":$var_parameterGuavaCacheReload,"serviceRanking":$var_serviceRanking
        | }
        """.stripMargin
}
