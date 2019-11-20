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
pub struct OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
  #[serde(rename = "length")]
  length: Option<::models::ConfigNodePropertyInteger>
}

impl OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
  pub fn new() -> OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
      length: None
    }
  }

  pub fn set_length(&mut self, length: ::models::ConfigNodePropertyInteger) {
    self.length = Some(length);
  }

  pub fn with_length(mut self, length: ::models::ConfigNodePropertyInteger) -> OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties {
    self.length = Some(length);
    self
  }

  pub fn length(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.length.as_ref()
  }

  pub fn reset_length(&mut self) {
    self.length = None;
  }

}


