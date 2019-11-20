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

/*
 * OAIComAdobeCqCdnRewriterImplCDNRewriterProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqCdnRewriterImplCDNRewriterProperties_H_
#define OAIComAdobeCqCdnRewriterImplCDNRewriterProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyArray.h"
#include "OAIOAIConfigNodePropertyInteger.h"
#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqCdnRewriterImplCDNRewriterProperties: public OAIObject {
public:
    OAIComAdobeCqCdnRewriterImplCDNRewriterProperties();
    OAIComAdobeCqCdnRewriterImplCDNRewriterProperties(QString json);
    ~OAIComAdobeCqCdnRewriterImplCDNRewriterProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqCdnRewriterImplCDNRewriterProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyInteger* getServiceRanking();
    void setServiceRanking(OAIConfigNodePropertyInteger* service_ranking);

    OAIConfigNodePropertyArray* getCdnrewriterAttributes();
    void setCdnrewriterAttributes(OAIConfigNodePropertyArray* cdnrewriter_attributes);

    OAIConfigNodePropertyString* getCdnRewriterDistributionDomain();
    void setCdnRewriterDistributionDomain(OAIConfigNodePropertyString* cdn_rewriter_distribution_domain);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyInteger* service_ranking;
    bool m_service_ranking_isSet;

    OAIConfigNodePropertyArray* cdnrewriter_attributes;
    bool m_cdnrewriter_attributes_isSet;

    OAIConfigNodePropertyString* cdn_rewriter_distribution_domain;
    bool m_cdn_rewriter_distribution_domain_isSet;

};

}

#endif /* OAIComAdobeCqCdnRewriterImplCDNRewriterProperties_H_ */