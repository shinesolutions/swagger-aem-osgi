package org.openapitools.server.model


/**
 * @param requestLogServiceFormat  for example: ''null''
 * @param requestLogServiceOutput  for example: ''null''
 * @param requestLogServiceOutputtype  for example: ''null''
 * @param requestLogServiceOnentry  for example: ''null''
*/
final case class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties (
  requestLogServiceFormat: Option[ConfigNodePropertyString] = None,
  requestLogServiceOutput: Option[ConfigNodePropertyString] = None,
  requestLogServiceOutputtype: Option[ConfigNodePropertyDropDown] = None,
  requestLogServiceOnentry: Option[ConfigNodePropertyBoolean] = None
)

