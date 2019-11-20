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


#include "OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(QString json) {
    init();
    this->fromJson(json);
}

OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties() {
    init();
}

OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::~OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties() {
    this->cleanup();
}

void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::init() {
    service_ranking = new OAIConfigNodePropertyInteger();
    m_service_ranking_isSet = false;
    keypair_id = new OAIConfigNodePropertyString();
    m_keypair_id_isSet = false;
    keypair_alias = new OAIConfigNodePropertyString();
    m_keypair_alias_isSet = false;
    cdnrewriter_attributes = new OAIConfigNodePropertyArray();
    m_cdnrewriter_attributes_isSet = false;
    cdn_rewriter_distribution_domain = new OAIConfigNodePropertyString();
    m_cdn_rewriter_distribution_domain_isSet = false;
}

void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::cleanup() {
    if(service_ranking != nullptr) { 
        delete service_ranking;
    }
    if(keypair_id != nullptr) { 
        delete keypair_id;
    }
    if(keypair_alias != nullptr) { 
        delete keypair_alias;
    }
    if(cdnrewriter_attributes != nullptr) { 
        delete cdnrewriter_attributes;
    }
    if(cdn_rewriter_distribution_domain != nullptr) { 
        delete cdn_rewriter_distribution_domain;
    }
}

OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties*
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&service_ranking, pJson["service.ranking"], "OAIConfigNodePropertyInteger", "OAIConfigNodePropertyInteger");
    
    ::OpenAPI::setValue(&keypair_id, pJson["keypair.id"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&keypair_alias, pJson["keypair.alias"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
    ::OpenAPI::setValue(&cdnrewriter_attributes, pJson["cdnrewriter.attributes"], "OAIConfigNodePropertyArray", "OAIConfigNodePropertyArray");
    
    ::OpenAPI::setValue(&cdn_rewriter_distribution_domain, pJson["cdn.rewriter.distribution.domain"], "OAIConfigNodePropertyString", "OAIConfigNodePropertyString");
    
}

QString
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::asJsonObject() {
    QJsonObject obj;
    if((service_ranking != nullptr) && (service_ranking->isSet())){
        toJsonValue(QString("service.ranking"), service_ranking, obj, QString("OAIConfigNodePropertyInteger"));
    }
    if((keypair_id != nullptr) && (keypair_id->isSet())){
        toJsonValue(QString("keypair.id"), keypair_id, obj, QString("OAIConfigNodePropertyString"));
    }
    if((keypair_alias != nullptr) && (keypair_alias->isSet())){
        toJsonValue(QString("keypair.alias"), keypair_alias, obj, QString("OAIConfigNodePropertyString"));
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
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getServiceRanking() {
    return service_ranking;
}
void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setServiceRanking(OAIConfigNodePropertyInteger* service_ranking) {
    this->service_ranking = service_ranking;
    this->m_service_ranking_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getKeypairId() {
    return keypair_id;
}
void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setKeypairId(OAIConfigNodePropertyString* keypair_id) {
    this->keypair_id = keypair_id;
    this->m_keypair_id_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getKeypairAlias() {
    return keypair_alias;
}
void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setKeypairAlias(OAIConfigNodePropertyString* keypair_alias) {
    this->keypair_alias = keypair_alias;
    this->m_keypair_alias_isSet = true;
}

OAIConfigNodePropertyArray*
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getCdnrewriterAttributes() {
    return cdnrewriter_attributes;
}
void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setCdnrewriterAttributes(OAIConfigNodePropertyArray* cdnrewriter_attributes) {
    this->cdnrewriter_attributes = cdnrewriter_attributes;
    this->m_cdnrewriter_attributes_isSet = true;
}

OAIConfigNodePropertyString*
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::getCdnRewriterDistributionDomain() {
    return cdn_rewriter_distribution_domain;
}
void
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::setCdnRewriterDistributionDomain(OAIConfigNodePropertyString* cdn_rewriter_distribution_domain) {
    this->cdn_rewriter_distribution_domain = cdn_rewriter_distribution_domain;
    this->m_cdn_rewriter_distribution_domain_isSet = true;
}


bool
OAIComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties::isSet(){
    bool isObjectUpdated = false;
    do{
        if(service_ranking != nullptr && service_ranking->isSet()){ isObjectUpdated = true; break;}
        if(keypair_id != nullptr && keypair_id->isSet()){ isObjectUpdated = true; break;}
        if(keypair_alias != nullptr && keypair_alias->isSet()){ isObjectUpdated = true; break;}
        if(cdnrewriter_attributes != nullptr && cdnrewriter_attributes->isSet()){ isObjectUpdated = true; break;}
        if(cdn_rewriter_distribution_domain != nullptr && cdn_rewriter_distribution_domain->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
