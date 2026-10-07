
package org.openapitools.client.model


case class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties (
    _jmxObjectname: Option[ConfigNodePropertyString],
    _propertyMeasureEnabled: Option[ConfigNodePropertyBoolean],
    _propertyName: Option[ConfigNodePropertyString],
    _propertyMaxWaitMs: Option[ConfigNodePropertyInteger],
    _propertyMaxRate: Option[ConfigNodePropertyFloat],
    _fulltextMeasureEnabled: Option[ConfigNodePropertyBoolean],
    _fulltextName: Option[ConfigNodePropertyString],
    _fulltextMaxWaitMs: Option[ConfigNodePropertyInteger],
    _fulltextMaxRate: Option[ConfigNodePropertyFloat]
)
object ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
    def toStringBody(var_jmxObjectname: Object, var_propertyMeasureEnabled: Object, var_propertyName: Object, var_propertyMaxWaitMs: Object, var_propertyMaxRate: Object, var_fulltextMeasureEnabled: Object, var_fulltextName: Object, var_fulltextMaxWaitMs: Object, var_fulltextMaxRate: Object) =
        s"""
        | {
        | "jmxObjectname":$var_jmxObjectname,"propertyMeasureEnabled":$var_propertyMeasureEnabled,"propertyName":$var_propertyName,"propertyMaxWaitMs":$var_propertyMaxWaitMs,"propertyMaxRate":$var_propertyMaxRate,"fulltextMeasureEnabled":$var_fulltextMeasureEnabled,"fulltextName":$var_fulltextName,"fulltextMaxWaitMs":$var_fulltextMaxWaitMs,"fulltextMaxRate":$var_fulltextMaxRate
        | }
        """.stripMargin
}
