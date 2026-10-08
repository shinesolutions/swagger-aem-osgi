package org.openapitools.server.model


/**
 * @param managerRoot  for example: ''null''
 * @param httpServiceFilter  for example: ''null''
 * @param defaultRender  for example: ''null''
 * @param realm  for example: ''null''
 * @param username  for example: ''null''
 * @param password  for example: ''null''
 * @param category  for example: ''null''
 * @param locale  for example: ''null''
 * @param loglevel  for example: ''null''
 * @param plugins  for example: ''null''
*/
final case class OrgApacheFelixWebconsoleInternalServletOsgiManagerProperties (
  managerRoot: Option[ConfigNodePropertyString] = None,
  httpServiceFilter: Option[ConfigNodePropertyString] = None,
  defaultRender: Option[ConfigNodePropertyString] = None,
  realm: Option[ConfigNodePropertyString] = None,
  username: Option[ConfigNodePropertyString] = None,
  password: Option[ConfigNodePropertyString] = None,
  category: Option[ConfigNodePropertyString] = None,
  locale: Option[ConfigNodePropertyString] = None,
  loglevel: Option[ConfigNodePropertyDropDown] = None,
  plugins: Option[ConfigNodePropertyDropDown] = None
)

