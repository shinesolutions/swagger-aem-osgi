#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties()
{
	//__init();
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::~OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties()
{
	//__cleanup();
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::__init()
{
	//accountName = new ConfigNodePropertyString();
	//containerName = new ConfigNodePropertyString();
	//accessKey = new ConfigNodePropertyString();
	//rootPath = new ConfigNodePropertyString();
	//connectionURL = new ConfigNodePropertyString();
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::__cleanup()
{
	//if(accountName != NULL) {
	//
	//delete accountName;
	//accountName = NULL;
	//}
	//if(containerName != NULL) {
	//
	//delete containerName;
	//containerName = NULL;
	//}
	//if(accessKey != NULL) {
	//
	//delete accessKey;
	//accessKey = NULL;
	//}
	//if(rootPath != NULL) {
	//
	//delete rootPath;
	//rootPath = NULL;
	//}
	//if(connectionURL != NULL) {
	//
	//delete connectionURL;
	//connectionURL = NULL;
	//}
	//
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accountNameKey = "accountName";
	node = json_object_get_member(pJsonObject, accountNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&accountName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&accountName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *containerNameKey = "containerName";
	node = json_object_get_member(pJsonObject, containerNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&containerName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&containerName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *accessKeyKey = "accessKey";
	node = json_object_get_member(pJsonObject, accessKeyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&accessKey, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&accessKey);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rootPathKey = "rootPath";
	node = json_object_get_member(pJsonObject, rootPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&rootPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&rootPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *connectionURLKey = "connectionURL";
	node = json_object_get_member(pJsonObject, connectionURLKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&connectionURL, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&connectionURL);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAccountName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAccountName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accountNameKey = "accountName";
	json_object_set_member(pJsonObject, accountNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getContainerName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getContainerName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *containerNameKey = "containerName";
	json_object_set_member(pJsonObject, containerNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAccessKey();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAccessKey());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accessKeyKey = "accessKey";
	json_object_set_member(pJsonObject, accessKeyKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRootPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRootPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rootPathKey = "rootPath";
	json_object_set_member(pJsonObject, rootPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getConnectionURL();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getConnectionURL());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectionURLKey = "connectionURL";
	json_object_set_member(pJsonObject, connectionURLKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getAccountName()
{
	return accountName;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setAccountName(ConfigNodePropertyString  accountName)
{
	this->accountName = accountName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getContainerName()
{
	return containerName;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setContainerName(ConfigNodePropertyString  containerName)
{
	this->containerName = containerName;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getAccessKey()
{
	return accessKey;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setAccessKey(ConfigNodePropertyString  accessKey)
{
	this->accessKey = accessKey;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getRootPath()
{
	return rootPath;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setRootPath(ConfigNodePropertyString  rootPath)
{
	this->rootPath = rootPath;
}

ConfigNodePropertyString
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::getConnectionURL()
{
	return connectionURL;
}

void
OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties::setConnectionURL(ConfigNodePropertyString  connectionURL)
{
	this->connectionURL = connectionURL;
}


