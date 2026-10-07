
package org.openapitools.client.model


case class ComDayCqDamCoreImplDamChangeEventListenerProperties (
    _changeeventlistenerObservedPaths: Option[ConfigNodePropertyArray]
)
object ComDayCqDamCoreImplDamChangeEventListenerProperties {
    def toStringBody(var_changeeventlistenerObservedPaths: Object) =
        s"""
        | {
        | "changeeventlistenerObservedPaths":$var_changeeventlistenerObservedPaths
        | }
        """.stripMargin
}
