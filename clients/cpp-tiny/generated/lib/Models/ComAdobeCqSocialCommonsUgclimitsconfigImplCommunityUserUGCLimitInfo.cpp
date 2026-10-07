

#include "ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo.h"

using namespace Tiny;

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties();
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::~ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo()
{

}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitInfo::setProperties(ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitProperties properties)
{
	this->properties = properties;
}



