
package org.openapitools.client.model


case class ComDayCqWcmCoreImplEventTemplatePostProcessorProperties (
    _paths: Option[ConfigNodePropertyString]
)
object ComDayCqWcmCoreImplEventTemplatePostProcessorProperties {
    def toStringBody(var_paths: Object) =
        s"""
        | {
        | "paths":$var_paths
        | }
        """.stripMargin
}
