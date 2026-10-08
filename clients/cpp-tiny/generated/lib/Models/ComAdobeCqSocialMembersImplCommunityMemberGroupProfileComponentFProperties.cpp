

#include "ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties.h"

using namespace Tiny;

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties()
{
	everyoneLimit = ConfigNodePropertyInteger();
	priority = ConfigNodePropertyInteger();
}

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::~ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties()
{

}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *everyoneLimitKey = "everyoneLimit";

    if(object.has_key(everyoneLimitKey))
    {
        bourne::json value = object[everyoneLimitKey];




        ConfigNodePropertyInteger* obj = &everyoneLimit;
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
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["everyoneLimit"] = getEveryoneLimit().toJson();






	object["priority"] = getPriority().toJson();


    return object;

}

ConfigNodePropertyInteger
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::getEveryoneLimit()
{
	return everyoneLimit;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::setEveryoneLimit(ConfigNodePropertyInteger everyoneLimit)
{
	this->everyoneLimit = everyoneLimit;
}

ConfigNodePropertyInteger
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::getPriority()
{
	return priority;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties::setPriority(ConfigNodePropertyInteger priority)
{
	this->priority = priority;
}



