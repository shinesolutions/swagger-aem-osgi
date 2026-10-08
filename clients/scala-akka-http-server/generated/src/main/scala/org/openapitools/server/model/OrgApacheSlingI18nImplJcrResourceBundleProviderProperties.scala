package org.openapitools.server.model


/**
 * @param localeDefault  for example: ''null''
 * @param preloadBundles  for example: ''null''
 * @param invalidationDelay  for example: ''null''
*/
final case class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties (
  localeDefault: Option[ConfigNodePropertyString] = None,
  preloadBundles: Option[ConfigNodePropertyBoolean] = None,
  invalidationDelay: Option[ConfigNodePropertyInteger] = None
)

