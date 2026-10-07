

#include "OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties()
{
	dir = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::~OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties()
{

}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *dirKey = "dir";

    if(object.has_key(dirKey))
    {
        bourne::json value = object[dirKey];




        ConfigNodePropertyString* obj = &dir;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["dir"] = getDir().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::getDir()
{
	return dir;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties::setDir(ConfigNodePropertyString dir)
{
	this->dir = dir;
}



