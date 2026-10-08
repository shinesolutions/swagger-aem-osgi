

#include "ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo.h"

using namespace Tiny;

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties();
}

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::~ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo()
{

}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFInfo::setProperties(ComAdobeCqSocialMembersImplCommunityMemberGroupProfileComponentFProperties properties)
{
	this->properties = properties;
}



