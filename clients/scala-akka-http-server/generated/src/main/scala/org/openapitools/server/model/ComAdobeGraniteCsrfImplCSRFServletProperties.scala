package org.openapitools.server.model


/**
 * @param csrfTokenExpiresIn  for example: ''null''
 * @param slingAuthRequirements  for example: ''null''
*/
final case class ComAdobeGraniteCsrfImplCSRFServletProperties (
  csrfTokenExpiresIn: Option[ConfigNodePropertyInteger] = None,
  slingAuthRequirements: Option[ConfigNodePropertyString] = None
)

