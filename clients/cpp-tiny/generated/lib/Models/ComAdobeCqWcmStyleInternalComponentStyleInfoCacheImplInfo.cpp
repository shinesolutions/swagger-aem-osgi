

#include "ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.h"

using namespace Tiny;

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties();
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::~ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo()
{

}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo::setProperties(ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties properties)
{
	this->properties = properties;
}



