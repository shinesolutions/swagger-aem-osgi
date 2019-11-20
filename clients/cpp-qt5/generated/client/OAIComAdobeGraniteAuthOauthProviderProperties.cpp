/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIComAdobeGraniteAuthOauthProviderProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeGraniteAuthOauthProviderProperties::OAIComAdobeGraniteAuthOauthProviderProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeGraniteAuthOauthProviderProperties::OAIComAdobeGraniteAuthOauthProviderProperties() {
    init();
}

OAIComAdobeGraniteAuthOauthProviderProperties::~OAIComAdobeGraniteAuthOauthProviderProperties() {
    this->cleanup();
}

void
OAIComAdobeGraniteAuthOauthProviderProperties::init() {
    oauth_config_id = new OAIConfigNodePropertyString();
    m_oauth_config_id_isSet = false;
    oauth_client_id = new OAIConfigNodePropertyString();
    m_oauth_client_id_isSet = false;
    oauth_client_secret = new OAIConfigNodePropertyString();
    m_oauth_client_secret_isSet = false;
    oauth_scope = new OAIConfigNodePropertyArray();
    m_oauth_scope_isSet = false;
    oauth_config_provider_id = new OAIConfigNodePropertyString();
    m_oauth_config_provider_id_isSet = false;
    oauth_create_users = new OAIConfigNodePropertyBoolean();
    m_oauth_create_users_isSet = false;
    oauth_userid_property = new OAIConfigNodePropertyString();
    m_oauth_userid_property_isSet = false;
    force_strict_username_matching = new OAIConfigNodePropertyBoolean();
    m_force_strict_username_matching_isSet = false;
    oauth_encode_userids = new OAIConfigNodePropertyBoolean();
    m_oauth_encode_userids_isSet = false;
    oauth_hash_userids = new OAIConfigNodePropertyBoolean();
    m_oauth_hash_userids_isSet = false;
    oauth_call_back_url = new OAIConfigNodePropertyString();
    m_oauth_call_back_url_isSet = false;
    oauth_access_token_persist = new OAIConfigNodePropertyBoolean();
    m_oauth_access_token_persist_isSet = false;
    oauth_access_token_persist_cookie = new OAIConfigNodePropertyBoolean();
    m_oauth_access_token_persist_cookie_isSet = false;
    oauth_csrf_state_protection = new OAIConfigNodePropertyBoolean();
    m_oauth_csrf_state_protection_isSet = false;
    oauth_redirect_request_params = new OAIConfigNodePropertyBoolean();
    m_oauth_redirect_request_params_isSet = false;
    oauth_config_siblings_allow = new OAIConfigNodePropertyBoolean();
    m_oauth_config_siblings_allow_isSet = false;
}

void
OAIComAdobeGraniteAuthOauthProviderProperties::cleanup() {
    if(oauth_config_id != nullptr) { 
        delete oauth_config_id;
    }
    if(oauth_client_id != nullptr) { 
        delete oauth_client_id;
    }
    if(oauth_client_secret != nullptr) { 
        delete oauth_client_secret;
    }
    if(oauth_scope != nullptr) { 
        delete oauth_scope;
    }
    if(oauth_config_provider_id != nullptr) { 
        delete oauth_config_provider_id;
    }
    if(oauth_create_users != nullptr) { 
        delete oauth_create_users;
    }
    if(oauth_userid_property != nullptr) { 
        delete oauth_userid_property;
    }
    if(force_strict_username_matching != nullptr) { 
        delete force_strict_username_matching;
    }
    if(oauth_encode_userids != nullptr) { 
        delete oauth_encode_userids;
    }
    if(oauth_hash_userids != nullptr) { 
        delete oauth_hash_userids;
    }
    if(oauth_call_back_url != nullptr) { 
        delete oauth_call_back_url;
    }
    if(oauth_access_token_persist != nullptr) { 
        delete oauth_access_token_persist;
    }
    if(oauth_access_token_persist_cookie != nullptr) { 
        delete oauth_access_token_persist_cookie;
    }
    if(oauth_csrf_state_protection != nullptr) { 
        delete oauth_csrf_state_protection;
    }
    if(oauth_redirect_request_params != nullptr) { 
        delete oauth_redirect_request_params;
    }
    if(oauth_config_siblings_allow != nullptr) { 
        delete oauth_config_siblings_allow;
    }
}

