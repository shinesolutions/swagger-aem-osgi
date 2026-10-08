
package org.openapitools.client.model


case class ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties (
    _cqDamScene7DamchangeeventlistenerEnabled: Option[ConfigNodePropertyBoolean],
    _cqDamScene7DamchangeeventlistenerObservedPaths: Option[ConfigNodePropertyArray]
)
object ComDayCqDamScene7ImplScene7DamChangeEventListenerProperties {
    def toStringBody(var_cqDamScene7DamchangeeventlistenerEnabled: Object, var_cqDamScene7DamchangeeventlistenerObservedPaths: Object) =
        s"""
        | {
        | "cqDamScene7DamchangeeventlistenerEnabled":$var_cqDamScene7DamchangeeventlistenerEnabled,"cqDamScene7DamchangeeventlistenerObservedPaths":$var_cqDamScene7DamchangeeventlistenerObservedPaths
        | }
        """.stripMargin
}
