package org.openapitools.server.model


/**
 * @param preserveHierarchyNodes  for example: ''null''
 * @param ignoreVersioning  for example: ''null''
 * @param importAcl  for example: ''null''
 * @param saveThreshold  for example: ''null''
 * @param preserveUserPaths  for example: ''null''
 * @param preserveUuid  for example: ''null''
 * @param preserveUuidNodetypes  for example: ''null''
 * @param preserveUuidSubtrees  for example: ''null''
 * @param autoCommit  for example: ''null''
*/
final case class ComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties (
  preserveHierarchyNodes: Option[ConfigNodePropertyBoolean] = None,
  ignoreVersioning: Option[ConfigNodePropertyBoolean] = None,
  importAcl: Option[ConfigNodePropertyBoolean] = None,
  saveThreshold: Option[ConfigNodePropertyInteger] = None,
  preserveUserPaths: Option[ConfigNodePropertyBoolean] = None,
  preserveUuid: Option[ConfigNodePropertyBoolean] = None,
  preserveUuidNodetypes: Option[ConfigNodePropertyArray] = None,
  preserveUuidSubtrees: Option[ConfigNodePropertyArray] = None,
  autoCommit: Option[ConfigNodePropertyBoolean] = None
)

