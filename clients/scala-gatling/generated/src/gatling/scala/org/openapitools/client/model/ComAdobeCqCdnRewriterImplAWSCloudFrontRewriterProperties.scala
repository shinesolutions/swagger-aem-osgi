
package org.openapitools.client.model


case class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties (
    _serviceRanking: Option[ConfigNodePropertyInteger],
    _keypairId: Option[ConfigNodePropertyString],
    _keypairAlias: Option[ConfigNodePropertyString],
    _cdnrewriterAttributes: Option[ConfigNodePropertyArray],
    _cdnRewriterDistributionDomain: Option[ConfigNodePropertyString]
)
object ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {
    def toStringBody(var_serviceRanking: Object, var_keypairId: Object, var_keypairAlias: Object, var_cdnrewriterAttributes: Object, var_cdnRewriterDistributionDomain: Object) =
        s"""
        | {
        | "serviceRanking":$var_serviceRanking,"keypairId":$var_keypairId,"keypairAlias":$var_keypairAlias,"cdnrewriterAttributes":$var_cdnrewriterAttributes,"cdnRewriterDistributionDomain":$var_cdnRewriterDistributionDomain
        | }
        """.stripMargin
}
