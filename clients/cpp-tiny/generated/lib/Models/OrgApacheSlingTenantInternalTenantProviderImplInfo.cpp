

#include "OrgApacheSlingTenantInternalTenantProviderImplInfo.h"

using namespace Tiny;

OrgApacheSlingTenantInternalTenantProviderImplInfo::OrgApacheSlingTenantInternalTenantProviderImplInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheSlingTenantInternalTenantProviderImplProperties();
}

OrgApacheSlingTenantInternalTenantProviderImplInfo::OrgApacheSlingTenantInternalTenantProviderImplInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheSlingTenantInternalTenantProviderImplInfo::~OrgApacheSlingTenantInternalTenantProviderImplInfo()
{

}

void
OrgApacheSlingTenantInternalTenantProviderImplInfo::fromJson(std::string jsonObj)
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




        OrgApacheSlingTenantInternalTenantProviderImplProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheSlingTenantInternalTenantProviderImplInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheSlingTenantInternalTenantProviderImplInfo::getPid()
{
	return pid;
}

void
OrgApacheSlingTenantInternalTenantProviderImplInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheSlingTenantInternalTenantProviderImplInfo::getTitle()
{
	return title;
}

void
OrgApacheSlingTenantInternalTenantProviderImplInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheSlingTenantInternalTenantProviderImplInfo::getDescription()
{
	return description;
}

void
OrgApacheSlingTenantInternalTenantProviderImplInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheSlingTenantInternalTenantProviderImplProperties
OrgApacheSlingTenantInternalTenantProviderImplInfo::getProperties()
{
	return properties;
}

void
OrgApacheSlingTenantInternalTenantProviderImplInfo::setProperties(OrgApacheSlingTenantInternalTenantProviderImplProperties properties)
{
	this->properties = properties;
}



