

#include "OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo.h"

using namespace Tiny;

OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties();
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::~OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo()
{

}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingDatasourceJNDIDataSourceFactoryInfo::setProperties(OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties properties)
{
	this->properties = properties;
}



