
package org.openapitools.client.model


case class ComDayCqPollingImporterImplManagedPollConfigImplProperties (
    _id: Option[ConfigNodePropertyString],
    _enabled: Option[ConfigNodePropertyBoolean],
    _reference: Option[ConfigNodePropertyBoolean],
    _interval: Option[ConfigNodePropertyInteger],
    _expression: Option[ConfigNodePropertyString],
    _source: Option[ConfigNodePropertyString],
    _target: Option[ConfigNodePropertyString],
    _login: Option[ConfigNodePropertyString],
    _password: Option[ConfigNodePropertyString]
)
object ComDayCqPollingImporterImplManagedPollConfigImplProperties {
    def toStringBody(var_id: Object, var_enabled: Object, var_reference: Object, var_interval: Object, var_expression: Object, var_source: Object, var_target: Object, var_login: Object, var_password: Object) =
        s"""
        | {
        | "id":$var_id,"enabled":$var_enabled,"reference":$var_reference,"interval":$var_interval,"expression":$var_expression,"source":$var_source,"target":$var_target,"login":$var_login,"password":$var_password
        | }
        """.stripMargin
}
