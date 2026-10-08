
package org.openapitools.client.model


case class OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties (
    _maxRecursionLevels: Option[ConfigNodePropertyInteger]
)
object OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties {
    def toStringBody(var_maxRecursionLevels: Object) =
        s"""
        | {
        | "maxRecursionLevels":$var_maxRecursionLevels
        | }
        """.stripMargin
}
