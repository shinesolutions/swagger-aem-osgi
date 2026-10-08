
package org.openapitools.client.model


case class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties (
    _jmxObjectname: Option[ConfigNodePropertyString]
)
object ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {
    def toStringBody(var_jmxObjectname: Object) =
        s"""
        | {
        | "jmxObjectname":$var_jmxObjectname
        | }
        """.stripMargin
}
