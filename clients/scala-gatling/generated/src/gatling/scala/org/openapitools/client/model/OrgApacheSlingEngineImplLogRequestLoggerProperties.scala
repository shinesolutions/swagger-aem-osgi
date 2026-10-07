
package org.openapitools.client.model


case class OrgApacheSlingEngineImplLogRequestLoggerProperties (
    _requestLogOutput: Option[ConfigNodePropertyString],
    _requestLogOutputtype: Option[ConfigNodePropertyDropDown],
    _requestLogEnabled: Option[ConfigNodePropertyBoolean],
    _accessLogOutput: Option[ConfigNodePropertyString],
    _accessLogOutputtype: Option[ConfigNodePropertyDropDown],
    _accessLogEnabled: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingEngineImplLogRequestLoggerProperties {
    def toStringBody(var_requestLogOutput: Object, var_requestLogOutputtype: Object, var_requestLogEnabled: Object, var_accessLogOutput: Object, var_accessLogOutputtype: Object, var_accessLogEnabled: Object) =
        s"""
        | {
        | "requestLogOutput":$var_requestLogOutput,"requestLogOutputtype":$var_requestLogOutputtype,"requestLogEnabled":$var_requestLogEnabled,"accessLogOutput":$var_accessLogOutput,"accessLogOutputtype":$var_accessLogOutputtype,"accessLogEnabled":$var_accessLogEnabled
        | }
        """.stripMargin
}
