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
pub struct ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
  #[serde(rename = "linkcheckertransformer.disableRewriting")]
  linkcheckertransformer_disable_rewriting: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "linkcheckertransformer.disableChecking")]
  linkcheckertransformer_disable_checking: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "linkcheckertransformer.mapCacheSize")]
  linkcheckertransformer_map_cache_size: Option<::models::ConfigNodePropertyInteger>,
  #[serde(rename = "linkcheckertransformer.strictExtensionCheck")]
  linkcheckertransformer_strict_extension_check: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "linkcheckertransformer.stripHtmltExtension")]
  linkcheckertransformer_strip_htmlt_extension: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "linkcheckertransformer.rewriteElements")]
  linkcheckertransformer_rewrite_elements: Option<::models::ConfigNodePropertyArray>,
  #[serde(rename = "linkcheckertransformer.stripExtensionPathBlacklist")]
  linkcheckertransformer_strip_extension_path_blacklist: Option<::models::ConfigNodePropertyArray>
}

impl ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
  pub fn new() -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
      linkcheckertransformer_disable_rewriting: None,
      linkcheckertransformer_disable_checking: None,
      linkcheckertransformer_map_cache_size: None,
      linkcheckertransformer_strict_extension_check: None,
      linkcheckertransformer_strip_htmlt_extension: None,
      linkcheckertransformer_rewrite_elements: None,
      linkcheckertransformer_strip_extension_path_blacklist: None
    }
  }

  pub fn set_linkcheckertransformer_disable_rewriting(&mut self, linkcheckertransformer_disable_rewriting: ::models::ConfigNodePropertyBoolean) {
    self.linkcheckertransformer_disable_rewriting = Some(linkcheckertransformer_disable_rewriting);
  }

  pub fn with_linkcheckertransformer_disable_rewriting(mut self, linkcheckertransformer_disable_rewriting: ::models::ConfigNodePropertyBoolean) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_disable_rewriting = Some(linkcheckertransformer_disable_rewriting);
    self
  }

  pub fn linkcheckertransformer_disable_rewriting(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.linkcheckertransformer_disable_rewriting.as_ref()
  }

  pub fn reset_linkcheckertransformer_disable_rewriting(&mut self) {
    self.linkcheckertransformer_disable_rewriting = None;
  }

  pub fn set_linkcheckertransformer_disable_checking(&mut self, linkcheckertransformer_disable_checking: ::models::ConfigNodePropertyBoolean) {
    self.linkcheckertransformer_disable_checking = Some(linkcheckertransformer_disable_checking);
  }

  pub fn with_linkcheckertransformer_disable_checking(mut self, linkcheckertransformer_disable_checking: ::models::ConfigNodePropertyBoolean) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_disable_checking = Some(linkcheckertransformer_disable_checking);
    self
  }

  pub fn linkcheckertransformer_disable_checking(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.linkcheckertransformer_disable_checking.as_ref()
  }

  pub fn reset_linkcheckertransformer_disable_checking(&mut self) {
    self.linkcheckertransformer_disable_checking = None;
  }

  pub fn set_linkcheckertransformer_map_cache_size(&mut self, linkcheckertransformer_map_cache_size: ::models::ConfigNodePropertyInteger) {
    self.linkcheckertransformer_map_cache_size = Some(linkcheckertransformer_map_cache_size);
  }

  pub fn with_linkcheckertransformer_map_cache_size(mut self, linkcheckertransformer_map_cache_size: ::models::ConfigNodePropertyInteger) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_map_cache_size = Some(linkcheckertransformer_map_cache_size);
    self
  }

  pub fn linkcheckertransformer_map_cache_size(&self) -> Option<&::models::ConfigNodePropertyInteger> {
    self.linkcheckertransformer_map_cache_size.as_ref()
  }

  pub fn reset_linkcheckertransformer_map_cache_size(&mut self) {
    self.linkcheckertransformer_map_cache_size = None;
  }

  pub fn set_linkcheckertransformer_strict_extension_check(&mut self, linkcheckertransformer_strict_extension_check: ::models::ConfigNodePropertyBoolean) {
    self.linkcheckertransformer_strict_extension_check = Some(linkcheckertransformer_strict_extension_check);
  }

  pub fn with_linkcheckertransformer_strict_extension_check(mut self, linkcheckertransformer_strict_extension_check: ::models::ConfigNodePropertyBoolean) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_strict_extension_check = Some(linkcheckertransformer_strict_extension_check);
    self
  }

  pub fn linkcheckertransformer_strict_extension_check(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.linkcheckertransformer_strict_extension_check.as_ref()
  }

  pub fn reset_linkcheckertransformer_strict_extension_check(&mut self) {
    self.linkcheckertransformer_strict_extension_check = None;
  }

  pub fn set_linkcheckertransformer_strip_htmlt_extension(&mut self, linkcheckertransformer_strip_htmlt_extension: ::models::ConfigNodePropertyBoolean) {
    self.linkcheckertransformer_strip_htmlt_extension = Some(linkcheckertransformer_strip_htmlt_extension);
  }

  pub fn with_linkcheckertransformer_strip_htmlt_extension(mut self, linkcheckertransformer_strip_htmlt_extension: ::models::ConfigNodePropertyBoolean) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_strip_htmlt_extension = Some(linkcheckertransformer_strip_htmlt_extension);
    self
  }

  pub fn linkcheckertransformer_strip_htmlt_extension(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.linkcheckertransformer_strip_htmlt_extension.as_ref()
  }

  pub fn reset_linkcheckertransformer_strip_htmlt_extension(&mut self) {
    self.linkcheckertransformer_strip_htmlt_extension = None;
  }

  pub fn set_linkcheckertransformer_rewrite_elements(&mut self, linkcheckertransformer_rewrite_elements: ::models::ConfigNodePropertyArray) {
    self.linkcheckertransformer_rewrite_elements = Some(linkcheckertransformer_rewrite_elements);
  }

  pub fn with_linkcheckertransformer_rewrite_elements(mut self, linkcheckertransformer_rewrite_elements: ::models::ConfigNodePropertyArray) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_rewrite_elements = Some(linkcheckertransformer_rewrite_elements);
    self
  }

  pub fn linkcheckertransformer_rewrite_elements(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.linkcheckertransformer_rewrite_elements.as_ref()
  }

  pub fn reset_linkcheckertransformer_rewrite_elements(&mut self) {
    self.linkcheckertransformer_rewrite_elements = None;
  }

  pub fn set_linkcheckertransformer_strip_extension_path_blacklist(&mut self, linkcheckertransformer_strip_extension_path_blacklist: ::models::ConfigNodePropertyArray) {
    self.linkcheckertransformer_strip_extension_path_blacklist = Some(linkcheckertransformer_strip_extension_path_blacklist);
  }

  pub fn with_linkcheckertransformer_strip_extension_path_blacklist(mut self, linkcheckertransformer_strip_extension_path_blacklist: ::models::ConfigNodePropertyArray) -> ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties {
    self.linkcheckertransformer_strip_extension_path_blacklist = Some(linkcheckertransformer_strip_extension_path_blacklist);
    self
  }

  pub fn linkcheckertransformer_strip_extension_path_blacklist(&self) -> Option<&::models::ConfigNodePropertyArray> {
    self.linkcheckertransformer_strip_extension_path_blacklist.as_ref()
  }

  pub fn reset_linkcheckertransformer_strip_extension_path_blacklist(&mut self) {
    self.linkcheckertransformer_strip_extension_path_blacklist = None;
  }

}


