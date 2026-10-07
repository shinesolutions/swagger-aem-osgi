

#include "OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo.h"

using namespace Tiny;

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties();
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::~OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo()
{

}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedInfo::setProperties(OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties properties)
{
	this->properties = properties;
}



