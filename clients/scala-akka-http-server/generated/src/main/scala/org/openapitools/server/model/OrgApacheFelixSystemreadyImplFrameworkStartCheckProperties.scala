package org.openapitools.server.model


/**
 * @param timeout  for example: ''null''
 * @param targetStartLevel  for example: ''null''
 * @param targetStartLevelPropName  for example: ''null''
 * @param `type`  for example: ''null''
*/
final case class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties (
  timeout: Option[ConfigNodePropertyInteger] = None,
  targetStartLevel: Option[ConfigNodePropertyInteger] = None,
  targetStartLevelPropName: Option[ConfigNodePropertyString] = None,
  `type`: Option[ConfigNodePropertyDropDown] = None
)

