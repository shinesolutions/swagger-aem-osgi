
package org.openapitools.client.model


case class OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties (
    _logStacktraceOnclose: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties {
    def toStringBody(var_logStacktraceOnclose: Object) =
        s"""
        | {
        | "logStacktraceOnclose":$var_logStacktraceOnclose
        | }
        """.stripMargin
}
