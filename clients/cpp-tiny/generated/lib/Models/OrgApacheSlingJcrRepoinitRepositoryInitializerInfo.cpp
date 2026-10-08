

#include "OrgApacheSlingJcrRepoinitRepositoryInitializerInfo.h"

using namespace Tiny;

OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::OrgApacheSlingJcrRepoinitRepositoryInitializerInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingJcrRepoinitRepositoryInitializerProperties();
}

OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::OrgApacheSlingJcrRepoinitRepositoryInitializerInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::~OrgApacheSlingJcrRepoinitRepositoryInitializerInfo()
{

}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingJcrRepoinitRepositoryInitializerProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingJcrRepoinitRepositoryInitializerProperties
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingJcrRepoinitRepositoryInitializerInfo::setProperties(OrgApacheSlingJcrRepoinitRepositoryInitializerProperties properties)
{
	this->properties = properties;
}



