
package org.openapitools.client.model


case class ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties (
    _rootPath: Option[ConfigNodePropertyString],
    _fixInconsistencies: Option[ConfigNodePropertyBoolean]
)
object ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties {
    def toStringBody(var_rootPath: Object, var_fixInconsistencies: Object) =
        s"""
        | {
        | "rootPath":$var_rootPath,"fixInconsistencies":$var_fixInconsistencies
        | }
        """.stripMargin
}
