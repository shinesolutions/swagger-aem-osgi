

#include "ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo.h"

using namespace Tiny;

ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties();
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::~ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo()
{

}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::getPid()
{
	return pid;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::getTitle()
{
	return title;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::getDescription()
{
	return description;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeCqDamMacSyncImplDAMSyncServiceImplInfo::setProperties(ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties properties)
{
	this->properties = properties;
}



