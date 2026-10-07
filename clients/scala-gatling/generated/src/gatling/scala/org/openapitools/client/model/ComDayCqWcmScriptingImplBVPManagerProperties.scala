
package org.openapitools.client.model


case class ComDayCqWcmScriptingImplBVPManagerProperties (
    _comDayCqWcmScriptingBvpScriptEngines: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmScriptingImplBVPManagerProperties {
    def toStringBody(var_comDayCqWcmScriptingBvpScriptEngines: Object) =
        s"""
        | {
        | "comDayCqWcmScriptingBvpScriptEngines":$var_comDayCqWcmScriptingBvpScriptEngines
        | }
        """.stripMargin
}
