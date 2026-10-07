#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplVersionPurgeTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplVersionPurgeTaskProperties::ComDayCqWcmCoreImplVersionPurgeTaskProperties()
{
	//__init();
}

ComDayCqWcmCoreImplVersionPurgeTaskProperties::~ComDayCqWcmCoreImplVersionPurgeTaskProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::__init()
{
	//versionpurgepaths = new ConfigNodePropertyArray();
	//versionpurgerecursive = new ConfigNodePropertyBoolean();
	//versionpurgemaxVersions = new ConfigNodePropertyInteger();
	//versionpurgeminVersions = new ConfigNodePropertyInteger();
	//versionpurgemaxAgeDays = new ConfigNodePropertyInteger();
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::__cleanup()
{
	//if(versionpurgepaths != NULL) {
	//
	//delete versionpurgepaths;
	//versionpurgepaths = NULL;
	//}
	//if(versionpurgerecursive != NULL) {
	//
	//delete versionpurgerecursive;
	//versionpurgerecursive = NULL;
	//}
	//if(versionpurgemaxVersions != NULL) {
	//
	//delete versionpurgemaxVersions;
	//versionpurgemaxVersions = NULL;
	//}
	//if(versionpurgeminVersions != NULL) {
	//
	//delete versionpurgeminVersions;
	//versionpurgeminVersions = NULL;
	//}
	//if(versionpurgemaxAgeDays != NULL) {
	//
	//delete versionpurgemaxAgeDays;
	//versionpurgemaxAgeDays = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *versionpurgepathsKey = "versionpurge.paths";
	node = json_object_get_member(pJsonObject, versionpurgepathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&versionpurgepaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&versionpurgepaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionpurgerecursiveKey = "versionpurge.recursive";
	node = json_object_get_member(pJsonObject, versionpurgerecursiveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&versionpurgerecursive, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&versionpurgerecursive);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionpurgemaxVersionsKey = "versionpurge.maxVersions";
	node = json_object_get_member(pJsonObject, versionpurgemaxVersionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&versionpurgemaxVersions, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&versionpurgemaxVersions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionpurgeminVersionsKey = "versionpurge.minVersions";
	node = json_object_get_member(pJsonObject, versionpurgeminVersionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&versionpurgeminVersions, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&versionpurgeminVersions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionpurgemaxAgeDaysKey = "versionpurge.maxAgeDays";
	node = json_object_get_member(pJsonObject, versionpurgemaxAgeDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&versionpurgemaxAgeDays, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&versionpurgemaxAgeDays);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplVersionPurgeTaskProperties::ComDayCqWcmCoreImplVersionPurgeTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplVersionPurgeTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getVersionpurgepaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getVersionpurgepaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionpurgepathsKey = "versionpurge.paths";
	json_object_set_member(pJsonObject, versionpurgepathsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getVersionpurgerecursive();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getVersionpurgerecursive());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionpurgerecursiveKey = "versionpurge.recursive";
	json_object_set_member(pJsonObject, versionpurgerecursiveKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getVersionpurgemaxVersions();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getVersionpurgemaxVersions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionpurgemaxVersionsKey = "versionpurge.maxVersions";
	json_object_set_member(pJsonObject, versionpurgemaxVersionsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getVersionpurgeminVersions();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getVersionpurgeminVersions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionpurgeminVersionsKey = "versionpurge.minVersions";
	json_object_set_member(pJsonObject, versionpurgeminVersionsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getVersionpurgemaxAgeDays();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getVersionpurgemaxAgeDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionpurgemaxAgeDaysKey = "versionpurge.maxAgeDays";
	json_object_set_member(pJsonObject, versionpurgemaxAgeDaysKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgepaths()
{
	return versionpurgepaths;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgepaths(ConfigNodePropertyArray  versionpurgepaths)
{
	this->versionpurgepaths = versionpurgepaths;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgerecursive()
{
	return versionpurgerecursive;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgerecursive(ConfigNodePropertyBoolean  versionpurgerecursive)
{
	this->versionpurgerecursive = versionpurgerecursive;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgemaxVersions()
{
	return versionpurgemaxVersions;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgemaxVersions(ConfigNodePropertyInteger  versionpurgemaxVersions)
{
	this->versionpurgemaxVersions = versionpurgemaxVersions;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgeminVersions()
{
	return versionpurgeminVersions;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgeminVersions(ConfigNodePropertyInteger  versionpurgeminVersions)
{
	this->versionpurgeminVersions = versionpurgeminVersions;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionPurgeTaskProperties::getVersionpurgemaxAgeDays()
{
	return versionpurgemaxAgeDays;
}

void
ComDayCqWcmCoreImplVersionPurgeTaskProperties::setVersionpurgemaxAgeDays(ConfigNodePropertyInteger  versionpurgemaxAgeDays)
{
	this->versionpurgemaxAgeDays = versionpurgemaxAgeDays;
}


