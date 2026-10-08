
package org.openapitools.client.model


case class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties (
    _deletePathRegexps: Option[ConfigNodePropertyArray],
    _deleteSql2Query: Option[ConfigNodePropertyString]
)
object ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties {
    def toStringBody(var_deletePathRegexps: Object, var_deleteSql2Query: Object) =
        s"""
        | {
        | "deletePathRegexps":$var_deletePathRegexps,"deleteSql2Query":$var_deleteSql2Query
        | }
        """.stripMargin
}
