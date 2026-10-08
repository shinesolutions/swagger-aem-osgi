
package org.openapitools.client.model


case class ComDayCqDamIdsImplIDSJobProcessorProperties (
    _enableMultisession: Option[ConfigNodePropertyBoolean],
    _idsCcEnable: Option[ConfigNodePropertyBoolean],
    _enableRetry: Option[ConfigNodePropertyBoolean],
    _enableRetryScripterror: Option[ConfigNodePropertyBoolean],
    _externalizerDomainCqhost: Option[ConfigNodePropertyString],
    _externalizerDomainHttp: Option[ConfigNodePropertyString]
)
object ComDayCqDamIdsImplIDSJobProcessorProperties {
    def toStringBody(var_enableMultisession: Object, var_idsCcEnable: Object, var_enableRetry: Object, var_enableRetryScripterror: Object, var_externalizerDomainCqhost: Object, var_externalizerDomainHttp: Object) =
        s"""
        | {
        | "enableMultisession":$var_enableMultisession,"idsCcEnable":$var_idsCcEnable,"enableRetry":$var_enableRetry,"enableRetryScripterror":$var_enableRetryScripterror,"externalizerDomainCqhost":$var_externalizerDomainCqhost,"externalizerDomainHttp":$var_externalizerDomainHttp
        | }
        """.stripMargin
}
