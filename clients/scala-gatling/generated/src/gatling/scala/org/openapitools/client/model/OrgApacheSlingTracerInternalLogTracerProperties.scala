
package org.openapitools.client.model


case class OrgApacheSlingTracerInternalLogTracerProperties (
    _tracerSets: Option[ConfigNodePropertyArray],
    _enabled: Option[ConfigNodePropertyBoolean],
    _servletEnabled: Option[ConfigNodePropertyBoolean],
    _recordingCacheSizeInMB: Option[ConfigNodePropertyInteger],
    _recordingCacheDurationInSecs: Option[ConfigNodePropertyInteger],
    _recordingCompressionEnabled: Option[ConfigNodePropertyBoolean],
    _gzipResponse: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingTracerInternalLogTracerProperties {
    def toStringBody(var_tracerSets: Object, var_enabled: Object, var_servletEnabled: Object, var_recordingCacheSizeInMB: Object, var_recordingCacheDurationInSecs: Object, var_recordingCompressionEnabled: Object, var_gzipResponse: Object) =
        s"""
        | {
        | "tracerSets":$var_tracerSets,"enabled":$var_enabled,"servletEnabled":$var_servletEnabled,"recordingCacheSizeInMB":$var_recordingCacheSizeInMB,"recordingCacheDurationInSecs":$var_recordingCacheDurationInSecs,"recordingCompressionEnabled":$var_recordingCompressionEnabled,"gzipResponse":$var_gzipResponse
        | }
        """.stripMargin
}
