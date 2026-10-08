
package org.openapitools.client.model


case class ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties (
    _fieldWhitelist: Option[ConfigNodePropertyArray],
    _sitePathFilters: Option[ConfigNodePropertyArray],
    _sitePackageGroup: Option[ConfigNodePropertyString]
)
object ComAdobeCqSocialSiteEndpointsImplSiteOperationServiceProperties {
    def toStringBody(var_fieldWhitelist: Object, var_sitePathFilters: Object, var_sitePackageGroup: Object) =
        s"""
        | {
        | "fieldWhitelist":$var_fieldWhitelist,"sitePathFilters":$var_sitePathFilters,"sitePackageGroup":$var_sitePackageGroup
        | }
        """.stripMargin
}
