

#include "ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo.h"

using namespace Tiny;

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties();
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::~ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo()
{

}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamMacSyncHelperImplMACSyncClientImplInfo::setProperties(ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties properties)
{
	this->properties = properties;
}



