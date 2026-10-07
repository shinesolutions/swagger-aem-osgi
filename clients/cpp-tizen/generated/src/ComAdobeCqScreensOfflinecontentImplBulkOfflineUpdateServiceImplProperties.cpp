#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties()
{
	//__init();
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::~ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::__init()
{
	//comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath = new ConfigNodePropertyArray();
	//comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency = new ConfigNodePropertyString();
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::__cleanup()
{
	//if(comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath != NULL) {
	//
	//delete comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
	//comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath = NULL;
	//}
	//if(comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency != NULL) {
	//
	//delete comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
	//comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency = NULL;
	//}
	//
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath";
	node = json_object_get_member(pJsonObject, comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency";
	node = json_object_get_member(pJsonObject, comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath";
	json_object_set_member(pJsonObject, comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPathKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency";
	json_object_set_member(pJsonObject, comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequencyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath()
{
	return comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath(ConfigNodePropertyArray  comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath)
{
	this->comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath = comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplprojectPath;
}

ConfigNodePropertyString
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::getComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency()
{
	return comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
}

void
ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties::setComadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency(ConfigNodePropertyString  comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency)
{
	this->comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency = comadobecqscreensofflinecontentimplBulkOfflineUpdateServiceImplscheduleFrequency;
}


