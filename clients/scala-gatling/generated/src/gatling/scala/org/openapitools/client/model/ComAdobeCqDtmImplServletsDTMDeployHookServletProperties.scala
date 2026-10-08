
package org.openapitools.client.model


case class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties (
    _dtmStagingIpWhitelist: Option[ConfigNodePropertyArray],
    _dtmProductionIpWhitelist: Option[ConfigNodePropertyArray]
)
object ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {
    def toStringBody(var_dtmStagingIpWhitelist: Object, var_dtmProductionIpWhitelist: Object) =
        s"""
        | {
        | "dtmStagingIpWhitelist":$var_dtmStagingIpWhitelist,"dtmProductionIpWhitelist":$var_dtmProductionIpWhitelist
        | }
        """.stripMargin
}
