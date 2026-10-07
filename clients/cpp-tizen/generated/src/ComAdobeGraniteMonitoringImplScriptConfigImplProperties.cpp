#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteMonitoringImplScriptConfigImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteMonitoringImplScriptConfigImplProperties::ComAdobeGraniteMonitoringImplScriptConfigImplProperties()
{
	//__init();
}

ComAdobeGraniteMonitoringImplScriptConfigImplProperties::~ComAdobeGraniteMonitoringImplScriptConfigImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::__init()
{
	//scriptfilename = new ConfigNodePropertyString();
	//scriptdisplay = new ConfigNodePropertyString();
	//scriptpath = new ConfigNodePropertyString();
	//scriptplatform = new ConfigNodePropertyArray();
	//interval = new ConfigNodePropertyInteger();
	//jmxdomain = new ConfigNodePropertyString();
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::__cleanup()
{
	//if(scriptfilename != NULL) {
	//
	//delete scriptfilename;
	//scriptfilename = NULL;
	//}
	//if(scriptdisplay != NULL) {
	//
	//delete scriptdisplay;
	//scriptdisplay = NULL;
	//}
	//if(scriptpath != NULL) {
	//
	//delete scriptpath;
	//scriptpath = NULL;
	//}
	//if(scriptplatform != NULL) {
	//
	//delete scriptplatform;
	//scriptplatform = NULL;
	//}
	//if(interval != NULL) {
	//
	//delete interval;
	//interval = NULL;
	//}
	//if(jmxdomain != NULL) {
	//
	//delete jmxdomain;
	//jmxdomain = NULL;
	//}
	//
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *scriptfilenameKey = "script.filename";
	node = json_object_get_member(pJsonObject, scriptfilenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scriptfilename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scriptfilename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scriptdisplayKey = "script.display";
	node = json_object_get_member(pJsonObject, scriptdisplayKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scriptdisplay, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scriptdisplay);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scriptpathKey = "script.path";
	node = json_object_get_member(pJsonObject, scriptpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&scriptpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&scriptpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *scriptplatformKey = "script.platform";
	node = json_object_get_member(pJsonObject, scriptplatformKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&scriptplatform, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&scriptplatform);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *intervalKey = "interval";
	node = json_object_get_member(pJsonObject, intervalKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&interval, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&interval);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jmxdomainKey = "jmxdomain";
	node = json_object_get_member(pJsonObject, jmxdomainKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jmxdomain, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jmxdomain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteMonitoringImplScriptConfigImplProperties::ComAdobeGraniteMonitoringImplScriptConfigImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScriptfilename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScriptfilename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scriptfilenameKey = "script.filename";
	json_object_set_member(pJsonObject, scriptfilenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScriptdisplay();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScriptdisplay());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scriptdisplayKey = "script.display";
	json_object_set_member(pJsonObject, scriptdisplayKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getScriptpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getScriptpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scriptpathKey = "script.path";
	json_object_set_member(pJsonObject, scriptpathKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getScriptplatform();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getScriptplatform());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *scriptplatformKey = "script.platform";
	json_object_set_member(pJsonObject, scriptplatformKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getInterval();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getInterval());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *intervalKey = "interval";
	json_object_set_member(pJsonObject, intervalKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJmxdomain();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJmxdomain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jmxdomainKey = "jmxdomain";
	json_object_set_member(pJsonObject, jmxdomainKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptfilename()
{
	return scriptfilename;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptfilename(ConfigNodePropertyString  scriptfilename)
{
	this->scriptfilename = scriptfilename;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptdisplay()
{
	return scriptdisplay;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptdisplay(ConfigNodePropertyString  scriptdisplay)
{
	this->scriptdisplay = scriptdisplay;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptpath()
{
	return scriptpath;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptpath(ConfigNodePropertyString  scriptpath)
{
	this->scriptpath = scriptpath;
}

ConfigNodePropertyArray
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getScriptplatform()
{
	return scriptplatform;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setScriptplatform(ConfigNodePropertyArray  scriptplatform)
{
	this->scriptplatform = scriptplatform;
}

ConfigNodePropertyInteger
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getInterval()
{
	return interval;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setInterval(ConfigNodePropertyInteger  interval)
{
	this->interval = interval;
}

ConfigNodePropertyString
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::getJmxdomain()
{
	return jmxdomain;
}

void
ComAdobeGraniteMonitoringImplScriptConfigImplProperties::setJmxdomain(ConfigNodePropertyString  jmxdomain)
{
	this->jmxdomain = jmxdomain;
}


