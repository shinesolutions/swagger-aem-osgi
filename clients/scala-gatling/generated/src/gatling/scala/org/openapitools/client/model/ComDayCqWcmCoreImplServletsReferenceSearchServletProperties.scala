
package org.openapitools.client.model


case class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties (
    _referencesearchservletMaxReferencesPerPage: Option[ConfigNodePropertyInteger],
    _referencesearchservletMaxPages: Option[ConfigNodePropertyInteger]
)
object ComDayCqWcmCoreImplServletsReferenceSearchServletProperties {
    def toStringBody(var_referencesearchservletMaxReferencesPerPage: Object, var_referencesearchservletMaxPages: Object) =
        s"""
        | {
        | "referencesearchservletMaxReferencesPerPage":$var_referencesearchservletMaxReferencesPerPage,"referencesearchservletMaxPages":$var_referencesearchservletMaxPages
        | }
        """.stripMargin
}
