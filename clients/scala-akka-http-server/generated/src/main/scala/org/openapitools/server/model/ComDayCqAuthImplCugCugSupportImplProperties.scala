package org.openapitools.server.model


/**
 * @param cugExemptedPrincipals  for example: ''null''
 * @param cugEnabled  for example: ''null''
 * @param cugPrincipalsRegex  for example: ''null''
 * @param cugPrincipalsReplacement  for example: ''null''
*/
final case class ComDayCqAuthImplCugCugSupportImplProperties (
  cugExemptedPrincipals: Option[ConfigNodePropertyArray] = None,
  cugEnabled: Option[ConfigNodePropertyBoolean] = None,
  cugPrincipalsRegex: Option[ConfigNodePropertyString] = None,
  cugPrincipalsReplacement: Option[ConfigNodePropertyString] = None
)

