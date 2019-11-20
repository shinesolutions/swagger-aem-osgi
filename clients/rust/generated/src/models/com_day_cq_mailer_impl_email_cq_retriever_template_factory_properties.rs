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
pub struct ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
  #[serde(rename = "mailer.email.embed")]
  mailer_email_embed: Option<::models::ConfigNodePropertyBoolean>,
  #[serde(rename = "mailer.email.charset")]
  mailer_email_charset: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "mailer.email.retrieverUserID")]
  mailer_email_retriever_user_id: Option<::models::ConfigNodePropertyString>,
  #[serde(rename = "mailer.email.retrieverUserPWD")]
  mailer_email_retriever_user_pwd: Option<::models::ConfigNodePropertyString>
}

impl ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
  pub fn new() -> ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
      mailer_email_embed: None,
      mailer_email_charset: None,
      mailer_email_retriever_user_id: None,
      mailer_email_retriever_user_pwd: None
    }
  }

  pub fn set_mailer_email_embed(&mut self, mailer_email_embed: ::models::ConfigNodePropertyBoolean) {
    self.mailer_email_embed = Some(mailer_email_embed);
  }

  pub fn with_mailer_email_embed(mut self, mailer_email_embed: ::models::ConfigNodePropertyBoolean) -> ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    self.mailer_email_embed = Some(mailer_email_embed);
    self
  }

  pub fn mailer_email_embed(&self) -> Option<&::models::ConfigNodePropertyBoolean> {
    self.mailer_email_embed.as_ref()
  }

  pub fn reset_mailer_email_embed(&mut self) {
    self.mailer_email_embed = None;
  }

  pub fn set_mailer_email_charset(&mut self, mailer_email_charset: ::models::ConfigNodePropertyString) {
    self.mailer_email_charset = Some(mailer_email_charset);
  }

  pub fn with_mailer_email_charset(mut self, mailer_email_charset: ::models::ConfigNodePropertyString) -> ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    self.mailer_email_charset = Some(mailer_email_charset);
    self
  }

  pub fn mailer_email_charset(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.mailer_email_charset.as_ref()
  }

  pub fn reset_mailer_email_charset(&mut self) {
    self.mailer_email_charset = None;
  }

  pub fn set_mailer_email_retriever_user_id(&mut self, mailer_email_retriever_user_id: ::models::ConfigNodePropertyString) {
    self.mailer_email_retriever_user_id = Some(mailer_email_retriever_user_id);
  }

  pub fn with_mailer_email_retriever_user_id(mut self, mailer_email_retriever_user_id: ::models::ConfigNodePropertyString) -> ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    self.mailer_email_retriever_user_id = Some(mailer_email_retriever_user_id);
    self
  }

  pub fn mailer_email_retriever_user_id(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.mailer_email_retriever_user_id.as_ref()
  }

  pub fn reset_mailer_email_retriever_user_id(&mut self) {
    self.mailer_email_retriever_user_id = None;
  }

  pub fn set_mailer_email_retriever_user_pwd(&mut self, mailer_email_retriever_user_pwd: ::models::ConfigNodePropertyString) {
    self.mailer_email_retriever_user_pwd = Some(mailer_email_retriever_user_pwd);
  }

  pub fn with_mailer_email_retriever_user_pwd(mut self, mailer_email_retriever_user_pwd: ::models::ConfigNodePropertyString) -> ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    self.mailer_email_retriever_user_pwd = Some(mailer_email_retriever_user_pwd);
    self
  }

  pub fn mailer_email_retriever_user_pwd(&self) -> Option<&::models::ConfigNodePropertyString> {
    self.mailer_email_retriever_user_pwd.as_ref()
  }

  pub fn reset_mailer_email_retriever_user_pwd(&mut self) {
    self.mailer_email_retriever_user_pwd = None;
  }

}


