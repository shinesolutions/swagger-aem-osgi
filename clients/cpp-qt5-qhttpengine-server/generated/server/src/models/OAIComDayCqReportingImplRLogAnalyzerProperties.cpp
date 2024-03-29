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


#include "OAIComDayCqReportingImplRLogAnalyzerProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComDayCqReportingImplRLogAnalyzerProperties::OAIComDayCqReportingImplRLogAnalyzerProperties(QString json) {
    this->fromJson(json);
}

OAIComDayCqReportingImplRLogAnalyzerProperties::OAIComDayCqReportingImplRLogAnalyzerProperties() {
    this->init();
}

OAIComDayCqReportingImplRLogAnalyzerProperties::~OAIComDayCqReportingImplRLogAnalyzerProperties() {
    
}

void
OAIComDayCqReportingImplRLogAnalyzerProperties::init() {
    m_request_log_output_isSet = false;
}

void
OAIComDayCqReportingImplRLogAnalyzerProperties::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIComDayCqReportingImplRLogAnalyzerProperties::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(request_log_output, json[QString("request.log.output")]);
    
}

QString
OAIComDayCqReportingImplRLogAnalyzerProperties::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComDayCqReportingImplRLogAnalyzerProperties::asJsonObject() const {
    QJsonObject obj;
	if(request_log_output.isSet()){
        obj.insert(QString("request.log.output"), ::OpenAPI::toJsonValue(request_log_output));
    }
    return obj;
}

OAIConfigNodePropertyString
OAIComDayCqReportingImplRLogAnalyzerProperties::getRequestLogOutput() const {
    return request_log_output;
}
void
OAIComDayCqReportingImplRLogAnalyzerProperties::setRequestLogOutput(const OAIConfigNodePropertyString &request_log_output) {
    this->request_log_output = request_log_output;
    this->m_request_log_output_isSet = true;
}


bool
OAIComDayCqReportingImplRLogAnalyzerProperties::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(request_log_output.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

