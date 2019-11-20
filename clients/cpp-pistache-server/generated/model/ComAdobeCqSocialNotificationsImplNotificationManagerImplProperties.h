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
 * ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.h
 *
 * 
 */

#ifndef ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_
#define ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_


#include "ModelBase.h"

#include "ConfigNodePropertyInteger.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties
    : public ModelBase
{
public:
    ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();
    virtual ~ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties members

    /// <summary>
    /// 
    /// </summary>
    ConfigNodePropertyInteger getMaxUnreadNotificationCount() const;
    void setMaxUnreadNotificationCount(ConfigNodePropertyInteger const& value);
    bool maxUnreadNotificationCountIsSet() const;
    void unsetMax_unread_notification_count();

protected:
    ConfigNodePropertyInteger m_Max_unread_notification_count;
    bool m_Max_unread_notification_countIsSet;
};

}
}
}
}

#endif /* ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties_H_ */