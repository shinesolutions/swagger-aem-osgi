#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties()
{
	//__init();
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::~OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//path = new ConfigNodePropertyString();
	//serviceName = new ConfigNodePropertyString();
	//nuggetsPath = new ConfigNodePropertyString();
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(nuggetsPath != NULL) {
	//
	//delete nuggetsPath;
	//nuggetsPath = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&name, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&name);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&path, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *serviceNameKey = "serviceName";
	node = json_object_get_member(pJsonObject, serviceNameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&serviceName, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&serviceName);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *nuggetsPathKey = "nuggetsPath";
	node = json_object_get_member(pJsonObject, nuggetsPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&nuggetsPath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&nuggetsPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getServiceName();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getServiceName());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *serviceNameKey = "serviceName";
	json_object_set_member(pJsonObject, serviceNameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getNuggetsPath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getNuggetsPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *nuggetsPathKey = "nuggetsPath";
	json_object_set_member(pJsonObject, nuggetsPathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::getNuggetsPath()
{
	return nuggetsPath;
}

void
OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties::setNuggetsPath(ConfigNodePropertyString  nuggetsPath)
{
	this->nuggetsPath = nuggetsPath;
}


