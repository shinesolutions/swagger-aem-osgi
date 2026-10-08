

#include "ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.h"

using namespace Tiny;

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties();
}

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::~ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo()
{

}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::fromJson(std::string jsonObj)
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




        ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::getPid()
{
	return pid;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::getTitle()
{
	return title;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::getDescription()
{
	return description;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::setDescription(std::string description)
{
	this->description = description;
}

ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::getProperties()
{
	return properties;
}

void
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo::setProperties(ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties properties)
{
	this->properties = properties;
}



