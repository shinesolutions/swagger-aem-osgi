

#include "OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties();
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::~OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo()
{

}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryInfo::setProperties(OrgApacheJackrabbitOakPluginsMetricStatisticsProviderFactoryProperties properties)
{
	this->properties = properties;
}



