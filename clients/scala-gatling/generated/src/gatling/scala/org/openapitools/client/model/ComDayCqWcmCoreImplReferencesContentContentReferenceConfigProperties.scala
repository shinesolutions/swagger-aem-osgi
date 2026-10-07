
package org.openapitools.client.model


case class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties (
    _contentReferenceConfigResourceTypes: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties {
    def toStringBody(var_contentReferenceConfigResourceTypes: Object) =
        s"""
        | {
        | "contentReferenceConfigResourceTypes":$var_contentReferenceConfigResourceTypes
        | }
        """.stripMargin
}
