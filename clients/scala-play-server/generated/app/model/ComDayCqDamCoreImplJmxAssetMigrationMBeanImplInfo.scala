package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-07T13:00:43.037663378Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo(
  pid: Option[String],
  title: Option[String],
  description: Option[String],
  properties: Option[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties],
  bundleLocation: Option[String],
  serviceLocation: Option[String]
)

object ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo {
  implicit lazy val comDayCqDamCoreImplJmxAssetMigrationMBeanImplInfoJsonFormat: Format[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo] = Json.format[ComDayCqDamCoreImplJmxAssetMigrationMBeanImplInfo]
}

