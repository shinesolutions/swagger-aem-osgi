
package org.openapitools.client.model


case class ComAdobeCqCdnRewriterImplCDNRewriterProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _cdnrewriterAttributes: Option[ConfigNodePropertyArray],
    _cdnRewriterDistributionDomain: Option[ConfigNodePropertyString]
)
object ComAdobeCqCdnRewriterImplCDNRewriterProperties {
    def toStringBody(var_serviceRanking: Object, var_cdnrewriterAttributes: Object, var_cdnRewriterDistributionDomain: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"cdnrewriterAttributes":$var_cdnrewriterAttributes,"cdnRewriterDistributionDomain":$var_cdnRewriterDistributionDomain
        | }
        """.stripMargin
}
