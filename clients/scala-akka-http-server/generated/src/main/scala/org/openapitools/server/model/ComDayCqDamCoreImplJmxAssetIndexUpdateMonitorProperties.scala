package org.openapitools.server.model


/**
 * @param jmxObjectname  for example: ''null''
 * @param propertyMeasureEnabled  for example: ''null''
 * @param propertyName  for example: ''null''
 * @param propertyMaxWaitMs  for example: ''null''
 * @param propertyMaxRate  for example: ''null''
 * @param fulltextMeasureEnabled  for example: ''null''
 * @param fulltextName  for example: ''null''
 * @param fulltextMaxWaitMs  for example: ''null''
 * @param fulltextMaxRate  for example: ''null''
*/
final case class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties (
  jmxObjectname: Option[ConfigNodePropertyString] = None,
  propertyMeasureEnabled: Option[ConfigNodePropertyBoolean] = None,
  propertyName: Option[ConfigNodePropertyString] = None,
  propertyMaxWaitMs: Option[ConfigNodePropertyInteger] = None,
  propertyMaxRate: Option[ConfigNodePropertyFloat] = None,
  fulltextMeasureEnabled: Option[ConfigNodePropertyBoolean] = None,
  fulltextName: Option[ConfigNodePropertyString] = None,
  fulltextMaxWaitMs: Option[ConfigNodePropertyInteger] = None,
  fulltextMaxRate: Option[ConfigNodePropertyFloat] = None
)

