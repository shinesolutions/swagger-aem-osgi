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
 * OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.h
 *
 * 
 */

#ifndef OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_
#define OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_

#include <QJsonObject>


#include "OAIOAIConfigNodePropertyDropDown.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties: public OAIObject {
public:
    OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();
    OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(QString json);
    ~OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties* fromJson(QString jsonString) override;

    OAIConfigNodePropertyDropDown* getFeedGeneratorAlgorithm();
    void setFeedGeneratorAlgorithm(OAIConfigNodePropertyDropDown* feed_generator_algorithm);


    virtual bool isSet() override;

private:
    OAIConfigNodePropertyDropDown* feed_generator_algorithm;
    bool m_feed_generator_algorithm_isSet;

};

}

#endif /* OAIComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties_H_ */