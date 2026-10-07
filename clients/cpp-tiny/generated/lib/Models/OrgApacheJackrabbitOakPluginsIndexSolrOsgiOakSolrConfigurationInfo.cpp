

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationInfo::setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties properties)
{
	this->properties = properties;
}



