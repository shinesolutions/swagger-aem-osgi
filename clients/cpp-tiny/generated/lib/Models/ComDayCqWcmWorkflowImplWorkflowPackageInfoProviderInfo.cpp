

#include "ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.h"

using namespace Tiny;

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties();
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::~ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo()
{

}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::fromJson(std::string jsonObj)
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




        ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::getPid()
{
	return pid;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::getTitle()
{
	return title;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::getDescription()
{
	return description;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::getProperties()
{
	return properties;
}

void
ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo::setProperties(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties properties)
{
	this->properties = properties;
}



