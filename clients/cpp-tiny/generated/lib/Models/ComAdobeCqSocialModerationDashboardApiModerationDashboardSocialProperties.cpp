

#include "ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties()
{
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::~ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties()
{

}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyInteger* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialModerationDashboardApiModerationDashboardSocialProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



