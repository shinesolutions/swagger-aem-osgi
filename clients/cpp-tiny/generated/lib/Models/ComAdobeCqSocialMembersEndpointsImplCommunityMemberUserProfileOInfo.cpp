

#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo.h"

using namespace Tiny;

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties();
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::~ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo()
{

}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pidKey = "pid";

    if(object.has_key(pidKey))
    {
        bourne::json value = object[pidKey];



        jsonToValue(&pid, value, "std::string");


    }

    const char *titleKey = "title";

    if(object.has_key(titleKey))
    {
        bourne::json value = object[titleKey];



        jsonToValue(&title, value, "std::string");


    }

    const char *descriptionKey = "description";

    if(object.has_key(descriptionKey))
    {
        bourne::json value = object[descriptionKey];



        jsonToValue(&description, value, "std::string");


    }

    const char *propertiesKey = "properties";

    if(object.has_key(propertiesKey))
    {
        bourne::json value = object[propertiesKey];




        ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOInfo::setProperties(ComAdobeCqSocialMembersEndpointsImplCommunityMemberUserProfileOProperties properties)
{
	this->properties = properties;
}



