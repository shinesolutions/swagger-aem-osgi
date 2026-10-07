
package org.openapitools.client.model


case class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties (
    _slingPostOperation: Option[ConfigNodePropertyString],
    _slingServletMethods: Option[ConfigNodePropertyString]
)
object ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {
    def toStringBody(var_slingPostOperation: Object, var_slingServletMethods: Object) =
        s"""
        | {
        | "slingPostOperation":$var_slingPostOperation,"slingServletMethods":$var_slingServletMethods
        | }
        """.stripMargin
}
