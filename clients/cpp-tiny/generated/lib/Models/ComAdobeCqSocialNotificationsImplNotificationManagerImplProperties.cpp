

#include "ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.h"

using namespace Tiny;

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties()
{
	maxunreadnotificationcount = ConfigNodePropertyInteger();
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::~ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties()
{

}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *maxunreadnotificationcountKey = "max.unread.notification.count";

    if(object.has_key(maxunreadnotificationcountKey))
    {
        bourne::json value = object[maxunreadnotificationcountKey];




        ConfigNodePropertyInteger* obj = &maxunreadnotificationcount;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["maxunreadnotificationcount"] = getMaxunreadnotificationcount().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::getMaxunreadnotificationcount()
{
	return maxunreadnotificationcount;
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::setMaxunreadnotificationcount(ConfigNodePropertyInteger maxunreadnotificationcount)
{
	this->maxunreadnotificationcount = maxunreadnotificationcount;
}



