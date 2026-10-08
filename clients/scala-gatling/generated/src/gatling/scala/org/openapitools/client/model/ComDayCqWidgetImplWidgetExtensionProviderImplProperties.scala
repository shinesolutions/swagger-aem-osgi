
package org.openapitools.client.model


case class ComDayCqWidgetImplWidgetExtensionProviderImplProperties (
    _extendableWidgets: Option[ConfigNodePropertyArray],
    _widgetextensionproviderDebug: Option[ConfigNodePropertyBoolean]
)
object ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
    def toStringBody(var_extendableWidgets: Object, var_widgetextensionproviderDebug: Object) =
        s"""
        | {
        | "extendableWidgets":$var_extendableWidgets,"widgetextensionproviderDebug":$var_widgetextensionproviderDebug
        | }
        """.stripMargin
}
