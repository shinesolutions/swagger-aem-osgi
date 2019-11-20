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


#include "OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties(QString json) {
    this->fromJson(json);
}

OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties() {
    this->init();
}

OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::~OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties() {
    
}

void
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::init() {
    m_included_paths_isSet = false;
    m_enable_async_observer_isSet = false;
    m_observer_queue_size_isSet = false;
}

void
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(included_paths, json[QString("includedPaths")]);
    
    ::OpenAPI::fromJsonValue(enable_async_observer, json[QString("enableAsyncObserver")]);
    
    ::OpenAPI::fromJsonValue(observer_queue_size, json[QString("observerQueueSize")]);
    
}

QString
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::asJsonObject() const {
    QJsonObject obj;
	if(included_paths.isSet()){
        obj.insert(QString("includedPaths"), ::OpenAPI::toJsonValue(included_paths));
    }
	if(enable_async_observer.isSet()){
        obj.insert(QString("enableAsyncObserver"), ::OpenAPI::toJsonValue(enable_async_observer));
    }
	if(observer_queue_size.isSet()){
        obj.insert(QString("observerQueueSize"), ::OpenAPI::toJsonValue(observer_queue_size));
    }
    return obj;
}

OAIConfigNodePropertyArray
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getIncludedPaths() const {
    return included_paths;
}
void
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setIncludedPaths(const OAIConfigNodePropertyArray &included_paths) {
    this->included_paths = included_paths;
    this->m_included_paths_isSet = true;
}

OAIConfigNodePropertyBoolean
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getEnableAsyncObserver() const {
    return enable_async_observer;
}
void
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setEnableAsyncObserver(const OAIConfigNodePropertyBoolean &enable_async_observer) {
    this->enable_async_observer = enable_async_observer;
    this->m_enable_async_observer_isSet = true;
}

OAIConfigNodePropertyInteger
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::getObserverQueueSize() const {
    return observer_queue_size;
}
void
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::setObserverQueueSize(const OAIConfigNodePropertyInteger &observer_queue_size) {
    this->observer_queue_size = observer_queue_size;
    this->m_observer_queue_size_isSet = true;
}


bool
OAIOrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(included_paths.isSet()){ isObjectUpdated = true; break;}
    
        if(enable_async_observer.isSet()){ isObjectUpdated = true; break;}
    
        if(observer_queue_size.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
