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
pub struct ComAdobeGraniteCorsImplCorsPolicyImplProperties {
  #[serde(rename = "alloworigin")]
  alloworigin: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "alloworiginregexp")]
  alloworiginregexp: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "allowedpaths")]
  allowedpaths: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "exposedheaders")]
  exposedheaders: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "maxage")]
  maxage: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "supportedheaders")]
  supportedheaders: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "supportedmethods")]
  supportedmethods: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "supportscredentials")]
  supportscredentials: Option<::models::ConfigNodePropertyBoolean>
}

impl ComAdobeGraniteCorsImplCorsPolicyImplProperties {
  pub fn new() -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    ComAdobeGraniteCorsImplCorsPolicyImplProperties {
      alloworigin: None,
      alloworiginregexp: None,
      allowedpaths: None,
      exposedheaders: None,
      maxage: None,
      supportedheaders: None,
      supportedmethods: None,
      supportscredentials: None
    }
  }

  pub fn set_alloworigin(&mut self, alloworigin: ::models::ConfigNodePropertyArray) {
    self.alloworigin = Some(alloworigin);
  }

  pub fn with_alloworigin(mut self, alloworigin: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.alloworigin = Some(alloworigin);
    self
  }

  pub fn alloworigin(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.alloworigin.as_ref()
  }

  pub fn reset_alloworigin(&mut self) {
    self.alloworigin = None;
  }

  pub fn set_alloworiginregexp(&mut self, alloworiginregexp: ::models::ConfigNodePropertyArray) {
    self.alloworiginregexp = Some(alloworiginregexp);
  }

  pub fn with_alloworiginregexp(mut self, alloworiginregexp: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.alloworiginregexp = Some(alloworiginregexp);
    self
  }

  pub fn alloworiginregexp(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.alloworiginregexp.as_ref()
  }

  pub fn reset_alloworiginregexp(&mut self) {
    self.alloworiginregexp = None;
  }

  pub fn set_allowedpaths(&mut self, allowedpaths: ::models::ConfigNodePropertyArray) {
    self.allowedpaths = Some(allowedpaths);
  }

  pub fn with_allowedpaths(mut self, allowedpaths: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.allowedpaths = Some(allowedpaths);
    self
  }

  pub fn allowedpaths(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.allowedpaths.as_ref()
  }

  pub fn reset_allowedpaths(&mut self) {
    self.allowedpaths = None;
  }

  pub fn set_exposedheaders(&mut self, exposedheaders: ::models::ConfigNodePropertyArray) {
    self.exposedheaders = Some(exposedheaders);
  }

  pub fn with_exposedheaders(mut self, exposedheaders: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.exposedheaders = Some(exposedheaders);
    self
  }

  pub fn exposedheaders(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.exposedheaders.as_ref()
  }

  pub fn reset_exposedheaders(&mut self) {
    self.exposedheaders = None;
  }

  pub fn set_maxage(&mut self, maxage: ::models::ConfigNodePropertyInteger) {
    self.maxage = Some(maxage);
  }

  pub fn with_maxage(mut self, maxage: ::models::ConfigNodePropertyInteger) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.maxage = Some(maxage);
    self
  }

  pub fn maxage(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.maxage.as_ref()
  }

  pub fn reset_maxage(&mut self) {
    self.maxage = None;
  }

  pub fn set_supportedheaders(&mut self, supportedheaders: ::models::ConfigNodePropertyArray) {
    self.supportedheaders = Some(supportedheaders);
  }

  pub fn with_supportedheaders(mut self, supportedheaders: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.supportedheaders = Some(supportedheaders);
    self
  }

  pub fn supportedheaders(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.supportedheaders.as_ref()
  }

  pub fn reset_supportedheaders(&mut self) {
    self.supportedheaders = None;
  }

  pub fn set_supportedmethods(&mut self, supportedmethods: ::models::ConfigNodePropertyArray) {
    self.supportedmethods = Some(supportedmethods);
  }

  pub fn with_supportedmethods(mut self, supportedmethods: ::models::ConfigNodePropertyArray) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.supportedmethods = Some(supportedmethods);
    self
  }

  pub fn supportedmethods(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.supportedmethods.as_ref()
  }

  pub fn reset_supportedmethods(&mut self) {
    self.supportedmethods = None;
  }

  pub fn set_supportscredentials(&mut self, supportscredentials: ::models::ConfigNodePropertyBoolean) {
    self.supportscredentials = Some(supportscredentials);
  }

  pub fn with_supportscredentials(mut self, supportscredentials: ::models::ConfigNodePropertyBoolean) -> ComAdobeGraniteCorsImplCorsPolicyImplProperties {
    self.supportscredentials = Some(supportscredentials);
    self
  }

  pub fn supportscredentials(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.supportscredentials.as_ref()
  }

  pub fn reset_supportscredentials(&mut self) {
    self.supportscredentials = None;
  }

}


