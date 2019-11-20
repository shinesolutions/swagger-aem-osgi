/* 
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct ComDayCqWcmCoreImplVersionPurgeTaskProperties {
  #[serde(rename = "versionpurge.paths")]
  versionpurge_paths: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "versionpurge.recursive")]
  versionpurge_recursive: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "versionpurge.maxVersions")]
  versionpurge_max_versions: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "versionpurge.minVersions")]
  versionpurge_min_versions: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "versionpurge.maxAgeDays")]
  versionpurge_max_age_days: Option<::models::ConfigNodePropertyInteger>
}

impl ComDayCqWcmCoreImplVersionPurgeTaskProperties {
  pub fn new() -> ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    ComDayCqWcmCoreImplVersionPurgeTaskProperties {
      versionpurge_paths: None,
      versionpurge_recursive: None,
      versionpurge_max_versions: None,
      versionpurge_min_versions: None,
      versionpurge_max_age_days: None
    }
  }

  pub fn set_versionpurge_paths(&mut self, versionpurge_paths: ::models::ConfigNodePropertyArray) {
    self.versionpurge_paths = Some(versionpurge_paths);
  }

  pub fn with_versionpurge_paths(mut self, versionpurge_paths: ::models::ConfigNodePropertyArray) -> ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    self.versionpurge_paths = Some(versionpurge_paths);
    self
  }

  pub fn versionpurge_paths(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.versionpurge_paths.as_ref()
  }

  pub fn reset_versionpurge_paths(&mut self) {
    self.versionpurge_paths = None;
  }

  pub fn set_versionpurge_recursive(&mut self, versionpurge_recursive: ::models::ConfigNodePropertyBoolean) {
    self.versionpurge_recursive = Some(versionpurge_recursive);
  }

  pub fn with_versionpurge_recursive(mut self, versionpurge_recursive: ::models::ConfigNodePropertyBoolean) -> ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    self.versionpurge_recursive = Some(versionpurge_recursive);
    self
  }

  pub fn versionpurge_recursive(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.versionpurge_recursive.as_ref()
  }

  pub fn reset_versionpurge_recursive(&mut self) {
    self.versionpurge_recursive = None;
  }

  pub fn set_versionpurge_max_versions(&mut self, versionpurge_max_versions: ::models::ConfigNodePropertyInteger) {
    self.versionpurge_max_versions = Some(versionpurge_max_versions);
  }

  pub fn with_versionpurge_max_versions(mut self, versionpurge_max_versions: ::models::ConfigNodePropertyInteger) -> ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    self.versionpurge_max_versions = Some(versionpurge_max_versions);
    self
  }

  pub fn versionpurge_max_versions(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.versionpurge_max_versions.as_ref()
  }

  pub fn reset_versionpurge_max_versions(&mut self) {
    self.versionpurge_max_versions = None;
  }

  pub fn set_versionpurge_min_versions(&mut self, versionpurge_min_versions: ::models::ConfigNodePropertyInteger) {
    self.versionpurge_min_versions = Some(versionpurge_min_versions);
  }

  pub fn with_versionpurge_min_versions(mut self, versionpurge_min_versions: ::models::ConfigNodePropertyInteger) -> ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    self.versionpurge_min_versions = Some(versionpurge_min_versions);
    self
  }

  pub fn versionpurge_min_versions(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.versionpurge_min_versions.as_ref()
  }

  pub fn reset_versionpurge_min_versions(&mut self) {
    self.versionpurge_min_versions = None;
  }

  pub fn set_versionpurge_max_age_days(&mut self, versionpurge_max_age_days: ::models::ConfigNodePropertyInteger) {
    self.versionpurge_max_age_days = Some(versionpurge_max_age_days);
  }

  pub fn with_versionpurge_max_age_days(mut self, versionpurge_max_age_days: ::models::ConfigNodePropertyInteger) -> ComDayCqWcmCoreImplVersionPurgeTaskProperties {
    self.versionpurge_max_age_days = Some(versionpurge_max_age_days);
    self
  }

  pub fn versionpurge_max_age_days(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.versionpurge_max_age_days.as_ref()
  }

  pub fn reset_versionpurge_max_age_days(&mut self) {
    self.versionpurge_max_age_days = None;
  }

}


