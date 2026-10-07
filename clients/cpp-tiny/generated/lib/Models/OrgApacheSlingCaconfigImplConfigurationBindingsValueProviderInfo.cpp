

#include "OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo.h"

using namespace Tiny;

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties();
}

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::~OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo()
{

}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderInfo::setProperties(OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties properties)
{
	this->properties = properties;
}



