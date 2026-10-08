

#include "ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties();
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::~ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo()
{

}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::fromJson(std::string jsonObj)
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




        ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::getPid()
{
	return pid;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::getTitle()
{
	return title;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::getDescription()
{
	return description;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::getProperties()
{
	return properties;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplInfo::setProperties(ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties properties)
{
	this->properties = properties;
}



