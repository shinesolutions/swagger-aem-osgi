package org.openapitools.server.model


/**
 * @param serviceName  for example: ''null''
 * @param slingServletResourceTypes  for example: ''null''
 * @param slingServletSelectors  for example: ''null''
 * @param slingServletMethods  for example: ''null''
 * @param formsFormchooserservletAdvansesearchRequire  for example: ''null''
*/
final case class ComDayCqWcmFoundationFormsImplFormChooserServletProperties (
  serviceName: Option[ConfigNodePropertyString] = None,
  slingServletResourceTypes: Option[ConfigNodePropertyString] = None,
  slingServletSelectors: Option[ConfigNodePropertyString] = None,
  slingServletMethods: Option[ConfigNodePropertyArray] = None,
  formsFormchooserservletAdvansesearchRequire: Option[ConfigNodePropertyBoolean] = None
)

