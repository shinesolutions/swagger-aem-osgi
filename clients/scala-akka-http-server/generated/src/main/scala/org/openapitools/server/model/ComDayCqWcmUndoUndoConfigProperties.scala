package org.openapitools.server.model


/**
 * @param cqWcmUndoEnabled  for example: ''null''
 * @param cqWcmUndoPath  for example: ''null''
 * @param cqWcmUndoValidity  for example: ''null''
 * @param cqWcmUndoSteps  for example: ''null''
 * @param cqWcmUndoPersistence  for example: ''null''
 * @param cqWcmUndoPersistenceMode  for example: ''null''
 * @param cqWcmUndoMarkermode  for example: ''null''
 * @param cqWcmUndoWhitelist  for example: ''null''
 * @param cqWcmUndoBlacklist  for example: ''null''
*/
final case class ComDayCqWcmUndoUndoConfigProperties (
  cqWcmUndoEnabled: Option[ConfigNodePropertyBoolean] = None,
  cqWcmUndoPath: Option[ConfigNodePropertyString] = None,
  cqWcmUndoValidity: Option[ConfigNodePropertyInteger] = None,
  cqWcmUndoSteps: Option[ConfigNodePropertyInteger] = None,
  cqWcmUndoPersistence: Option[ConfigNodePropertyString] = None,
  cqWcmUndoPersistenceMode: Option[ConfigNodePropertyBoolean] = None,
  cqWcmUndoMarkermode: Option[ConfigNodePropertyString] = None,
  cqWcmUndoWhitelist: Option[ConfigNodePropertyArray] = None,
  cqWcmUndoBlacklist: Option[ConfigNodePropertyArray] = None
)

