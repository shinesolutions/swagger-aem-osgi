package org.openapitools.server.model


/**
 * @param labels Drop Down label for example: ''null''
 * @param values Drown Down value for example: ''null''
*/
final case class ConfigNodePropertyDropDownType (
  labels: Option[AnyType] = None,
  values: Option[AnyType] = None
)

