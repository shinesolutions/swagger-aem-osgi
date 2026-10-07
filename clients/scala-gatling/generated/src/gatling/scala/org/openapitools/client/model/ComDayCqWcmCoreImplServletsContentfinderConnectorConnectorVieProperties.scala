
package org.openapitools.client.model


case class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties (
    _itemResourceTypes: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties {
    def toStringBody(var_itemResourceTypes: Object) =
        s"""
        | {
        | "itemResourceTypes":$var_itemResourceTypes
        | }
        """.stripMargin
}
