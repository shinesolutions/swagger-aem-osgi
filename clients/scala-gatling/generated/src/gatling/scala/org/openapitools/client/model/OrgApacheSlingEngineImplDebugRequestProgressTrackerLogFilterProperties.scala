
package org.openapitools.client.model


case class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties (
    _extensions: Option[ConfigNodePropertyArray],
    _minDurationMs: Option[ConfigNodePropertyInteger],
    _maxDurationMs: Option[ConfigNodePropertyInteger],
    _compactLogFormat: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
    def toStringBody(var_extensions: Object, var_minDurationMs: Object, var_maxDurationMs: Object, var_compactLogFormat: Object) =
        s"""
        | {
        | "extensions":$var_extensions,"minDurationMs":$var_minDurationMs,"maxDurationMs":$var_maxDurationMs,"compactLogFormat":$var_compactLogFormat
        | }
        """.stripMargin
}
