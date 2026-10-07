

#include "OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties();
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::~OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo()
{

}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceInfo::setProperties(OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties properties)
{
	this->properties = properties;
}



