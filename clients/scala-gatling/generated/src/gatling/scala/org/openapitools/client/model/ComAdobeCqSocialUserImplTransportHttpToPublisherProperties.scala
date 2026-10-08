
package org.openapitools.client.model


case class ComAdobeCqSocialUserImplTransportHttpToPublisherProperties (
    _enable: Option[ConfigNodePropertyBoolean],
    _agentConfiguration: Option[ConfigNodePropertyArray],
    _contextPath: Option[ConfigNodePropertyString],
    _disabledCipherSuites: Option[ConfigNodePropertyArray],
    _enabledCipherSuites: Option[ConfigNodePropertyArray]
)
object ComAdobeCqSocialUserImplTransportHttpToPublisherProperties {
    def toStringBody(var_enable: Object, var_agentConfiguration: Object, var_contextPath: Object, var_disabledCipherSuites: Object, var_enabledCipherSuites: Object) =
        s"""
        | {
        | "enable":$var_enable,"agentConfiguration":$var_agentConfiguration,"contextPath":$var_contextPath,"disabledCipherSuites":$var_disabledCipherSuites,"enabledCipherSuites":$var_enabledCipherSuites
        | }
        """.stripMargin
}
