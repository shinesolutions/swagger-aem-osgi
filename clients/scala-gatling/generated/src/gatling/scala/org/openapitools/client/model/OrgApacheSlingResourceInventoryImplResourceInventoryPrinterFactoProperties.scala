
package org.openapitools.client.model


case class OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties (
    _felixInventoryPrinterName: Option[ConfigNodePropertyString],
    _felixInventoryPrinterTitle: Option[ConfigNodePropertyString],
    _path: Option[ConfigNodePropertyString]
)
object OrgApacheSlingResourceInventoryImplResourceInventoryPrinterFactoProperties {
    def toStringBody(var_felixInventoryPrinterName: Object, var_felixInventoryPrinterTitle: Object, var_path: Object) =
        s"""
        | {
        | "felixInventoryPrinterName":$var_felixInventoryPrinterName,"felixInventoryPrinterTitle":$var_felixInventoryPrinterTitle,"path":$var_path
        | }
        """.stripMargin
}
