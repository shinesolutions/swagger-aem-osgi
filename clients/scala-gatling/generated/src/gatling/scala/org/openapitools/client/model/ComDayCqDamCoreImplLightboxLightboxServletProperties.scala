
package org.openapitools.client.model


case class ComDayCqDamCoreImplLightboxLightboxServletProperties (
    _slingServletPaths: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyArray],
    _cqDamEnableAnonymous: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamCoreImplLightboxLightboxServletProperties {
    def toStringBody(var_slingServletPaths: Object, var_slingServletMethods: Object, var_cqDamEnableAnonymous: Object) =
        s"""
        | {
        | "slingServletPaths":$var_slingServletPaths,"slingServletMethods":$var_slingServletMethods,"cqDamEnableAnonymous":$var_cqDamEnableAnonymous
        | }
        """.stripMargin
}
