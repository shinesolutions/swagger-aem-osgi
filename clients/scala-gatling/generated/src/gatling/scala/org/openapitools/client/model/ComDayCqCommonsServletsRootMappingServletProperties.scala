
package org.openapitools.client.model


case class ComDayCqCommonsServletsRootMappingServletProperties (
    _rootmappingTarget: Option[ConfigNodePropertyString]
)
object ComDayCqCommonsServletsRootMappingServletProperties {
    def toStringBody(var_rootmappingTarget: Object) =
        s"""
        | {
        | "rootmappingTarget":$var_rootmappingTarget
        | }
        """.stripMargin
}
