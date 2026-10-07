package org.openapitools.server.model


/**
 * @param slingDefaultParameterEncoding  for example: ''null''
 * @param slingDefaultMaxParameters  for example: ''null''
 * @param fileLocation  for example: ''null''
 * @param fileThreshold  for example: ''null''
 * @param fileMax  for example: ''null''
 * @param requestMax  for example: ''null''
 * @param slingDefaultParameterCheckForAdditionalContainerParameters  for example: ''null''
*/
final case class OrgApacheSlingEngineParametersProperties (
  slingDefaultParameterEncoding: Option[ConfigNodePropertyString] = None,
  slingDefaultMaxParameters: Option[ConfigNodePropertyInteger] = None,
  fileLocation: Option[ConfigNodePropertyString] = None,
  fileThreshold: Option[ConfigNodePropertyInteger] = None,
  fileMax: Option[ConfigNodePropertyInteger] = None,
  requestMax: Option[ConfigNodePropertyInteger] = None,
  slingDefaultParameterCheckForAdditionalContainerParameters: Option[ConfigNodePropertyBoolean] = None
)

