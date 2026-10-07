
package org.openapitools.client.model


case class ComDayCqSearchImplBuilderQueryBuilderImplProperties (
    _excerptProperties: Option[ConfigNodePropertyArray],
    _cacheMaxEntries: Option[ConfigNodePropertyInteger],
    _cacheEntryLifetime: Option[ConfigNodePropertyInteger],
    _xpathUnion: Option[ConfigNodePropertyBoolean]
)
object ComDayCqSearchImplBuilderQueryBuilderImplProperties {
    def toStringBody(var_excerptProperties: Object, var_cacheMaxEntries: Object, var_cacheEntryLifetime: Object, var_xpathUnion: Object) =
        s"""
        | {
        | "excerptProperties":$var_excerptProperties,"cacheMaxEntries":$var_cacheMaxEntries,"cacheEntryLifetime":$var_cacheEntryLifetime,"xpathUnion":$var_xpathUnion
        | }
        """.stripMargin
}
