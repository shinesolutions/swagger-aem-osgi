

#include "ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties()
{
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::~ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties()
{

}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialModerationDashboardApiUserDetailsSocialComponenProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



