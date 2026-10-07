

#include "OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.h"

using namespace Tiny;

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties()
{
	accountName = ConfigNodePropertyString();
	containerName = ConfigNodePropertyString();
	accessKey = ConfigNodePropertyString();
	rootPath = ConfigNodePropertyString();
	connectionURL = ConfigNodePropertyString();
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(std::string jsonString)
{
	this->fromJson(jsonString);
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::~OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties()
{

}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *accountNameKey = "accountName";

    if(object.has_key(accountNameKey))
    {
        bourne::json value = object[accountNameKey];




        ConfigNodePropertyString* obj = &accountName;
		obj->fromJson(value.dump());

    }

    const char *containerNameKey = "containerName";

    if(object.has_key(containerNameKey))
    {
        bourne::json value = object[containerNameKey];




        ConfigNodePropertyString* obj = &containerName;
		obj->fromJson(value.dump());

    }

    const char *accessKeyKey = "accessKey";

    if(object.has_key(accessKeyKey))
    {
        bourne::json value = object[accessKeyKey];




        ConfigNodePropertyString* obj = &accessKey;
		obj->fromJson(value.dump());

    }

    const char *rootPathKey = "rootPath";

    if(object.has_key(rootPathKey))
    {
        bourne::json value = object[rootPathKey];




        ConfigNodePropertyString* obj = &rootPath;
		obj->fromJson(value.dump());

    }

    const char *connectionURLKey = "connectionURL";

    if(object.has_key(connectionURLKey))
    {
        bourne::json value = object[connectionURLKey];




        ConfigNodePropertyString* obj = &connectionURL;
		obj->fromJson(value.dump());

    }


}

bourne::json
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::toJson()
{
    bourne::json object = bourne::json::object();






	object["accountName"] = getAccountName().toJson();






	object["containerName"] = getContainerName().toJson();






	object["accessKey"] = getAccessKey().toJson();






	object["rootPath"] = getRootPath().toJson();






	object["connectionURL"] = getConnectionURL().toJson();


    return object;

}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getAccountName()
{
	return accountName;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setAccountName(ConfigNodePropertyString accountName)
{
	this->accountName = accountName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getContainerName()
{
	return containerName;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setContainerName(ConfigNodePropertyString containerName)
{
	this->containerName = containerName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getAccessKey()
{
	return accessKey;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setAccessKey(ConfigNodePropertyString accessKey)
{
	this->accessKey = accessKey;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getRootPath()
{
	return rootPath;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setRootPath(ConfigNodePropertyString rootPath)
{
	this->rootPath = rootPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getConnectionURL()
{
	return connectionURL;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setConnectionURL(ConfigNodePropertyString connectionURL)
{
	this->connectionURL = connectionURL;
}



