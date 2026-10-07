#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamCoreImplServletDamContentDispositionFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::ComDayCqDamCoreImplServletDamContentDispositionFilterProperties()
{
	//__init();
}

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::~ComDayCqDamCoreImplServletDamContentDispositionFilterProperties()
{
	//__cleanup();
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::__init()
{
	//cqmimetypeblacklist = new ConfigNodePropertyArray();
	//cqdamemptymime = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::__cleanup()
{
	//if(cqmimetypeblacklist != NULL) {
	//
	//delete cqmimetypeblacklist;
	//cqmimetypeblacklist = NULL;
	//}
	//if(cqdamemptymime != NULL) {
	//
	//delete cqdamemptymime;
	//cqdamemptymime = NULL;
	//}
	//
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqmimetypeblacklistKey = "cq.mime.type.blacklist";
	node = json_object_get_member(pJsonObject, cqmimetypeblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqmimetypeblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqmimetypeblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqdamemptymimeKey = "cq.dam.empty.mime";
	node = json_object_get_member(pJsonObject, cqdamemptymimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqdamemptymime, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqdamemptymime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::ComDayCqDamCoreImplServletDamContentDispositionFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqmimetypeblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqmimetypeblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqmimetypeblacklistKey = "cq.mime.type.blacklist";
	json_object_set_member(pJsonObject, cqmimetypeblacklistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqdamemptymime();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqdamemptymime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqdamemptymimeKey = "cq.dam.empty.mime";
	json_object_set_member(pJsonObject, cqdamemptymimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::getCqmimetypeblacklist()
{
	return cqmimetypeblacklist;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::setCqmimetypeblacklist(ConfigNodePropertyArray  cqmimetypeblacklist)
{
	this->cqmimetypeblacklist = cqmimetypeblacklist;
}

ConfigNodePropertyBoolean
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::getCqdamemptymime()
{
	return cqdamemptymime;
}

void
ComDayCqDamCoreImplServletDamContentDispositionFilterProperties::setCqdamemptymime(ConfigNodePropertyBoolean  cqdamemptymime)
{
	this->cqdamemptymime = cqdamemptymime;
}


