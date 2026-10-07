
package org.openapitools.client.model


case class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties (
    _getSystemWorkflowModels: Option[ConfigNodePropertyArray],
    _getPackageRootPath: Option[ConfigNodePropertyString]
)
object ComAdobeGraniteWorkflowCorePayloadMapCacheProperties {
    def toStringBody(var_getSystemWorkflowModels: Object, var_getPackageRootPath: Object) =
        s"""
        | {
        | "getSystemWorkflowModels":$var_getSystemWorkflowModels,"getPackageRootPath":$var_getPackageRootPath
        | }
        """.stripMargin
}
