
package org.openapitools.client.model


case class OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties (
    _mimeTypes: Option[ConfigNodePropertyArray]
)
object OrgApacheSlingCommonsMimeInternalMimeTypeServiceImplProperties {
    def toStringBody(var_mimeTypes: Object) =
        s"""
        | {
        | "mimeTypes":$var_mimeTypes
        | }
        """.stripMargin
}
