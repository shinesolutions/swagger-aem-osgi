

#include "OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties();
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::~OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo()
{

}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo::setProperties(OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties properties)
{
	this->properties = properties;
}



