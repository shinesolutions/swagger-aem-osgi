

#include "OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo.h"

using namespace Tiny;

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties();
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::~OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo()
{

}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderInfo::setProperties(OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties properties)
{
	this->properties = properties;
}



