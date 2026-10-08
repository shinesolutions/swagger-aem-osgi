

#include "OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo.h"

using namespace Tiny;

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties();
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::~OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo()
{

}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerInfo::setProperties(OrgApacheSlingHcCoreImplServletResultTxtVerboseSerializerProperties properties)
{
	this->properties = properties;
}



