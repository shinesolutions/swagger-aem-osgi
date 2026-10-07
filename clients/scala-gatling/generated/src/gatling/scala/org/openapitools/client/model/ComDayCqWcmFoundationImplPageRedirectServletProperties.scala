
package org.openapitools.client.model


case class ComDayCqWcmFoundationImplPageRedirectServletProperties (
    _excludedResourceTypes: Option[ConfigNodePropertyArray]
)
object ComDayCqWcmFoundationImplPageRedirectServletProperties {
    def toStringBody(var_excludedResourceTypes: Object) =
        s"""
        | {
        | "excludedResourceTypes":$var_excludedResourceTypes
        | }
        """.stripMargin
}
