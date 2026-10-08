
package org.openapitools.client.model


case class ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties (
    _legacyCloudUGCPathMapping: Option[ConfigNodePropertyBoolean]
)
object ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties {
    def toStringBody(var_legacyCloudUGCPathMapping: Object) =
        s"""
        | {
        | "legacyCloudUGCPathMapping":$var_legacyCloudUGCPathMapping
        | }
        """.stripMargin
}
