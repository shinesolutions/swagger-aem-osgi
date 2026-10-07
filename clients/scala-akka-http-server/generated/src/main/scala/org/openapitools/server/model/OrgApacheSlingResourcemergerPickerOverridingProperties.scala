package org.openapitools.server.model


/**
 * @param mergeRoot  for example: ''null''
 * @param mergeReadOnly  for example: ''null''
*/
final case class OrgApacheSlingResourcemergerPickerOverridingProperties (
  mergeRoot: Option[ConfigNodePropertyString] = None,
  mergeReadOnly: Option[ConfigNodePropertyBoolean] = None
)

