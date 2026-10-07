

#include "OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties()
{
	path = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::~OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties()
{

}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *pathKey = "path";

    if(object.has_key(pathKey))
    {
        bourne::json value = object[pathKey];




        ConfigNodePropertyString* obj = &path;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["path"] = getPath().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::getPath()
{
	return path;
}

void
OrgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties::setPath(ConfigNodePropertyString path)
{
	this->path = path;
}



