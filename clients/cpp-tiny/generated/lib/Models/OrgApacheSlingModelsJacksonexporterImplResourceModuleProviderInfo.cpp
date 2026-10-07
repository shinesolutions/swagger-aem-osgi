

#include "OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo.h"

using namespace Tiny;

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties();
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::~OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo()
{

}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderInfo::setProperties(OrgApacheSlingModelsJacksonexporterImplResourceModuleProviderProperties properties)
{
	this->properties = properties;
}



