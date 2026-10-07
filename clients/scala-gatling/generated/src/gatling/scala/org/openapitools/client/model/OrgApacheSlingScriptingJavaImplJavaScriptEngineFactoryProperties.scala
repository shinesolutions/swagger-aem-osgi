
package org.openapitools.client.model


case class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties (
    _javaClassdebuginfo: Option[ConfigNodePropertyBoolean],
    _javaJavaEncoding: Option[ConfigNodePropertyString],
    _javaCompilerSourceVM: Option[ConfigNodePropertyString],
    _javaCompilerTargetVM: Option[ConfigNodePropertyString]
)
object OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {
    def toStringBody(var_javaClassdebuginfo: Object, var_javaJavaEncoding: Object, var_javaCompilerSourceVM: Object, var_javaCompilerTargetVM: Object) =
        s"""
        | {
        | "javaClassdebuginfo":$var_javaClassdebuginfo,"javaJavaEncoding":$var_javaJavaEncoding,"javaCompilerSourceVM":$var_javaCompilerSourceVM,"javaCompilerTargetVM":$var_javaCompilerTargetVM
        | }
        """.stripMargin
}
