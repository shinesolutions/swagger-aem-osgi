
package org.openapitools.client.model


case class ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties (
    _slingPostOperation: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyString]
)
object ComDayCqDamS7damCommonPostServletsSetModifyHandlerProperties {
    def toStringBody(var_slingPostOperation: Object, var_slingServletMethods: Object) =
        s"""
        | {
        | "slingPostOperation":$var_slingPostOperation,"slingServletMethods":$var_slingServletMethods
        | }
        """.stripMargin
}
