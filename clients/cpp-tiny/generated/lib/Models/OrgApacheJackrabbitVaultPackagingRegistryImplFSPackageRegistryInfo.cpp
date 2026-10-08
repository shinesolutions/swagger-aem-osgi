

#include "OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo.h"

using namespace Tiny;

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo()
{
	pid = std::string();
	title = std::string();
	description = std::string();
	properties = OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties();
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::~OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo()
{

}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::fromJson(std::string jsonObj)
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




        OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties* obj = &properties;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::toJson()
{
    bourne::json object = bourne::json::object();





    object["pid"] = getPid();






    object["title"] = getTitle();






    object["description"] = getDescription();







	object["properties"] = getProperties().toJson();


    return object;

}

std::string
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::getPid()
{
	return pid;
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::setPid(std::string pid)
{
	this->pid = pid;
}

std::string
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::getTitle()
{
	return title;
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::setTitle(std::string title)
{
	this->title = title;
}

std::string
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::getDescription()
{
	return description;
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::setDescription(std::string description)
{
	this->description = description;
}

OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::getProperties()
{
	return properties;
}

void
OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryInfo::setProperties(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties properties)
{
	this->properties = properties;
}



