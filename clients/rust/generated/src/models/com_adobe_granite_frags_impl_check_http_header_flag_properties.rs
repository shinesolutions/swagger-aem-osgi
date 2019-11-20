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
pub struct ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
  #[serde(rename = "feature.name")]
  feature_name: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "feature.description")]
  feature_description: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "http.header.name")]
  http_header_name: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "http.header.valuepattern")]
  http_header_valuepattern: Option<::models::ConfigNodePropertyString>
}

impl ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
  pub fn new() -> ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
      feature_name: None,
      feature_description: None,
      http_header_name: None,
      http_header_valuepattern: None
    }
  }

  pub fn set_feature_name(&mut self, feature_name: ::models::ConfigNodePropertyString) {
    self.feature_name = Some(feature_name);
  }

  pub fn with_feature_name(mut self, feature_name: ::models::ConfigNodePropertyString) -> ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    self.feature_name = Some(feature_name);
    self
  }

  pub fn feature_name(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.feature_name.as_ref()
  }

  pub fn reset_feature_name(&mut self) {
    self.feature_name = None;
  }

  pub fn set_feature_description(&mut self, feature_description: ::models::ConfigNodePropertyString) {
    self.feature_description = Some(feature_description);
  }

  pub fn with_feature_description(mut self, feature_description: ::models::ConfigNodePropertyString) -> ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    self.feature_description = Some(feature_description);
    self
  }

  pub fn feature_description(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.feature_description.as_ref()
  }

  pub fn reset_feature_description(&mut self) {
    self.feature_description = None;
  }

  pub fn set_http_header_name(&mut self, http_header_name: ::models::ConfigNodePropertyString) {
    self.http_header_name = Some(http_header_name);
  }

  pub fn with_http_header_name(mut self, http_header_name: ::models::ConfigNodePropertyString) -> ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    self.http_header_name = Some(http_header_name);
    self
  }

  pub fn http_header_name(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.http_header_name.as_ref()
  }

  pub fn reset_http_header_name(&mut self) {
    self.http_header_name = None;
  }

  pub fn set_http_header_valuepattern(&mut self, http_header_valuepattern: ::models::ConfigNodePropertyString) {
    self.http_header_valuepattern = Some(http_header_valuepattern);
  }

  pub fn with_http_header_valuepattern(mut self, http_header_valuepattern: ::models::ConfigNodePropertyString) -> ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    self.http_header_valuepattern = Some(http_header_valuepattern);
    self
  }

  pub fn http_header_valuepattern(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.http_header_valuepattern.as_ref()
  }

  pub fn reset_http_header_valuepattern(&mut self) {
    self.http_header_valuepattern = None;
  }

}


