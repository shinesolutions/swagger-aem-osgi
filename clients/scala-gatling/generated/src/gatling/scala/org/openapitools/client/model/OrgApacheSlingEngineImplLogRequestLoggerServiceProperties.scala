
package org.openapitools.client.model


case class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties (
    _requestLogServiceFormat: Option[ConfigNodePropertyString],
    _requestLogServiceOutput: Option[ConfigNodePropertyString],
    _requestLogServiceOutputtype: Option[ConfigNodePropertyDropDown],
    _requestLogServiceOnentry: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
    def toStringBody(var_requestLogServiceFormat: Object, var_requestLogServiceOutput: Object, var_requestLogServiceOutputtype: Object, var_requestLogServiceOnentry: Object) =
        s"""
        | {
        | "requestLogServiceFormat":$var_requestLogServiceFormat,"requestLogServiceOutput":$var_requestLogServiceOutput,"requestLogServiceOutputtype":$var_requestLogServiceOutputtype,"requestLogServiceOnentry":$var_requestLogServiceOnentry
        | }
        """.stripMargin
}
