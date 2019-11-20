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
pub struct ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
  #[serde(rename = "testandtarget.endpoint.url")]
  testandtarget_endpoint_url: Option<::models::ConfigNodePropertyString>
}

impl ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
  pub fn new() -> ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
      testandtarget_endpoint_url: None
    }
  }

  pub fn set_testandtarget_endpoint_url(&mut self, testandtarget_endpoint_url: ::models::ConfigNodePropertyString) {
    self.testandtarget_endpoint_url = Some(testandtarget_endpoint_url);
  }

  pub fn with_testandtarget_endpoint_url(mut self, testandtarget_endpoint_url: ::models::ConfigNodePropertyString) -> ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
    self.testandtarget_endpoint_url = Some(testandtarget_endpoint_url);
    self
  }

  pub fn testandtarget_endpoint_url(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.testandtarget_endpoint_url.as_ref()
  }

  pub fn reset_testandtarget_endpoint_url(&mut self) {
    self.testandtarget_endpoint_url = None;
  }

}


