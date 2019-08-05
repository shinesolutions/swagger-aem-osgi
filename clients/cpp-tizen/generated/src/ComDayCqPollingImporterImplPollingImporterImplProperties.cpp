#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqPollingImporterImplPollingImporterImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqPollingImporterImplPollingImporterImplProperties::ComDayCqPollingImporterImplPollingImporterImplProperties()
{
	//__init();
}

ComDayCqPollingImporterImplPollingImporterImplProperties::~ComDayCqPollingImporterImplPollingImporterImplProperties()
{
	//__cleanup();
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::__init()
{
	//importermininterval = new ConfigNodePropertyInteger();
	//importeruser = new ConfigNodePropertyString();
	//excludepaths = new ConfigNodePropertyArray();
	//includepaths = new ConfigNodePropertyArray();
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::__cleanup()
{
	//if(importermininterval != NULL) {
	//
	//delete importermininterval;
	//importermininterval = NULL;
	//}
	//if(importeruser != NULL) {
	//
	//delete importeruser;
	//importeruser = NULL;
	//}
	//if(excludepaths != NULL) {
	//
	//delete excludepaths;
	//excludepaths = NULL;
	//}
	//if(includepaths != NULL) {
	//
	//delete includepaths;
	//includepaths = NULL;
	//}
	//
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *importerminintervalKey = "importer.min.interval";
	node = json_object_get_member(pJsonObject, importerminintervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&importermininterval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&importermininterval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *importeruserKey = "importer.user";
	node = json_object_get_member(pJsonObject, importeruserKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&importeruser, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&importeruser);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *excludepathsKey = "exclude.paths";
	node = json_object_get_member(pJsonObject, excludepathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&excludepaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&excludepaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *includepathsKey = "include.paths";
	node = json_object_get_member(pJsonObject, includepathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&includepaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&includepaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqPollingImporterImplPollingImporterImplProperties::ComDayCqPollingImporterImplPollingImporterImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqPollingImporterImplPollingImporterImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getImportermininterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getImportermininterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importerminintervalKey = "importer.min.interval";
	json_object_set_member(pJsonObject, importerminintervalKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getImporteruser();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getImporteruser());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *importeruserKey = "importer.user";
	json_object_set_member(pJsonObject, importeruserKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExcludepaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExcludepaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *excludepathsKey = "exclude.paths";
	json_object_set_member(pJsonObject, excludepathsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getIncludepaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getIncludepaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *includepathsKey = "include.paths";
	json_object_set_member(pJsonObject, includepathsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqPollingImporterImplPollingImporterImplProperties::getImportermininterval()
{
	return importermininterval;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setImportermininterval(ConfigNodePropertyInteger  importermininterval)
{
	this->importermininterval = importermininterval;
}

ConfigNodePropertyString
ComDayCqPollingImporterImplPollingImporterImplProperties::getImporteruser()
{
	return importeruser;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setImporteruser(ConfigNodePropertyString  importeruser)
{
	this->importeruser = importeruser;
}

ConfigNodePropertyArray
ComDayCqPollingImporterImplPollingImporterImplProperties::getExcludepaths()
{
	return excludepaths;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setExcludepaths(ConfigNodePropertyArray  excludepaths)
{
	this->excludepaths = excludepaths;
}

ConfigNodePropertyArray
ComDayCqPollingImporterImplPollingImporterImplProperties::getIncludepaths()
{
	return includepaths;
}

void
ComDayCqPollingImporterImplPollingImporterImplProperties::setIncludepaths(ConfigNodePropertyArray  includepaths)
{
	this->includepaths = includepaths;
}


