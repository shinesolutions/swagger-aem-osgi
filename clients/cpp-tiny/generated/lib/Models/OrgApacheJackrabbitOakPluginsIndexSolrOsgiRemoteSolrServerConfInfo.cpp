

#include "OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties();
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::~OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo()
{

}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo::setProperties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties properties)
{
	this->properties = properties;
}



