

#include "OrgApacheSlingDatasourceDataSourceFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingDatasourceDataSourceFactoryInfo::OrgApacheSlingDatasourceDataSourceFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDatasourceDataSourceFactoryProperties();
}

OrgApacheSlingDatasourceDataSourceFactoryInfo::OrgApacheSlingDatasourceDataSourceFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDatasourceDataSourceFactoryInfo::~OrgApacheSlingDatasourceDataSourceFactoryInfo()
{

}

void
OrgApacheSlingDatasourceDataSourceFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDatasourceDataSourceFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDatasourceDataSourceFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDatasourceDataSourceFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDatasourceDataSourceFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDatasourceDataSourceFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDatasourceDataSourceFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDatasourceDataSourceFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDatasourceDataSourceFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDatasourceDataSourceFactoryProperties
OrgApacheSlingDatasourceDataSourceFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDatasourceDataSourceFactoryInfo::setProperties(OrgApacheSlingDatasourceDataSourceFactoryProperties properties)
{
	this->properties = properties;
}



