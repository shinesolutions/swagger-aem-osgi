

#include "OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties();
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::~OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo()
{

}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderInfo::setProperties(OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties properties)
{
	this->properties = properties;
}



