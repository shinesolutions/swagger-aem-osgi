
package org.openapitools.client.model


case class ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties (
    _processLabel: Option[ConfigNodePropertyString],
    _extractPages: Option[ConfigNodePropertyBoolean]
)
object ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {
    def toStringBody(var_processLabel: Object, var_extractPages: Object) =
        s"""
        | {
        | "processLabel":$var_processLabel,"extractPages":$var_extractPages
        | }
        """.stripMargin
}
