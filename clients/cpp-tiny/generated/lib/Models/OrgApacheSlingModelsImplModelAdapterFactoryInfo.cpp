

#include "OrgApacheSlingModelsImplModelAdapterFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingModelsImplModelAdapterFactoryInfo::OrgApacheSlingModelsImplModelAdapterFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingModelsImplModelAdapterFactoryProperties();
}

OrgApacheSlingModelsImplModelAdapterFactoryInfo::OrgApacheSlingModelsImplModelAdapterFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingModelsImplModelAdapterFactoryInfo::~OrgApacheSlingModelsImplModelAdapterFactoryInfo()
{

}

void
OrgApacheSlingModelsImplModelAdapterFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingModelsImplModelAdapterFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingModelsImplModelAdapterFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingModelsImplModelAdapterFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingModelsImplModelAdapterFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingModelsImplModelAdapterFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingModelsImplModelAdapterFactoryProperties
OrgApacheSlingModelsImplModelAdapterFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingModelsImplModelAdapterFactoryInfo::setProperties(OrgApacheSlingModelsImplModelAdapterFactoryProperties properties)
{
	this->properties = properties;
}



