

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo::setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties properties)
{
	this->properties = properties;
}



