
package org.openapitools.client.model


case class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties (
    _jmxObjectname: Option[ConfigNodePropertyString],
    _active: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {
    def toStringBody(var_jmxObjectname: Object, var_active: Object) =
        s"""
        | {
        | "jmxObjectname":$var_jmxObjectname,"active":$var_active
        | }
        """.stripMargin
}
