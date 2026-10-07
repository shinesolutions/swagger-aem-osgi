

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo::setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties properties)
{
	this->properties = properties;
}



