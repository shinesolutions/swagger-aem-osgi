
package org.openapitools.client.model


case class ComAdobeGraniteMonitoringImplScriptConfigImplProperties (
    _scriptFilename: Option[ConfigNodePropertyString],
    _scriptDisplay: Option[ConfigNodePropertyString],
    _scriptPath: Option[ConfigNodePropertyString],
    _scriptPlatform: Option[ConfigNodePropertyArray],
    _interval: Option[ConfigNodePropertyInteger],
    _jmxdomain: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
    def toStringBody(var_scriptFilename: Object, var_scriptDisplay: Object, var_scriptPath: Object, var_scriptPlatform: Object, var_interval: Object, var_jmxdomain: Object) =
        s"""
        | {
        | "scriptFilename":$var_scriptFilename,"scriptDisplay":$var_scriptDisplay,"scriptPath":$var_scriptPath,"scriptPlatform":$var_scriptPlatform,"interval":$var_interval,"jmxdomain":$var_jmxdomain
        | }
        """.stripMargin
}
