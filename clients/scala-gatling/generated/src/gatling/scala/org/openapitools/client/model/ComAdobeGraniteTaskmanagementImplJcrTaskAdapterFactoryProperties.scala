
package org.openapitools.client.model


case class ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties (
    _adapterCondition: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteTaskmanagementImplJcrTaskAdapterFactoryProperties {
    def toStringBody(var_adapterCondition: Object) =
        s"""
        | {
        | "adapterCondition":$var_adapterCondition
        | }
        """.stripMargin
}
