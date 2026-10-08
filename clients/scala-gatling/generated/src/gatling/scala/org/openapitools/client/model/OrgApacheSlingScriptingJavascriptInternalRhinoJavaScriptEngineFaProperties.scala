
package org.openapitools.client.model


case class OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties (
    _orgApacheSlingScriptingJavascriptRhinoOptLevel: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingScriptingJavascriptInternalRhinoJavaScriptEngineFaProperties {
    def toStringBody(var_orgApacheSlingScriptingJavascriptRhinoOptLevel: Object) =
        s"""
        | {
        | "orgApacheSlingScriptingJavascriptRhinoOptLevel":$var_orgApacheSlingScriptingJavascriptRhinoOptLevel
        | }
        """.stripMargin
}
