package org.openapitools.server.model


/**
 * @param schedulerExpression  for example: ''null''
 * @param jmxObjectname  for example: ''null''
*/
final case class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties (
  schedulerExpression: Option[ConfigNodePropertyString] = None,
  jmxObjectname: Option[ConfigNodePropertyString] = None
)

