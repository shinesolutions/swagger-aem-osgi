
package org.openapitools.client.model


case class ComDayCqWcmCoreImplEventPagePostProcessorProperties (
    _paths: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplEventPagePostProcessorProperties {
    def toStringBody(var_paths: Object) =
        s"""
        | {
        | "paths":$var_paths
        | }
        """.stripMargin
}
