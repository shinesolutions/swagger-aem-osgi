
package org.openapitools.client.model


case class ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties (
    _slingServletPaths: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyString]
)
object ComDayCqDamS7damCommonServletsS7damProductInfoServletProperties {
    def toStringBody(var_slingServletPaths: Object, var_slingServletMethods: Object) =
        s"""
        | {
        | "slingServletPaths":$var_slingServletPaths,"slingServletMethods":$var_slingServletMethods
        | }
        """.stripMargin
}
