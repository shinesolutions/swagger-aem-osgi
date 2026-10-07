

#include "ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo.h"

using namespace Tiny;

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties();
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::~ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo()
{

}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::getPid()
{
	return pid;
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::getTitle()
{
	return title;
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::getDescription()
{
	return description;
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactInfo::setProperties(ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties properties)
{
	this->properties = properties;
}



