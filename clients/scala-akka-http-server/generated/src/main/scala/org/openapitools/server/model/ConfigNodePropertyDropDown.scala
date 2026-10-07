package org.openapitools.server.model


/**
 * @param name property name for example: ''null''
 * @param optional True if optional for example: ''null''
 * @param isSet True if property is set for example: ''null''
 * @param `type`  for example: ''null''
 * @param value Property value for example: ''null''
 * @param description Property description for example: ''null''
*/
final case class ConfigNodePropertyDropDown (
  name: Option[String] = None,
  optional: Option[Boolean] = None,
  isSet: Option[Boolean] = None,
  `type`: Option[ConfigNodePropertyDropDownType] = None,
  value: Option[AnyType] = None,
  description: Option[String] = None
)

