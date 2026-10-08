
package org.openapitools.client.model


case class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties (
    _handlerSchemes: Option[ConfigNodePropertyArray],
    _slingJcrinstallFolderNameRegexp: Option[ConfigNodePropertyString],
    _slingJcrinstallFolderMaxDepth: Option[ConfigNodePropertyInteger],
    _slingJcrinstallSearchPath: Option[ConfigNodePropertyArray],
    _slingJcrinstallNewConfigPath: Option[ConfigNodePropertyString],
    _slingJcrinstallSignalPath: Option[ConfigNodePropertyString],
    _slingJcrinstallEnableWriteback: Option[ConfigNodePropertyBoolean]
)
object OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties {
    def toStringBody(var_handlerSchemes: Object, var_slingJcrinstallFolderNameRegexp: Object, var_slingJcrinstallFolderMaxDepth: Object, var_slingJcrinstallSearchPath: Object, var_slingJcrinstallNewConfigPath: Object, var_slingJcrinstallSignalPath: Object, var_slingJcrinstallEnableWriteback: Object) =
        s"""
        | {
        | "handlerSchemes":$var_handlerSchemes,"slingJcrinstallFolderNameRegexp":$var_slingJcrinstallFolderNameRegexp,"slingJcrinstallFolderMaxDepth":$var_slingJcrinstallFolderMaxDepth,"slingJcrinstallSearchPath":$var_slingJcrinstallSearchPath,"slingJcrinstallNewConfigPath":$var_slingJcrinstallNewConfigPath,"slingJcrinstallSignalPath":$var_slingJcrinstallSignalPath,"slingJcrinstallEnableWriteback":$var_slingJcrinstallEnableWriteback
        | }
        """.stripMargin
}
