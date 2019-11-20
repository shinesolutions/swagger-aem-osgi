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
pub struct OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
  #[serde(rename = "enabled")]
  enabled: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "configRefResourceNames")]
  config_ref_resource_names: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "configRefPropertyNames")]
  config_ref_property_names: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "service.ranking")]
  service_ranking: Option<::models::ConfigNodePropertyInteger>
}

impl OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
  pub fn new() -> OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
      enabled: None,
      config_ref_resource_names: None,
      config_ref_property_names: None,
      service_ranking: None
    }
  }

  pub fn set_enabled(&mut self, enabled: ::models::ConfigNodePropertyBoolean) {
    self.enabled = Some(enabled);
  }

  pub fn with_enabled(mut self, enabled: ::models::ConfigNodePropertyBoolean) -> OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    self.enabled = Some(enabled);
    self
  }

  pub fn enabled(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.enabled.as_ref()
  }

  pub fn reset_enabled(&mut self) {
    self.enabled = None;
  }

  pub fn set_config_ref_resource_names(&mut self, config_ref_resource_names: ::models::ConfigNodePropertyArray) {
    self.config_ref_resource_names = Some(config_ref_resource_names);
  }

  pub fn with_config_ref_resource_names(mut self, config_ref_resource_names: ::models::ConfigNodePropertyArray) -> OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    self.config_ref_resource_names = Some(config_ref_resource_names);
    self
  }

  pub fn config_ref_resource_names(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.config_ref_resource_names.as_ref()
  }

  pub fn reset_config_ref_resource_names(&mut self) {
    self.config_ref_resource_names = None;
  }

  pub fn set_config_ref_property_names(&mut self, config_ref_property_names: ::models::ConfigNodePropertyArray) {
    self.config_ref_property_names = Some(config_ref_property_names);
  }

  pub fn with_config_ref_property_names(mut self, config_ref_property_names: ::models::ConfigNodePropertyArray) -> OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    self.config_ref_property_names = Some(config_ref_property_names);
    self
  }

  pub fn config_ref_property_names(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.config_ref_property_names.as_ref()
  }

  pub fn reset_config_ref_property_names(&mut self) {
    self.config_ref_property_names = None;
  }

  pub fn set_service_ranking(&mut self, service_ranking: ::models::ConfigNodePropertyInteger) {
    self.service_ranking = Some(service_ranking);
  }

  pub fn with_service_ranking(mut self, service_ranking: ::models::ConfigNodePropertyInteger) -> OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties {
    self.service_ranking = Some(service_ranking);
    self
  }

  pub fn service_ranking(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.service_ranking.as_ref()
  }

  pub fn reset_service_ranking(&mut self) {
    self.service_ranking = None;
  }

}


