
package org.openapitools.client.model


case class ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties (
    _cqDamS7damDamchangeeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamS7damCommonS7damDamChangeEventListenerProperties {
    def toStringBody(var_cqDamS7damDamchangeeventlistenerEnabled: Object) =
        s"""
        | {
        | "cqDamS7damDamchangeeventlistenerEnabled":$var_cqDamS7damDamchangeeventlistenerEnabled
        | }
        """.stripMargin
}
