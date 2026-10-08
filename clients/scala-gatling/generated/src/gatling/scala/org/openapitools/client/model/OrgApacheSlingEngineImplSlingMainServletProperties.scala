
package org.openapitools.client.model


case class OrgApacheSlingEngineImplSlingMainServletProperties (
    _slingMaxCalls: Option[ConfigNodePropertyInteger],
    _slingMaxInclusions: Option[ConfigNodePropertyInteger],
    _slingTraceAllow: Option[ConfigNodePropertyBoolean],
    _slingMaxRecordRequests: Option[ConfigNodePropertyInteger],
    _slingStorePatternRequests: Option[ConfigNodePropertyArray],
    _slingServerinfo: Option[ConfigNodePropertyString],
    _slingAdditionalResponseHeaders: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingEngineImplSlingMainServletProperties {
    def toStringBody(var_slingMaxCalls: Object, var_slingMaxInclusions: Object, var_slingTraceAllow: Object, var_slingMaxRecordRequests: Object, var_slingStorePatternRequests: Object, var_slingServerinfo: Object, var_slingAdditionalResponseHeaders: Object) =
        s"""
        | {
        | "slingMaxCalls":$var_slingMaxCalls,"slingMaxInclusions":$var_slingMaxInclusions,"slingTraceAllow":$var_slingTraceAllow,"slingMaxRecordRequests":$var_slingMaxRecordRequests,"slingStorePatternRequests":$var_slingStorePatternRequests,"slingServerinfo":$var_slingServerinfo,"slingAdditionalResponseHeaders":$var_slingAdditionalResponseHeaders
        | }
        """.stripMargin
}
