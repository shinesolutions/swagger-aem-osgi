package org.openapitools.server.model


/**
 * @param versionpurgePaths  for example: ''null''
 * @param versionpurgeRecursive  for example: ''null''
 * @param versionpurgeMaxVersions  for example: ''null''
 * @param versionpurgeMinVersions  for example: ''null''
 * @param versionpurgeMaxAgeDays  for example: ''null''
*/
final case class ComDayCqWcmCoreImplVersionPurgeTaskProperties (
  versionpurgePaths: Option[ConfigNodePropertyArray] = None,
  versionpurgeRecursive: Option[ConfigNodePropertyBoolean] = None,
  versionpurgeMaxVersions: Option[ConfigNodePropertyInteger] = None,
  versionpurgeMinVersions: Option[ConfigNodePropertyInteger] = None,
  versionpurgeMaxAgeDays: Option[ConfigNodePropertyInteger] = None
)

