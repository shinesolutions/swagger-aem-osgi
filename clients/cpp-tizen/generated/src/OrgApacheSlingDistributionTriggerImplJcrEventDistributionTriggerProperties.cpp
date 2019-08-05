#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties()
{
	//__init();
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::~OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::__init()
{
	//name = new ConfigNodePropertyString();
	//path = new ConfigNodePropertyString();
	//ignoredPathsPatterns = new ConfigNodePropertyArray();
	//serviceName = new ConfigNodePropertyString();
	//deep = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::__cleanup()
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
	//if(ignoredPathsPatterns != NULL) {
	//
	//delete ignoredPathsPatterns;
	//ignoredPathsPatterns = NULL;
	//}
	//if(serviceName != NULL) {
	//
	//delete serviceName;
	//serviceName = NULL;
	//}
	//if(deep != NULL) {
	//
	//delete deep;
	//deep = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::fromJson(char* jsonStr)
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
	const gchar *ignoredPathsPatternsKey = "ignoredPathsPatterns";
	node = json_object_get_member(pJsonObject, ignoredPathsPatternsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&ignoredPathsPatterns, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&ignoredPathsPatterns);
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
	const gchar *deepKey = "deep";
	node = json_object_get_member(pJsonObject, deepKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&deep, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&deep);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::toJson()
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
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIgnoredPathsPatterns();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIgnoredPathsPatterns());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *ignoredPathsPatternsKey = "ignoredPathsPatterns";
	json_object_set_member(pJsonObject, ignoredPathsPatternsKey, node);
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
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDeep();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDeep());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deepKey = "deep";
	json_object_set_member(pJsonObject, deepKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getName()
{
	return name;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setName(ConfigNodePropertyString  name)
{
	this->name = name;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getPath()
{
	return path;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setPath(ConfigNodePropertyString  path)
{
	this->path = path;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getIgnoredPathsPatterns()
{
	return ignoredPathsPatterns;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setIgnoredPathsPatterns(ConfigNodePropertyArray  ignoredPathsPatterns)
{
	this->ignoredPathsPatterns = ignoredPathsPatterns;
}

ConfigNodePropertyString
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getServiceName()
{
	return serviceName;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setServiceName(ConfigNodePropertyString  serviceName)
{
	this->serviceName = serviceName;
}

ConfigNodePropertyBoolean
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::getDeep()
{
	return deep;
}

void
OrgApacheSlingDistributionTriggerImplJcrEventDistributionTriggerProperties::setDeep(ConfigNodePropertyBoolean  deep)
{
	this->deep = deep;
}


