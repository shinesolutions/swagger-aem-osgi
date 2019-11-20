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
 * OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties_H_
#define OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyString.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties: public OAIObject {
public:
    OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties();
    OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties(QString json);
    ~OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyString* getCqCommercePromotionRoot();
    void setCqCommercePromotionRoot(OAIConfigNodePropertyString* cq_commerce_promotion_root);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyString* cq_commerce_promotion_root;
    bool m_cq_commerce_promotion_root_isSet;

};

}

#endif /* OAIComAdobeCqCommerceImplPromotionPromotionManagerImplProperties_H_ */