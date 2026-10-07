

#include "ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.h"

using namespace Tiny;

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties()
{
	enableScheduledPostsSearch = ConfigNodePropertyBoolean();
	numberOfMinutes = ConfigNodePropertyInteger();
	maxSearchLimit = ConfigNodePropertyInteger();
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::~ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties()
{

}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *enableScheduledPostsSearchKey = "enableScheduledPostsSearch";

    if(object.has_key(enableScheduledPostsSearchKey))
    {
        bourne::json value = object[enableScheduledPostsSearchKey];




        ConfigNodePropertyBoolean* obj = &enableScheduledPostsSearch;
		obj->fromJson(value.dump());

    }

    const char *numberOfMinutesKey = "numberOfMinutes";

    if(object.has_key(numberOfMinutesKey))
    {
        bourne::json value = object[numberOfMinutesKey];




        ConfigNodePropertyInteger* obj = &numberOfMinutes;
		obj->fromJson(value.dump());

    }

    const char *maxSearchLimitKey = "maxSearchLimit";

    if(object.has_key(maxSearchLimitKey))
    {
        bourne::json value = object[maxSearchLimitKey];




        ConfigNodePropertyInteger* obj = &maxSearchLimit;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["enableScheduledPostsSearch"] = getEnableScheduledPostsSearch().toJson();






	object["numberOfMinutes"] = getNumberOfMinutes().toJson();






	object["maxSearchLimit"] = getMaxSearchLimit().toJson();


    return object;

}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::getEnableScheduledPostsSearch()
{
	return enableScheduledPostsSearch;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::setEnableScheduledPostsSearch(ConfigNodePropertyBoolean enableScheduledPostsSearch)
{
	this->enableScheduledPostsSearch = enableScheduledPostsSearch;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::getNumberOfMinutes()
{
	return numberOfMinutes;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::setNumberOfMinutes(ConfigNodePropertyInteger numberOfMinutes)
{
	this->numberOfMinutes = numberOfMinutes;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::getMaxSearchLimit()
{
	return maxSearchLimit;
}

void
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties::setMaxSearchLimit(ConfigNodePropertyInteger maxSearchLimit)
{
	this->maxSearchLimit = maxSearchLimit;
}



