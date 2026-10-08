package org.openapitools.server.model


/**
 * @param handlerSchemes  for example: ''null''
 * @param slingJcrinstallFolderNameRegexp  for example: ''null''
 * @param slingJcrinstallFolderMaxDepth  for example: ''null''
 * @param slingJcrinstallSearchPath  for example: ''null''
 * @param slingJcrinstallNewConfigPath  for example: ''null''
 * @param slingJcrinstallSignalPath  for example: ''null''
 * @param slingJcrinstallEnableWriteback  for example: ''null''
*/
final case class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties (
  handlerSchemes: Option[ConfigNodePropertyArray] = None,
  slingJcrinstallFolderNameRegexp: Option[ConfigNodePropertyString] = None,
  slingJcrinstallFolderMaxDepth: Option[ConfigNodePropertyInteger] = None,
  slingJcrinstallSearchPath: Option[ConfigNodePropertyArray] = None,
  slingJcrinstallNewConfigPath: Option[ConfigNodePropertyString] = None,
  slingJcrinstallSignalPath: Option[ConfigNodePropertyString] = None,
  slingJcrinstallEnableWriteback: Option[ConfigNodePropertyBoolean] = None
)

