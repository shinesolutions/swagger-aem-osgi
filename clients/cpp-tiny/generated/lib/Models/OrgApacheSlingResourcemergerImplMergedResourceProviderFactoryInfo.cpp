

#include "OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties();
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::~OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo()
{

}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryInfo::setProperties(OrgApacheSlingResourcemergerImplMergedResourceProviderFactoryProperties properties)
{
	this->properties = properties;
}



