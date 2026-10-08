package org.openapitools.server.model


/**
 * @param extensions  for example: ''null''
 * @param minDurationMs  for example: ''null''
 * @param maxDurationMs  for example: ''null''
 * @param compactLogFormat  for example: ''null''
*/
final case class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties (
  extensions: Option[ConfigNodePropertyArray] = None,
  minDurationMs: Option[ConfigNodePropertyInteger] = None,
  maxDurationMs: Option[ConfigNodePropertyInteger] = None,
  compactLogFormat: Option[ConfigNodePropertyBoolean] = None
)

