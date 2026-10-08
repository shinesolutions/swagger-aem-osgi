package org.openapitools.server.model


/**
 * @param slingMaxCalls  for example: ''null''
 * @param slingMaxInclusions  for example: ''null''
 * @param slingTraceAllow  for example: ''null''
 * @param slingMaxRecordRequests  for example: ''null''
 * @param slingStorePatternRequests  for example: ''null''
 * @param slingServerinfo  for example: ''null''
 * @param slingAdditionalResponseHeaders  for example: ''null''
*/
final case class OrgApacheSlingEngineImplSlingMainServletProperties (
  slingMaxCalls: Option[ConfigNodePropertyInteger] = None,
  slingMaxInclusions: Option[ConfigNodePropertyInteger] = None,
  slingTraceAllow: Option[ConfigNodePropertyBoolean] = None,
  slingMaxRecordRequests: Option[ConfigNodePropertyInteger] = None,
  slingStorePatternRequests: Option[ConfigNodePropertyArray] = None,
  slingServerinfo: Option[ConfigNodePropertyString] = None,
  slingAdditionalResponseHeaders: Option[ConfigNodePropertyArray] = None
)

