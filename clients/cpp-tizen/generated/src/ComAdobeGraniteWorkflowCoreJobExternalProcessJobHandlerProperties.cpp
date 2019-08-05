#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::~ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::__init()
{
	//defaulttimeout = new ConfigNodePropertyInteger();
	//maxtimeout = new ConfigNodePropertyInteger();
	//defaultperiod = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::__cleanup()
{
	//if(defaulttimeout != NULL) {
	//
	//delete defaulttimeout;
	//defaulttimeout = NULL;
	//}
	//if(maxtimeout != NULL) {
	//
	//delete maxtimeout;
	//maxtimeout = NULL;
	//}
	//if(defaultperiod != NULL) {
	//
	//delete defaultperiod;
	//defaultperiod = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *defaulttimeoutKey = "default.timeout";
	node = json_object_get_member(pJsonObject, defaulttimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&defaulttimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&defaulttimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *maxtimeoutKey = "max.timeout";
	node = json_object_get_member(pJsonObject, maxtimeoutKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxtimeout, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxtimeout);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *defaultperiodKey = "default.period";
	node = json_object_get_member(pJsonObject, defaultperiodKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&defaultperiod, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&defaultperiod);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDefaulttimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDefaulttimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaulttimeoutKey = "default.timeout";
	json_object_set_member(pJsonObject, defaulttimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxtimeout();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxtimeout());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxtimeoutKey = "max.timeout";
	json_object_set_member(pJsonObject, maxtimeoutKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getDefaultperiod();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getDefaultperiod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *defaultperiodKey = "default.period";
	json_object_set_member(pJsonObject, defaultperiodKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getDefaulttimeout()
{
	return defaulttimeout;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setDefaulttimeout(ConfigNodePropertyInteger  defaulttimeout)
{
	this->defaulttimeout = defaulttimeout;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getMaxtimeout()
{
	return maxtimeout;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setMaxtimeout(ConfigNodePropertyInteger  maxtimeout)
{
	this->maxtimeout = maxtimeout;
}

ConfigNodePropertyInteger
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::getDefaultperiod()
{
	return defaultperiod;
}

void
ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties::setDefaultperiod(ConfigNodePropertyInteger  defaultperiod)
{
	this->defaultperiod = defaultperiod;
}


