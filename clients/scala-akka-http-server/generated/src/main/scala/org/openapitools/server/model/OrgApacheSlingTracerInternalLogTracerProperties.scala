package org.openapitools.server.model


/**
 * @param tracerSets  for example: ''null''
 * @param enabled  for example: ''null''
 * @param servletEnabled  for example: ''null''
 * @param recordingCacheSizeInMB  for example: ''null''
 * @param recordingCacheDurationInSecs  for example: ''null''
 * @param recordingCompressionEnabled  for example: ''null''
 * @param gzipResponse  for example: ''null''
*/
final case class OrgApacheSlingTracerInternalLogTracerProperties (
  tracerSets: Option[ConfigNodePropertyArray] = None,
  enabled: Option[ConfigNodePropertyBoolean] = None,
  servletEnabled: Option[ConfigNodePropertyBoolean] = None,
  recordingCacheSizeInMB: Option[ConfigNodePropertyInteger] = None,
  recordingCacheDurationInSecs: Option[ConfigNodePropertyInteger] = None,
  recordingCompressionEnabled: Option[ConfigNodePropertyBoolean] = None,
  gzipResponse: Option[ConfigNodePropertyBoolean] = None
)

