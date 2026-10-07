

#include "OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties();
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::~OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo()
{

}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceInfo::setProperties(OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties properties)
{
	this->properties = properties;
}



