

#include "OrgApacheSlingFeatureflagsFeatureInfo.h"

using namespace Tiny;

OrgApacheSlingFeatureflagsFeatureInfo::OrgApacheSlingFeatureflagsFeatureInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingFeatureflagsFeatureProperties();
}

OrgApacheSlingFeatureflagsFeatureInfo::OrgApacheSlingFeatureflagsFeatureInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingFeatureflagsFeatureInfo::~OrgApacheSlingFeatureflagsFeatureInfo()
{

}

void
OrgApacheSlingFeatureflagsFeatureInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingFeatureflagsFeatureProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingFeatureflagsFeatureInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingFeatureflagsFeatureInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingFeatureflagsFeatureInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingFeatureflagsFeatureInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingFeatureflagsFeatureInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingFeatureflagsFeatureInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingFeatureflagsFeatureInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingFeatureflagsFeatureProperties
OrgApacheSlingFeatureflagsFeatureInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingFeatureflagsFeatureInfo::setProperties(OrgApacheSlingFeatureflagsFeatureProperties properties)
{
	this->properties = properties;
}



