

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo::setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties properties)
{
	this->properties = properties;
}



