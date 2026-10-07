
package org.openapitools.client.model


case class ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties (
    _effectiveBundleListPath: Option[ConfigNodePropertyString]
)
object ComDayCqCompatCodeupgradeImplVersionRangeTaskIgnorelistProperties {
    def toStringBody(var_effectiveBundleListPath: Object) =
        s"""
        | {
        | "effectiveBundleListPath":$var_effectiveBundleListPath
        | }
        """.stripMargin
}
