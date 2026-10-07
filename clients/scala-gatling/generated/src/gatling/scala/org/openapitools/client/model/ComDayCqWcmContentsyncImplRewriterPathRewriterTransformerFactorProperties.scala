
package org.openapitools.client.model


case class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties (
    _cqContentsyncPathrewritertransformerMappingLinks: Option[ConfigNodePropertyArray],
    _cqContentsyncPathrewritertransformerMappingClientlibs: Option[ConfigNodePropertyArray],
    _cqContentsyncPathrewritertransformerMappingImages: Option[ConfigNodePropertyArray],
    _cqContentsyncPathrewritertransformerAttributePattern: Option[ConfigNodePropertyString],
    _cqContentsyncPathrewritertransformerClientlibraryPattern: Option[ConfigNodePropertyString],
    _cqContentsyncPathrewritertransformerClientlibraryReplace: Option[ConfigNodePropertyString]
)
object ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {
    def toStringBody(var_cqContentsyncPathrewritertransformerMappingLinks: Object, var_cqContentsyncPathrewritertransformerMappingClientlibs: Object, var_cqContentsyncPathrewritertransformerMappingImages: Object, var_cqContentsyncPathrewritertransformerAttributePattern: Object, var_cqContentsyncPathrewritertransformerClientlibraryPattern: Object, var_cqContentsyncPathrewritertransformerClientlibraryReplace: Object) =
        s"""
        | {
        | "cqContentsyncPathrewritertransformerMappingLinks":$var_cqContentsyncPathrewritertransformerMappingLinks,"cqContentsyncPathrewritertransformerMappingClientlibs":$var_cqContentsyncPathrewritertransformerMappingClientlibs,"cqContentsyncPathrewritertransformerMappingImages":$var_cqContentsyncPathrewritertransformerMappingImages,"cqContentsyncPathrewritertransformerAttributePattern":$var_cqContentsyncPathrewritertransformerAttributePattern,"cqContentsyncPathrewritertransformerClientlibraryPattern":$var_cqContentsyncPathrewritertransformerClientlibraryPattern,"cqContentsyncPathrewritertransformerClientlibraryReplace":$var_cqContentsyncPathrewritertransformerClientlibraryReplace
        | }
        """.stripMargin
}
