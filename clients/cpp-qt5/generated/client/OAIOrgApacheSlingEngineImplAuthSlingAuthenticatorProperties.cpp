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


#include "OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties() {
    init();
}

OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::~OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties() {
    this->cleanup();
}

void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::init() {
    osgi_http_whiteboard_context_select = new OAIConfigNodePropertyString();
    m_osgi_http_whiteboard_context_select_isSet = false;
    osgi_http_whiteboard_listener = new OAIConfigNodePropertyString();
    m_osgi_http_whiteboard_listener_isSet = false;
    auth_sudo_cookie = new OAIConfigNodePropertyString();
    m_auth_sudo_cookie_isSet = false;
    auth_sudo_parameter = new OAIConfigNodePropertyString();
    m_auth_sudo_parameter_isSet = false;
    auth_annonymous = new OAIConfigNodePropertyBoolean();
    m_auth_annonymous_isSet = false;
    sling_auth_requirements = new OAIConfigNodePropertyArray();
    m_sling_auth_requirements_isSet = false;
    sling_auth_anonymous_user = new OAIConfigNodePropertyString();
    m_sling_auth_anonymous_user_isSet = false;
    sling_auth_anonymous_password = new OAIConfigNodePropertyString();
    m_sling_auth_anonymous_password_isSet = false;
    auth_http = new OAIConfigNodePropertyDropDown();
    m_auth_http_isSet = false;
    auth_http_realm = new OAIConfigNodePropertyString();
    m_auth_http_realm_isSet = false;
    auth_uri_suffix = new OAIConfigNodePropertyArray();
    m_auth_uri_suffix_isSet = false;
}

void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::cleanup() {
    if(osgi_http_whiteboard_context_select != nullptr) { 
        delete osgi_http_whiteboard_context_select;
    }
    if(osgi_http_whiteboard_listener != nullptr) { 
        delete osgi_http_whiteboard_listener;
    }
    if(auth_sudo_cookie != nullptr) { 
        delete auth_sudo_cookie;
    }
    if(auth_sudo_parameter != nullptr) { 
        delete auth_sudo_parameter;
    }
    if(auth_annonymous != nullptr) { 
        delete auth_annonymous;
    }
    if(sling_auth_requirements != nullptr) { 
        delete sling_auth_requirements;
    }
    if(sling_auth_anonymous_user != nullptr) { 
        delete sling_auth_anonymous_user;
    }
    if(sling_auth_anonymous_password != nullptr) { 
        delete sling_auth_anonymous_password;
    }
    if(auth_http != nullptr) { 
        delete auth_http;
    }
    if(auth_http_realm != nullptr) { 
        delete auth_http_realm;
    }
    if(auth_uri_suffix != nullptr) { 
        delete auth_uri_suffix;
    }
}

OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&osgi_http_whiteboard_context_select, pJson["osgi.http.whiteboard.context.select"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&osgi_http_whiteboard_listener, pJson["osgi.http.whiteboard.listener"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&auth_sudo_cookie, pJson["auth.sudo.cookie"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&auth_sudo_parameter, pJson["auth.sudo.parameter"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&auth_annonymous, pJson["auth.annonymous"], "OAIConfigNodePropertyBoolean", "OAIConfigNodePropertyBoolean");
    
    ::OpenAPI::setValue(&sling_auth_requirements, pJson["sling.auth.requirements"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&sling_auth_anonymous_user, pJson["sling.auth.anonymous.user"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&sling_auth_anonymous_password, pJson["sling.auth.anonymous.password"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&auth_http, pJson["auth.http"], "OAIConfigNodePropertyDropDown", "OAIConfigNodePropertyDropDown");
    
    ::OpenAPI::setValue(&auth_http_realm, pJson["auth.http.realm"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&auth_uri_suffix, pJson["auth.uri.suffix"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
}

QString
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::asJsonObject() {
    QJsonObject obj;
    if((osgi_http_whiteboard_context_select != nullptr) && (osgi_http_whiteboard_context_select->isSet())){
        toJsonValue(QString("osgi.http.whiteboard.context.select"), osgi_http_whiteboard_context_select, obj, QString("OAIConfigNodePropertyString"));
    }
    if((osgi_http_whiteboard_listener != nullptr) && (osgi_http_whiteboard_listener->isSet())){
        toJsonValue(QString("osgi.http.whiteboard.listener"), osgi_http_whiteboard_listener, obj, QString("OAIConfigNodePropertyString"));
    }
    if((auth_sudo_cookie != nullptr) && (auth_sudo_cookie->isSet())){
        toJsonValue(QString("auth.sudo.cookie"), auth_sudo_cookie, obj, QString("OAIConfigNodePropertyString"));
    }
    if((auth_sudo_parameter != nullptr) && (auth_sudo_parameter->isSet())){
        toJsonValue(QString("auth.sudo.parameter"), auth_sudo_parameter, obj, QString("OAIConfigNodePropertyString"));
    }
    if((auth_annonymous != nullptr) && (auth_annonymous->isSet())){
        toJsonValue(QString("auth.annonymous"), auth_annonymous, obj, QString("OAIConfigNodePropertyBoolean"));
    }
    if((sling_auth_requirements != nullptr) && (sling_auth_requirements->isSet())){
        toJsonValue(QString("sling.auth.requirements"), sling_auth_requirements, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((sling_auth_anonymous_user != nullptr) && (sling_auth_anonymous_user->isSet())){
        toJsonValue(QString("sling.auth.anonymous.user"), sling_auth_anonymous_user, obj, QString("OAIConfigNodePropertyString"));
    }
    if((sling_auth_anonymous_password != nullptr) && (sling_auth_anonymous_password->isSet())){
        toJsonValue(QString("sling.auth.anonymous.password"), sling_auth_anonymous_password, obj, QString("OAIConfigNodePropertyString"));
    }
    if((auth_http != nullptr) && (auth_http->isSet())){
        toJsonValue(QString("auth.http"), auth_http, obj, QString("OAIConfigNodePropertyDropDown"));
    }
    if((auth_http_realm != nullptr) && (auth_http_realm->isSet())){
        toJsonValue(QString("auth.http.realm"), auth_http_realm, obj, QString("OAIConfigNodePropertyString"));
    }
    if((auth_uri_suffix != nullptr) && (auth_uri_suffix->isSet())){
        toJsonValue(QString("auth.uri.suffix"), auth_uri_suffix, obj, QString("OAIConfigNodePropertyArray"));
    }

    return obj;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getOsgiHttpWhiteboardContextSelect() {
    return osgi_http_whiteboard_context_select;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setOsgiHttpWhiteboardContextSelect(OAIConfigNodePropertyString* osgi_http_whiteboard_context_select) {
    this->osgi_http_whiteboard_context_select = osgi_http_whiteboard_context_select;
    this->m_osgi_http_whiteboard_context_select_isSet = true;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getOsgiHttpWhiteboardListener() {
    return osgi_http_whiteboard_listener;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setOsgiHttpWhiteboardListener(OAIConfigNodePropertyString* osgi_http_whiteboard_listener) {
    this->osgi_http_whiteboard_listener = osgi_http_whiteboard_listener;
    this->m_osgi_http_whiteboard_listener_isSet = true;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthSudoCookie() {
    return auth_sudo_cookie;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthSudoCookie(OAIConfigNodePropertyString* auth_sudo_cookie) {
    this->auth_sudo_cookie = auth_sudo_cookie;
    this->m_auth_sudo_cookie_isSet = true;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthSudoParameter() {
    return auth_sudo_parameter;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthSudoParameter(OAIConfigNodePropertyString* auth_sudo_parameter) {
    this->auth_sudo_parameter = auth_sudo_parameter;
    this->m_auth_sudo_parameter_isSet = true;
}

OAIConfigNodePropertyBoolean*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthAnnonymous() {
    return auth_annonymous;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthAnnonymous(OAIConfigNodePropertyBoolean* auth_annonymous) {
    this->auth_annonymous = auth_annonymous;
    this->m_auth_annonymous_isSet = true;
}

OAIConfigNodePropertyArray*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingAuthRequirements() {
    return sling_auth_requirements;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingAuthRequirements(OAIConfigNodePropertyArray* sling_auth_requirements) {
    this->sling_auth_requirements = sling_auth_requirements;
    this->m_sling_auth_requirements_isSet = true;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingAuthAnonymousUser() {
    return sling_auth_anonymous_user;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingAuthAnonymousUser(OAIConfigNodePropertyString* sling_auth_anonymous_user) {
    this->sling_auth_anonymous_user = sling_auth_anonymous_user;
    this->m_sling_auth_anonymous_user_isSet = true;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getSlingAuthAnonymousPassword() {
    return sling_auth_anonymous_password;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setSlingAuthAnonymousPassword(OAIConfigNodePropertyString* sling_auth_anonymous_password) {
    this->sling_auth_anonymous_password = sling_auth_anonymous_password;
    this->m_sling_auth_anonymous_password_isSet = true;
}

OAIConfigNodePropertyDropDown*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthHttp() {
    return auth_http;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthHttp(OAIConfigNodePropertyDropDown* auth_http) {
    this->auth_http = auth_http;
    this->m_auth_http_isSet = true;
}

OAIConfigNodePropertyString*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthHttpRealm() {
    return auth_http_realm;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthHttpRealm(OAIConfigNodePropertyString* auth_http_realm) {
    this->auth_http_realm = auth_http_realm;
    this->m_auth_http_realm_isSet = true;
}

OAIConfigNodePropertyArray*
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::getAuthUriSuffix() {
    return auth_uri_suffix;
}
void
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::setAuthUriSuffix(OAIConfigNodePropertyArray* auth_uri_suffix) {
    this->auth_uri_suffix = auth_uri_suffix;
    this->m_auth_uri_suffix_isSet = true;
}


bool
OAIOrgApacheSlingEngineImplAuthSlingAuthenticatorProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(osgi_http_whiteboard_context_select != nullptr && osgi_http_whiteboard_context_select->isSet()){ isObjectUpdated = true; break;}
        if(osgi_http_whiteboard_listener != nullptr && osgi_http_whiteboard_listener->isSet()){ isObjectUpdated = true; break;}
        if(auth_sudo_cookie != nullptr && auth_sudo_cookie->isSet()){ isObjectUpdated = true; break;}
        if(auth_sudo_parameter != nullptr && auth_sudo_parameter->isSet()){ isObjectUpdated = true; break;}
        if(auth_annonymous != nullptr && auth_annonymous->isSet()){ isObjectUpdated = true; break;}
        if(sling_auth_requirements != nullptr && sling_auth_requirements->isSet()){ isObjectUpdated = true; break;}
        if(sling_auth_anonymous_user != nullptr && sling_auth_anonymous_user->isSet()){ isObjectUpdated = true; break;}
        if(sling_auth_anonymous_password != nullptr && sling_auth_anonymous_password->isSet()){ isObjectUpdated = true; break;}
        if(auth_http != nullptr && auth_http->isSet()){ isObjectUpdated = true; break;}
        if(auth_http_realm != nullptr && auth_http_realm->isSet()){ isObjectUpdated = true; break;}
        if(auth_uri_suffix != nullptr && auth_uri_suffix->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
