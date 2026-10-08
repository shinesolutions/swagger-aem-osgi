

#include "ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo.h"

using namespace Tiny;

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties();
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::~ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo()
{

}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::getPid()
{
	return pid;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::getTitle()
{
	return title;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::getDescription()
{
	return description;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqSocialAccountverificationImplAccountManagementConfigImInfo::setProperties(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties properties)
{
	this->properties = properties;
}



