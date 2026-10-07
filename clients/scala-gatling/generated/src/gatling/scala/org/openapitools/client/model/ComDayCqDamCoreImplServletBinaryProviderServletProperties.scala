
package org.openapitools.client.model


case class ComDayCqDamCoreImplServletBinaryProviderServletProperties (
    _slingServletResourceTypes: Option[ConfigNodePropertyArray],
    _slingServletMethods: Option[ConfigNodePropertyArray],
    _cqDamDrmEnable: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplServletBinaryProviderServletProperties {
    def toStringBody(var_slingServletResourceTypes: Object, var_slingServletMethods: Object, var_cqDamDrmEnable: Object) =
        s"""
        | {
        | "slingServletResourceTypes":$var_slingServletResourceTypes,"slingServletMethods":$var_slingServletMethods,"cqDamDrmEnable":$var_cqDamDrmEnable
        | }
        """.stripMargin
}
