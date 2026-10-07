package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqWcmDesignimporterDesignPackageImporterProperties.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqWcmDesignimporterDesignPackageImporterProperties(
  extractFilter: Option[ConfigNodePropertyArray]
)

object ComDayCqWcmDesignimporterDesignPackageImporterProperties {
  implicit lazy val comDayCqWcmDesignimporterDesignPackageImporterPropertiesJsonFormat: Format[ComDayCqWcmDesignimporterDesignPackageImporterProperties] = Json.format[ComDayCqWcmDesignimporterDesignPackageImporterProperties]
}

