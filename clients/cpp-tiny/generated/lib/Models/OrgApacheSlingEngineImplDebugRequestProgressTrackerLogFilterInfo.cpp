

#include "OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo.h"

using namespace Tiny;

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties();
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::~OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo()
{

}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterInfo::setProperties(OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties properties)
{
	this->properties = properties;
}



