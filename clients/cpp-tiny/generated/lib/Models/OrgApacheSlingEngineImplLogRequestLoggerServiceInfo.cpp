

#include "OrgApacheSlingEngineImplLogRequestLoggerServiceInfo.h"

using namespace Tiny;

OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::OrgApacheSlingEngineImplLogRequestLoggerServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingEngineImplLogRequestLoggerServiceProperties();
}

OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::OrgApacheSlingEngineImplLogRequestLoggerServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::~OrgApacheSlingEngineImplLogRequestLoggerServiceInfo()
{

}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingEngineImplLogRequestLoggerServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceInfo::setProperties(OrgApacheSlingEngineImplLogRequestLoggerServiceProperties properties)
{
	this->properties = properties;
}



