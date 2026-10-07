
package org.openapitools.client.model


case class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties (
    _cqDamScene7ConfigurationeventlistenerEnabled: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties {
    def toStringBody(var_cqDamScene7ConfigurationeventlistenerEnabled: Object) =
        s"""
        | {
        | "cqDamScene7ConfigurationeventlistenerEnabled":$var_cqDamScene7ConfigurationeventlistenerEnabled
        | }
        """.stripMargin
}
