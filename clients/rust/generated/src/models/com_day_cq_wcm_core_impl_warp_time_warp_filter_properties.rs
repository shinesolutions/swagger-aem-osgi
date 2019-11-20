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
pub struct ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
  #[serde(rename = "filter.order")]
  filter_order: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "filter.scope")]
  filter_scope: Option<::models::ConfigNodePropertyString>
}

impl ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
  pub fn new() -> ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
    ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
      filter_order: None,
      filter_scope: None
    }
  }

  pub fn set_filter_order(&mut self, filter_order: ::models::ConfigNodePropertyString) {
    self.filter_order = Some(filter_order);
  }

  pub fn with_filter_order(mut self, filter_order: ::models::ConfigNodePropertyString) -> ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
    self.filter_order = Some(filter_order);
    self
  }

  pub fn filter_order(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.filter_order.as_ref()
  }

  pub fn reset_filter_order(&mut self) {
    self.filter_order = None;
  }

  pub fn set_filter_scope(&mut self, filter_scope: ::models::ConfigNodePropertyString) {
    self.filter_scope = Some(filter_scope);
  }

  pub fn with_filter_scope(mut self, filter_scope: ::models::ConfigNodePropertyString) -> ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
    self.filter_scope = Some(filter_scope);
    self
  }

  pub fn filter_scope(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.filter_scope.as_ref()
  }

  pub fn reset_filter_scope(&mut self) {
    self.filter_scope = None;
  }

}


