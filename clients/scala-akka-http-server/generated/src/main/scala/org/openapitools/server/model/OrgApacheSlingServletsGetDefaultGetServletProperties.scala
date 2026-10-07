package org.openapitools.server.model


/**
 * @param aliases  for example: ''null''
 * @param index  for example: ''null''
 * @param indexFiles  for example: ''null''
 * @param enableHtml  for example: ''null''
 * @param enableJson  for example: ''null''
 * @param enableTxt  for example: ''null''
 * @param enableXml  for example: ''null''
 * @param jsonMaximumresults  for example: ''null''
 * @param ecmaSuport  for example: ''null''
*/
final case class OrgApacheSlingServletsGetDefaultGetServletProperties (
  aliases: Option[ConfigNodePropertyArray] = None,
  index: Option[ConfigNodePropertyBoolean] = None,
  indexFiles: Option[ConfigNodePropertyArray] = None,
  enableHtml: Option[ConfigNodePropertyBoolean] = None,
  enableJson: Option[ConfigNodePropertyBoolean] = None,
  enableTxt: Option[ConfigNodePropertyBoolean] = None,
  enableXml: Option[ConfigNodePropertyBoolean] = None,
  jsonMaximumresults: Option[ConfigNodePropertyInteger] = None,
  ecmaSuport: Option[ConfigNodePropertyBoolean] = None
)

