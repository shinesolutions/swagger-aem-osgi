

#include "ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo.h"

using namespace Tiny;

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties();
}

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::~ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo()
{

}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::fromJson(std::string jsonObj)
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




        ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::getPid()
{
	return pid;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::getTitle()
{
	return title;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::getDescription()
{
	return description;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::setDescription(std::string description)
{
	this->description = description;
}

ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::getProperties()
{
	return properties;
}

void
ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo::setProperties(ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties properties)
{
	this->properties = properties;
}



