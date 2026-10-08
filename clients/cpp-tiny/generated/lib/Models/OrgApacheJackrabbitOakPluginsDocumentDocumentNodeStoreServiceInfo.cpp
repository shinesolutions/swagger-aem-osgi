

#include "OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties();
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::~OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo()
{

}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo::setProperties(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties properties)
{
	this->properties = properties;
}



