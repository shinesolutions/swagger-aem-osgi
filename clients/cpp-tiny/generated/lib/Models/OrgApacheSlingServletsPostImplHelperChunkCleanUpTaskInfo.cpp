

#include "OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo.h"

using namespace Tiny;

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties();
}

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::~OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo()
{

}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskInfo::setProperties(OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties properties)
{
	this->properties = properties;
}



