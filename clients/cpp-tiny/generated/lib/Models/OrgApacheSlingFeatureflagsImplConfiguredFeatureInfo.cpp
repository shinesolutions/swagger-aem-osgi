

#include "OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo.h"

using namespace Tiny;

OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties();
}

OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::~OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo()
{

}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingFeatureflagsImplConfiguredFeatureInfo::setProperties(OrgApacheSlingFeatureflagsImplConfiguredFeatureProperties properties)
{
	this->properties = properties;
}



