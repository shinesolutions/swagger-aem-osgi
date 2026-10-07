

#include "ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties()
{
	resourceTypefilters = ConfigNodePropertyArray();
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::~ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties()
{

}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *resourceTypefiltersKey = "resourceType.filters";

    if(object.has_key(resourceTypefiltersKey))
    {
        bourne::json value = object[resourceTypefiltersKey];




        ConfigNodePropertyArray* obj = &resourceTypefilters;
		obj->fromJson(value.dump());

    }

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];




        ConfigNodePropertyInteger* obj = &priority;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["resourceTypefilters"] = getResourceTypefilters().toJson();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::getResourceTypefilters()
{
	return resourceTypefilters;
}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::setResourceTypefilters(ConfigNodePropertyArray resourceTypefilters)
{
	this->resourceTypefilters = resourceTypefilters;
}

ConfigNodePropertyInteger
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



