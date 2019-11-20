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


#include "OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(QString json) {
    this->fromJson(json);
}

OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties() {
    this->init();
}

OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::~OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties() {
    
}

void
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::init() {
    m_number_of_days_isSet = false;
    m_age_of_file_isSet = false;
}

void
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(number_of_days, json[QString("numberOfDays")]);
    
    ::OpenAPI::fromJsonValue(age_of_file, json[QString("ageOfFile")]);
    
}

QString
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::asJsonObject() const {
    QJsonObject obj;
	if(number_of_days.isSet()){
        obj.insert(QString("numberOfDays"), ::OpenAPI::toJsonValue(number_of_days));
    }
	if(age_of_file.isSet()){
        obj.insert(QString("ageOfFile"), ::OpenAPI::toJsonValue(age_of_file));
    }
    return obj;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::getNumberOfDays() const {
    return number_of_days;
}
void
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::setNumberOfDays(const OAIConfigNodePropertyInteger &number_of_days) {
    this->number_of_days = number_of_days;
    this->m_number_of_days_isSet = true;
}

OAIConfigNodePropertyInteger
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::getAgeOfFile() const {
    return age_of_file;
}
void
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::setAgeOfFile(const OAIConfigNodePropertyInteger &age_of_file) {
    this->age_of_file = age_of_file;
    this->m_age_of_file_isSet = true;
}


bool
OAIComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(number_of_days.isSet()){ isObjectUpdated = true; break;}
    
        if(age_of_file.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
