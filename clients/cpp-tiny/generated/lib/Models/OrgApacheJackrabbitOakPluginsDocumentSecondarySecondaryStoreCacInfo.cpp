

#include "OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties();
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::~OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo()
{

}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo::setProperties(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties properties)
{
	this->properties = properties;
}



