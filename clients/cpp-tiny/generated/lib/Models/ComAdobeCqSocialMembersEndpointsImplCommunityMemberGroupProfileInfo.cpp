

#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo.h"

using namespace Tiny;

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties();
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::~ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo()
{

}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileInfo::setProperties(ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties properties)
{
	this->properties = properties;
}



