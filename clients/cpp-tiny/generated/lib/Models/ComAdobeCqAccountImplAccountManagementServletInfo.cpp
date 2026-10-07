

#include "ComAdobeCqAccountImplAccountManagementServletInfo.h"

using namespace Tiny;

ComAdobeCqAccountImplAccountManagementServletInfo::ComAdobeCqAccountImplAccountManagementServletInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqAccountImplAccountManagementServletProperties();
}

ComAdobeCqAccountImplAccountManagementServletInfo::ComAdobeCqAccountImplAccountManagementServletInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqAccountImplAccountManagementServletInfo::~ComAdobeCqAccountImplAccountManagementServletInfo()
{

}

void
ComAdobeCqAccountImplAccountManagementServletInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqAccountImplAccountManagementServletProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqAccountImplAccountManagementServletInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqAccountImplAccountManagementServletInfo::getPid()
{
	return pid;
}

void
ComAdobeCqAccountImplAccountManagementServletInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqAccountImplAccountManagementServletInfo::getTitle()
{
	return title;
}

void
ComAdobeCqAccountImplAccountManagementServletInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqAccountImplAccountManagementServletInfo::getDescription()
{
	return description;
}

void
ComAdobeCqAccountImplAccountManagementServletInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqAccountImplAccountManagementServletProperties
ComAdobeCqAccountImplAccountManagementServletInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqAccountImplAccountManagementServletInfo::setProperties(ComAdobeCqAccountImplAccountManagementServletProperties properties)
{
	this->properties = properties;
}



