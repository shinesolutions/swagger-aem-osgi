
package org.openapitools.client.model


case class OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties (
    _servletPath: Option[ConfigNodePropertyString],
    _disabled: Option[ConfigNodePropertyBoolean],
    _corsAccessControlAllowOrigin: Option[ConfigNodePropertyString]
)
object OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties {
    def toStringBody(var_servletPath: Object, var_disabled: Object, var_corsAccessControlAllowOrigin: Object) =
        s"""
        | {
        | "servletPath":$var_servletPath,"disabled":$var_disabled,"corsAccessControlAllowOrigin":$var_corsAccessControlAllowOrigin
        | }
        """.stripMargin
}
