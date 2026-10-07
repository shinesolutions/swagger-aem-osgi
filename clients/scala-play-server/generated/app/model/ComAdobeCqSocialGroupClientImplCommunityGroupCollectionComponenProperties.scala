package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties(
  groupListingPaginationEnable: Option[ConfigNodePropertyBoolean],
  groupListingLazyloadingEnable: Option[ConfigNodePropertyBoolean],
  pageSize: Option[ConfigNodePropertyInteger],
  priority: Option[ConfigNodePropertyInteger]
)

object ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {
  implicit lazy val comAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenPropertiesJsonFormat: Format[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties] = Json.format[ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties]
}

