package org.openapitools.server.model


/**
 * @param userMapping  for example: ''null''
 * @param userDefault  for example: ''null''
 * @param userEnableDefaultMapping  for example: ''null''
 * @param requireValidation  for example: ''null''
*/
final case class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties (
  userMapping: Option[ConfigNodePropertyArray] = None,
  userDefault: Option[ConfigNodePropertyString] = None,
  userEnableDefaultMapping: Option[ConfigNodePropertyBoolean] = None,
  requireValidation: Option[ConfigNodePropertyBoolean] = None
)

