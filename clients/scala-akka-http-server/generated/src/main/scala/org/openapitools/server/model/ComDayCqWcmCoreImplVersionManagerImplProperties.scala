package org.openapitools.server.model


/**
 * @param versionmanagerCreateVersionOnActivation  for example: ''null''
 * @param versionmanagerPurgingEnabled  for example: ''null''
 * @param versionmanagerPurgePaths  for example: ''null''
 * @param versionmanagerIvPaths  for example: ''null''
 * @param versionmanagerMaxAgeDays  for example: ''null''
 * @param versionmanagerMaxNumberVersions  for example: ''null''
 * @param versionmanagerMinNumberVersions  for example: ''null''
*/
final case class ComDayCqWcmCoreImplVersionManagerImplProperties (
  versionmanagerCreateVersionOnActivation: Option[ConfigNodePropertyBoolean] = None,
  versionmanagerPurgingEnabled: Option[ConfigNodePropertyBoolean] = None,
  versionmanagerPurgePaths: Option[ConfigNodePropertyArray] = None,
  versionmanagerIvPaths: Option[ConfigNodePropertyArray] = None,
  versionmanagerMaxAgeDays: Option[ConfigNodePropertyInteger] = None,
  versionmanagerMaxNumberVersions: Option[ConfigNodePropertyInteger] = None,
  versionmanagerMinNumberVersions: Option[ConfigNodePropertyInteger] = None
)

