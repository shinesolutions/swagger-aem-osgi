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


#include "OAIComAdobeCqCdnRewriterImplCDNRewriterProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::OAIComAdobeCqCdnRewriterImplCDNRewriterProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::OAIComAdobeCqCdnRewriterImplCDNRewriterProperties() {
    init();
}

OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::~OAIComAdobeCqCdnRewriterImplCDNRewriterProperties() {
    this->cleanup();
}

void
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::init() {
    service_ranking = new OAIConfigNodePropertyInteger();
    m_service_ranking_isSet = false;
    cdnrewriter_attributes = new OAIConfigNodePropertyArray();
    m_cdnrewriter_attributes_isSet = false;
    cdn_rewriter_distribution_domain = new OAIConfigNodePropertyString();
    m_cdn_rewriter_distribution_domain_isSet = false;
}

void
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::cleanup() {
    if(service_ranking != nullptr) { 
        delete service_ranking;
    }
    if(cdnrewriter_attributes != nullptr) { 
        delete cdnrewriter_attributes;
    }
    if(cdn_rewriter_distribution_domain != nullptr) { 
        delete cdn_rewriter_distribution_domain;
    }
}

OAIComAdobeCqCdnRewriterImplCDNRewriterProperties*
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&service_ranking, pJson["service.ranking"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&cdnrewriter_attributes, pJson["cdnrewriter.attributes"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&cdn_rewriter_distribution_domain, pJson["cdn.rewriter.distribution.domain"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::asJsonObject() {
    QJsonObject obj;
    if((service_ranking != nullptr) && (service_ranking->isSet())){
        toJsonValue(QString("service.ranking"), service_ranking, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((cdnrewriter_attributes != nullptr) && (cdnrewriter_attributes->isSet())){
        toJsonValue(QString("cdnrewriter.attributes"), cdnrewriter_attributes, obj, QString("OAIConfigNodePropertyArray"));
    }
    if((cdn_rewriter_distribution_domain != nullptr) && (cdn_rewriter_distribution_domain->isSet())){
        toJsonValue(QString("cdn.rewriter.distribution.domain"), cdn_rewriter_distribution_domain, obj, QString("OAIConfigNodePropertyString"));
    }

    return obj;
}

OAIConfigNodePropertyInteger*
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::getServiceRanking() {
    return service_ranking;
}
void
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::setServiceRanking(OAIConfigNodePropertyInteger* service_ranking) {
    this->service_ranking = service_ranking;
    this->m_service_ranking_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::getCdnrewriterAttributes() {
    return cdnrewriter_attributes;
}
void
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::setCdnrewriterAttributes(OAIConfigNodePropertyArray* cdnrewriter_attributes) {
    this->cdnrewriter_attributes = cdnrewriter_attributes;
    this->m_cdnrewriter_attributes_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::getCdnRewriterDistributionDomain() {
    return cdn_rewriter_distribution_domain;
}
void
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::setCdnRewriterDistributionDomain(OAIConfigNodePropertyString* cdn_rewriter_distribution_domain) {
    this->cdn_rewriter_distribution_domain = cdn_rewriter_distribution_domain;
    this->m_cdn_rewriter_distribution_domain_isSet = true;
}


bool
OAIComAdobeCqCdnRewriterImplCDNRewriterProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(service_ranking != nullptr && service_ranking->isSet()){ isObjectUpdated = true; break;}
        if(cdnrewriter_attributes != nullptr && cdnrewriter_attributes->isSet()){ isObjectUpdated = true; break;}
        if(cdn_rewriter_distribution_domain != nullptr && cdn_rewriter_distribution_domain->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
