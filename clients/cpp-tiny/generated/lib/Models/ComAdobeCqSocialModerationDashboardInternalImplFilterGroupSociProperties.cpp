

#include "ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.h"

using namespace Tiny;

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties()
{
	resourceTypefilters = ConfigNodePropertyArray();
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::~ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties()
{

}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::fromJson(std::string jsonObj)
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
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["resourceTypefilters"] = getResourceTypefilters().toJson();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyArray
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::getResourceTypefilters()
{
	return resourceTypefilters;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::setResourceTypefilters(ConfigNodePropertyArray resourceTypefilters)
{
	this->resourceTypefilters = resourceTypefilters;
}

ConfigNodePropertyInteger
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



