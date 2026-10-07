package org.openapitools.server.model


/**
 * @param requestLogOutput  for example: ''null''
 * @param requestLogOutputtype  for example: ''null''
 * @param requestLogEnabled  for example: ''null''
 * @param accessLogOutput  for example: ''null''
 * @param accessLogOutputtype  for example: ''null''
 * @param accessLogEnabled  for example: ''null''
*/
final case class OrgApacheSlingEngineImplLogRequestLoggerProperties (
  requestLogOutput: Option[ConfigNodePropertyString] = None,
  requestLogOutputtype: Option[ConfigNodePropertyDropDown] = None,
  requestLogEnabled: Option[ConfigNodePropertyBoolean] = None,
  accessLogOutput: Option[ConfigNodePropertyString] = None,
  accessLogOutputtype: Option[ConfigNodePropertyDropDown] = None,
  accessLogEnabled: Option[ConfigNodePropertyBoolean] = None
)

