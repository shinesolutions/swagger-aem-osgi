
package org.openapitools.client.model


case class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties (
    _cdnConfigDistributionDomain: Option[ConfigNodePropertyString],
    _cdnConfigEnableRewriting: Option[ConfigNodePropertyBoolean],
    _cdnConfigPathPrefixes: Option[ConfigNodePropertyArray],
    _cdnConfigCdnttl: Option[ConfigNodePropertyInteger],
    _cdnConfigApplicationProtocol: Option[ConfigNodePropertyString]
)
object ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {
    def toStringBody(var_cdnConfigDistributionDomain: Object, var_cdnConfigEnableRewriting: Object, var_cdnConfigPathPrefixes: Object, var_cdnConfigCdnttl: Object, var_cdnConfigApplicationProtocol: Object) =
        s"""
        | {
        | "cdnConfigDistributionDomain":$var_cdnConfigDistributionDomain,"cdnConfigEnableRewriting":$var_cdnConfigEnableRewriting,"cdnConfigPathPrefixes":$var_cdnConfigPathPrefixes,"cdnConfigCdnttl":$var_cdnConfigCdnttl,"cdnConfigApplicationProtocol":$var_cdnConfigApplicationProtocol
        | }
        """.stripMargin
}
