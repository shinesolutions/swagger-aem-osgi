#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplVersionManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplVersionManagerImplProperties::ComDayCqWcmCoreImplVersionManagerImplProperties()
{
	//__init();
}

ComDayCqWcmCoreImplVersionManagerImplProperties::~ComDayCqWcmCoreImplVersionManagerImplProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::__init()
{
	//versionmanagercreateVersionOnActivation = new ConfigNodePropertyBoolean();
	//versionmanagerpurgingEnabled = new ConfigNodePropertyBoolean();
	//versionmanagerpurgePaths = new ConfigNodePropertyArray();
	//versionmanagerivPaths = new ConfigNodePropertyArray();
	//versionmanagermaxAgeDays = new ConfigNodePropertyInteger();
	//versionmanagermaxNumberVersions = new ConfigNodePropertyInteger();
	//versionmanagerminNumberVersions = new ConfigNodePropertyInteger();
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::__cleanup()
{
	//if(versionmanagercreateVersionOnActivation != NULL) {
	//
	//delete versionmanagercreateVersionOnActivation;
	//versionmanagercreateVersionOnActivation = NULL;
	//}
	//if(versionmanagerpurgingEnabled != NULL) {
	//
	//delete versionmanagerpurgingEnabled;
	//versionmanagerpurgingEnabled = NULL;
	//}
	//if(versionmanagerpurgePaths != NULL) {
	//
	//delete versionmanagerpurgePaths;
	//versionmanagerpurgePaths = NULL;
	//}
	//if(versionmanagerivPaths != NULL) {
	//
	//delete versionmanagerivPaths;
	//versionmanagerivPaths = NULL;
	//}
	//if(versionmanagermaxAgeDays != NULL) {
	//
	//delete versionmanagermaxAgeDays;
	//versionmanagermaxAgeDays = NULL;
	//}
	//if(versionmanagermaxNumberVersions != NULL) {
	//
	//delete versionmanagermaxNumberVersions;
	//versionmanagermaxNumberVersions = NULL;
	//}
	//if(versionmanagerminNumberVersions != NULL) {
	//
	//delete versionmanagerminNumberVersions;
	//versionmanagerminNumberVersions = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *versionmanagercreateVersionOnActivationKey = "versionmanager.createVersionOnActivation";
	node = json_object_get_member(pJsonObject, versionmanagercreateVersionOnActivationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&versionmanagercreateVersionOnActivation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&versionmanagercreateVersionOnActivation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionmanagerpurgingEnabledKey = "versionmanager.purgingEnabled";
	node = json_object_get_member(pJsonObject, versionmanagerpurgingEnabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&versionmanagerpurgingEnabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&versionmanagerpurgingEnabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionmanagerpurgePathsKey = "versionmanager.purgePaths";
	node = json_object_get_member(pJsonObject, versionmanagerpurgePathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&versionmanagerpurgePaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&versionmanagerpurgePaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionmanagerivPathsKey = "versionmanager.ivPaths";
	node = json_object_get_member(pJsonObject, versionmanagerivPathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&versionmanagerivPaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&versionmanagerivPaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionmanagermaxAgeDaysKey = "versionmanager.maxAgeDays";
	node = json_object_get_member(pJsonObject, versionmanagermaxAgeDaysKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&versionmanagermaxAgeDays, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&versionmanagermaxAgeDays);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionmanagermaxNumberVersionsKey = "versionmanager.maxNumberVersions";
	node = json_object_get_member(pJsonObject, versionmanagermaxNumberVersionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&versionmanagermaxNumberVersions, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&versionmanagermaxNumberVersions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *versionmanagerminNumberVersionsKey = "versionmanager.minNumberVersions";
	node = json_object_get_member(pJsonObject, versionmanagerminNumberVersionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&versionmanagerminNumberVersions, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&versionmanagerminNumberVersions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplVersionManagerImplProperties::ComDayCqWcmCoreImplVersionManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplVersionManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getVersionmanagercreateVersionOnActivation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getVersionmanagercreateVersionOnActivation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagercreateVersionOnActivationKey = "versionmanager.createVersionOnActivation";
	json_object_set_member(pJsonObject, versionmanagercreateVersionOnActivationKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getVersionmanagerpurgingEnabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getVersionmanagerpurgingEnabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagerpurgingEnabledKey = "versionmanager.purgingEnabled";
	json_object_set_member(pJsonObject, versionmanagerpurgingEnabledKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getVersionmanagerpurgePaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getVersionmanagerpurgePaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagerpurgePathsKey = "versionmanager.purgePaths";
	json_object_set_member(pJsonObject, versionmanagerpurgePathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getVersionmanagerivPaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getVersionmanagerivPaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagerivPathsKey = "versionmanager.ivPaths";
	json_object_set_member(pJsonObject, versionmanagerivPathsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getVersionmanagermaxAgeDays();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getVersionmanagermaxAgeDays());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagermaxAgeDaysKey = "versionmanager.maxAgeDays";
	json_object_set_member(pJsonObject, versionmanagermaxAgeDaysKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getVersionmanagermaxNumberVersions();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getVersionmanagermaxNumberVersions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagermaxNumberVersionsKey = "versionmanager.maxNumberVersions";
	json_object_set_member(pJsonObject, versionmanagermaxNumberVersionsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getVersionmanagerminNumberVersions();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getVersionmanagerminNumberVersions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionmanagerminNumberVersionsKey = "versionmanager.minNumberVersions";
	json_object_set_member(pJsonObject, versionmanagerminNumberVersionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagercreateVersionOnActivation()
{
	return versionmanagercreateVersionOnActivation;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagercreateVersionOnActivation(ConfigNodePropertyBoolean  versionmanagercreateVersionOnActivation)
{
	this->versionmanagercreateVersionOnActivation = versionmanagercreateVersionOnActivation;
}

ConfigNodePropertyBoolean
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerpurgingEnabled()
{
	return versionmanagerpurgingEnabled;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerpurgingEnabled(ConfigNodePropertyBoolean  versionmanagerpurgingEnabled)
{
	this->versionmanagerpurgingEnabled = versionmanagerpurgingEnabled;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerpurgePaths()
{
	return versionmanagerpurgePaths;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerpurgePaths(ConfigNodePropertyArray  versionmanagerpurgePaths)
{
	this->versionmanagerpurgePaths = versionmanagerpurgePaths;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerivPaths()
{
	return versionmanagerivPaths;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerivPaths(ConfigNodePropertyArray  versionmanagerivPaths)
{
	this->versionmanagerivPaths = versionmanagerivPaths;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagermaxAgeDays()
{
	return versionmanagermaxAgeDays;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagermaxAgeDays(ConfigNodePropertyInteger  versionmanagermaxAgeDays)
{
	this->versionmanagermaxAgeDays = versionmanagermaxAgeDays;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagermaxNumberVersions()
{
	return versionmanagermaxNumberVersions;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagermaxNumberVersions(ConfigNodePropertyInteger  versionmanagermaxNumberVersions)
{
	this->versionmanagermaxNumberVersions = versionmanagermaxNumberVersions;
}

ConfigNodePropertyInteger
ComDayCqWcmCoreImplVersionManagerImplProperties::getVersionmanagerminNumberVersions()
{
	return versionmanagerminNumberVersions;
}

void
ComDayCqWcmCoreImplVersionManagerImplProperties::setVersionmanagerminNumberVersions(ConfigNodePropertyInteger  versionmanagerminNumberVersions)
{
	this->versionmanagerminNumberVersions = versionmanagerminNumberVersions;
}


