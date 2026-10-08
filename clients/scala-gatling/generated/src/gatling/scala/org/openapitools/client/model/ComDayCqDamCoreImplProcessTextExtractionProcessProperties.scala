
package org.openapitools.client.model


case class ComDayCqDamCoreImplProcessTextExtractionProcessProperties (
    _mimeTypes: Option[ConfigNodePropertyArray],
    _maxExtract: Option[ConfigNodePropertyInteger]
)
object ComDayCqDamCoreImplProcessTextExtractionProcessProperties {
    def toStringBody(var_mimeTypes: Object, var_maxExtract: Object) =
        s"""
        | {
        | "mimeTypes":$var_mimeTypes,"maxExtract":$var_maxExtract
        | }
        """.stripMargin
}