OAIComAdobeGraniteAuthOauthProviderProperties*
OAIComAdobeGraniteAuthOauthProviderProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeGraniteAuthOauthProviderProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&oauth_config_id, pJson["oauth.config.id"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&oauth_client_id, pJson["oauth.client.id"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&oauth_client_secret, pJson["oauth.client.secret"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&oauth_scope, pJson["oauth.scope"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&oauth_config_provider_id, pJson["oauth.config.provider.id"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&oauth_create_users, pJson["oauth.create.users"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_userid_property, pJson["oauth.userid.property"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&force_strict_username_matching, pJson["force.strict.username.matching"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_encode_userids, pJson["oauth.encode.userids"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_hash_userids, pJson["oauth.hash.userids"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_call_back_url, pJson["oauth.callBackUrl"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&oauth_access_token_persist, pJson["oauth.access.token.persist"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_access_token_persist_cookie, pJson["oauth.access.token.persist.cookie"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_csrf_state_protection, pJson["oauth.csrf.state.protection"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_redirect_request_params, pJson["oauth.redirect.request.params"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&oauth_config_siblings_allow, pJson["oauth.config.siblings.allow"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
}

QString
OAIComAdobeGraniteAuthOauthProviderProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeGraniteAuthOauthProviderProperties::asJsonObject() {
    QJsonObject obj;
    if((oauth_config_id != nullptr) && (oauth_config_id->isSet())){
        toJsonValue(QString("oauth.config.id"), oauth_config_id, obj, QString("OAIConfigNodePropertyString"));
    }
    if((oauth_client_id != nullptr) && (oauth_client_id->isSet())){
        toJsonValue(QString("oauth.client.id"), oauth_client_id, obj, QString("OAIConfigNodePropertyString"));
    }
    if((oauth_client_secret != nullptr) && (oauth_client_secret->isSet())){
        toJsonValue(QString("oauth.client.secret"), oauth_client_secret, obj, QString("OAIConfigNodePropertyString"));
    }
    if((oauth_scope != nullptr) && (oauth_scope->isSet())){
        toJsonValue(QString("oauth.scope"), oauth_scope, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((oauth_config_provider_id != nullptr) && (oauth_config_provider_id->isSet())){
        toJsonValue(QString("oauth.config.provider.id"), oauth_config_provider_id, obj, QString("OAIConfigNodePropertyString"));
    }
    if((oauth_create_users != nullptr) && (oauth_create_users->isSet())){
        toJsonValue(QString("oauth.create.users"), oauth_create_users, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_userid_property != nullptr) && (oauth_userid_property->isSet())){
        toJsonValue(QString("oauth.userid.property"), oauth_userid_property, obj, QString("OAIConfigNodePropertyString"));
    }
    if((force_strict_username_matching != nullptr) && (force_strict_username_matching->isSet())){
        toJsonValue(QString("force.strict.username.matching"), force_strict_username_matching, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_encode_userids != nullptr) && (oauth_encode_userids->isSet())){
        toJsonValue(QString("oauth.encode.userids"), oauth_encode_userids, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_hash_userids != nullptr) && (oauth_hash_userids->isSet())){
        toJsonValue(QString("oauth.hash.userids"), oauth_hash_userids, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_call_back_url != nullptr) && (oauth_call_back_url->isSet())){
        toJsonValue(QString("oauth.callBackUrl"), oauth_call_back_url, obj, QString("OAIConfigNodePropertyString"));
    }
    if((oauth_access_token_persist != nullptr) && (oauth_access_token_persist->isSet())){
        toJsonValue(QString("oauth.access.token.persist"), oauth_access_token_persist, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_access_token_persist_cookie != nullptr) && (oauth_access_token_persist_cookie->isSet())){
        toJsonValue(QString("oauth.access.token.persist.cookie"), oauth_access_token_persist_cookie, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_csrf_state_protection != nullptr) && (oauth_csrf_state_protection->isSet())){
        toJsonValue(QString("oauth.csrf.state.protection"), oauth_csrf_state_protection, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_redirect_request_params != nullptr) && (oauth_redirect_request_params->isSet())){
        toJsonValue(QString("oauth.redirect.request.params"), oauth_redirect_request_params, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((oauth_config_siblings_allow != nullptr) && (oauth_config_siblings_allow->isSet())){
        toJsonValue(QString("oauth.config.siblings.allow"), oauth_config_siblings_allow, obj, QString("OAIConfigNodePropertyBoolean"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthConfigId() {
    return oauth_config_id;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthConfigId(OAIConfigNodePropertyString* oauth_config_id) {
    this->oauth_config_id = oauth_config_id;
    this->m_oauth_config_id_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthClientId() {
    return oauth_client_id;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthClientId(OAIConfigNodePropertyString* oauth_client_id) {
    this->oauth_client_id = oauth_client_id;
    this->m_oauth_client_id_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthClientSecret() {
    return oauth_client_secret;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthClientSecret(OAIConfigNodePropertyString* oauth_client_secret) {
    this->oauth_client_secret = oauth_client_secret;
    this->m_oauth_client_secret_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthScope() {
    return oauth_scope;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthScope(OAIConfigNodePropertyArray* oauth_scope) {
    this->oauth_scope = oauth_scope;
    this->m_oauth_scope_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthConfigProviderId() {
    return oauth_config_provider_id;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthConfigProviderId(OAIConfigNodePropertyString* oauth_config_provider_id) {
    this->oauth_config_provider_id = oauth_config_provider_id;
    this->m_oauth_config_provider_id_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthCreateUsers() {
    return oauth_create_users;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthCreateUsers(OAIConfigNodePropertyBoolean* oauth_create_users) {
    this->oauth_create_users = oauth_create_users;
    this->m_oauth_create_users_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthUseridProperty() {
    return oauth_userid_property;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthUseridProperty(OAIConfigNodePropertyString* oauth_userid_property) {
    this->oauth_userid_property = oauth_userid_property;
    this->m_oauth_userid_property_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getForceStrictUsernameMatching() {
    return force_strict_username_matching;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setForceStrictUsernameMatching(OAIConfigNodePropertyBoolean* force_strict_username_matching) {
    this->force_strict_username_matching = force_strict_username_matching;
    this->m_force_strict_username_matching_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthEncodeUserids() {
    return oauth_encode_userids;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthEncodeUserids(OAIConfigNodePropertyBoolean* oauth_encode_userids) {
    this->oauth_encode_userids = oauth_encode_userids;
    this->m_oauth_encode_userids_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthHashUserids() {
    return oauth_hash_userids;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthHashUserids(OAIConfigNodePropertyBoolean* oauth_hash_userids) {
    this->oauth_hash_userids = oauth_hash_userids;
    this->m_oauth_hash_userids_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthCallBackUrl() {
    return oauth_call_back_url;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthCallBackUrl(OAIConfigNodePropertyString* oauth_call_back_url) {
    this->oauth_call_back_url = oauth_call_back_url;
    this->m_oauth_call_back_url_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthAccessTokenPersist() {
    return oauth_access_token_persist;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthAccessTokenPersist(OAIConfigNodePropertyBoolean* oauth_access_token_persist) {
    this->oauth_access_token_persist = oauth_access_token_persist;
    this->m_oauth_access_token_persist_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthAccessTokenPersistCookie() {
    return oauth_access_token_persist_cookie;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthAccessTokenPersistCookie(OAIConfigNodePropertyBoolean* oauth_access_token_persist_cookie) {
    this->oauth_access_token_persist_cookie = oauth_access_token_persist_cookie;
    this->m_oauth_access_token_persist_cookie_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthCsrfStateProtection() {
    return oauth_csrf_state_protection;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthCsrfStateProtection(OAIConfigNodePropertyBoolean* oauth_csrf_state_protection) {
    this->oauth_csrf_state_protection = oauth_csrf_state_protection;
    this->m_oauth_csrf_state_protection_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthRedirectRequestParams() {
    return oauth_redirect_request_params;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthRedirectRequestParams(OAIConfigNodePropertyBoolean* oauth_redirect_request_params) {
    this->oauth_redirect_request_params = oauth_redirect_request_params;
    this->m_oauth_redirect_request_params_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIComAdobeGraniteAuthOauthProviderProperties::getOauthConfigSiblingsAllow() {
    return oauth_config_siblings_allow;
}
void
OAIComAdobeGraniteAuthOauthProviderProperties::setOauthConfigSiblingsAllow(OAIConfigNodePropertyBoolean* oauth_config_siblings_allow) {
    this->oauth_config_siblings_allow = oauth_config_siblings_allow;
    this->m_oauth_config_siblings_allow_isSet = true;
}


bool
OAIComAdobeGraniteAuthOauthProviderProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(oauth_config_id != nullptr && oauth_config_id->isSet()){ isObjectUpdated = true; break;}
        if(oauth_client_id != nullptr && oauth_client_id->isSet()){ isObjectUpdated = true; break;}
        if(oauth_client_secret != nullptr && oauth_client_secret->isSet()){ isObjectUpdated = true; break;}
        if(oauth_scope != nullptr && oauth_scope->isSet()){ isObjectUpdated = true; break;}
        if(oauth_config_provider_id != nullptr && oauth_config_provider_id->isSet()){ isObjectUpdated = true; break;}
        if(oauth_create_users != nullptr && oauth_create_users->isSet()){ isObjectUpdated = true; break;}
        if(oauth_userid_property != nullptr && oauth_userid_property->isSet()){ isObjectUpdated = true; break;}
        if(force_strict_username_matching != nullptr && force_strict_username_matching->isSet()){ isObjectUpdated = true; break;}
        if(oauth_encode_userids != nullptr && oauth_encode_userids->isSet()){ isObjectUpdated = true; break;}
        if(oauth_hash_userids != nullptr && oauth_hash_userids->isSet()){ isObjectUpdated = true; break;}
        if(oauth_call_back_url != nullptr && oauth_call_back_url->isSet()){ isObjectUpdated = true; break;}
        if(oauth_access_token_persist != nullptr && oauth_access_token_persist->isSet()){ isObjectUpdated = true; break;}
        if(oauth_access_token_persist_cookie != nullptr && oauth_access_token_persist_cookie->isSet()){ isObjectUpdated = true; break;}
        if(oauth_csrf_state_protection != nullptr && oauth_csrf_state_protection->isSet()){ isObjectUpdated = true; break;}
        if(oauth_redirect_request_params != nullptr && oauth_redirect_request_params->isSet()){ isObjectUpdated = true; break;}
        if(oauth_config_siblings_allow != nullptr && oauth_config_siblings_allow->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
