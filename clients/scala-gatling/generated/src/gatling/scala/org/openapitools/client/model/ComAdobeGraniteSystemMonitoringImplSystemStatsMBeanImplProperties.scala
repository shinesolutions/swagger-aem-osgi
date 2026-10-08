
package org.openapitools.client.model


case class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties (
    _schedulerExpression: Option[ConfigNodePropertyString],
    _jmxObjectname: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {
    def toStringBody(var_schedulerExpression: Object, var_jmxObjectname: Object) =
        s"""
        | {
        | "schedulerExpression":$var_schedulerExpression,"jmxObjectname":$var_jmxObjectname
        | }
        """.stripMargin
}
