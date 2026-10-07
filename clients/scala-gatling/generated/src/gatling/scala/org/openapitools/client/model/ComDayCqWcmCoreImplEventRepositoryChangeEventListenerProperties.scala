
package org.openapitools.client.model


case class ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties (
    _paths: Option[ConfigNodePropertyArray],
    _excludedPaths: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties {
    def toStringBody(var_paths: Object, var_excludedPaths: Object) =
        s"""
        | {
        | "paths":$var_paths,"excludedPaths":$var_excludedPaths
        | }
        """.stripMargin
}
