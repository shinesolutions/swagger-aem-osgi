#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties()
{
	//__init();
}

ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::~ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties()
{
	//__cleanup();
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::__init()
{
	//processlabel = new ConfigNodePropertyString();
	//extractpages = new ConfigNodePropertyBoolean();
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::__cleanup()
{
	//if(processlabel != NULL) {
	//
	//delete processlabel;
	//processlabel = NULL;
	//}
	//if(extractpages != NULL) {
	//
	//delete extractpages;
	//extractpages = NULL;
	//}
	//
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *processlabelKey = "process.label";
	node = json_object_get_member(pJsonObject, processlabelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&processlabel, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&processlabel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *extractpagesKey = "extract.pages";
	node = json_object_get_member(pJsonObject, extractpagesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&extractpages, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&extractpages);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getProcesslabel();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getProcesslabel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *processlabelKey = "process.label";
	json_object_set_member(pJsonObject, processlabelKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getExtractpages();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getExtractpages());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extractpagesKey = "extract.pages";
	json_object_set_member(pJsonObject, extractpagesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::getProcesslabel()
{
	return processlabel;
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::setProcesslabel(ConfigNodePropertyString  processlabel)
{
	this->processlabel = processlabel;
}

ConfigNodePropertyBoolean
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::getExtractpages()
{
	return extractpages;
}

void
ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties::setExtractpages(ConfigNodePropertyBoolean  extractpages)
{
	this->extractpages = extractpages;
}


