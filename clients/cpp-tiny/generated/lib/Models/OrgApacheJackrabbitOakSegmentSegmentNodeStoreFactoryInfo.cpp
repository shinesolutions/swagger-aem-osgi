

#include "OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties();
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::~OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo()
{

}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryInfo::setProperties(OrgApacheJackrabbitOakSegmentSegmentNodeStoreFactoryProperties properties)
{
	this->properties = properties;
}



