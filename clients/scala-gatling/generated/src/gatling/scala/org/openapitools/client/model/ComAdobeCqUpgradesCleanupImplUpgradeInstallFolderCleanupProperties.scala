
package org.openapitools.client.model


case class ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties (
    _deleteNameRegexps: Option[ConfigNodePropertyArray]
)
object ComAdobeCqUpgradesCleanupImplUpgradeInstallFolderCleanupProperties {
    def toStringBody(var_deleteNameRegexps: Object) =
        s"""
        | {
        | "deleteNameRegexps":$var_deleteNameRegexps
        | }
        """.stripMargin
}
