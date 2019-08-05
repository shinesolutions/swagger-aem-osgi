#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteLoggingImplLogAnalyserImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteLoggingImplLogAnalyserImplProperties::ComAdobeGraniteLoggingImplLogAnalyserImplProperties()
{
	//__init();
}

ComAdobeGraniteLoggingImplLogAnalyserImplProperties::~ComAdobeGraniteLoggingImplLogAnalyserImplProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::__init()
{
	//messagesqueuesize = new ConfigNodePropertyInteger();
	//loggerconfig = new ConfigNodePropertyArray();
	//messagessize = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::__cleanup()
{
	//if(messagesqueuesize != NULL) {
	//
	//delete messagesqueuesize;
	//messagesqueuesize = NULL;
	//}
	//if(loggerconfig != NULL) {
	//
	//delete loggerconfig;
	//loggerconfig = NULL;
	//}
	//if(messagessize != NULL) {
	//
	//delete messagessize;
	//messagessize = NULL;
	//}
	//
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *messagesqueuesizeKey = "messages.queue.size";
	node = json_object_get_member(pJsonObject, messagesqueuesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&messagesqueuesize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&messagesqueuesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *loggerconfigKey = "logger.config";
	node = json_object_get_member(pJsonObject, loggerconfigKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&loggerconfig, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&loggerconfig);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *messagessizeKey = "messages.size";
	node = json_object_get_member(pJsonObject, messagessizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&messagessize, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&messagessize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteLoggingImplLogAnalyserImplProperties::ComAdobeGraniteLoggingImplLogAnalyserImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMessagesqueuesize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMessagesqueuesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messagesqueuesizeKey = "messages.queue.size";
	json_object_set_member(pJsonObject, messagesqueuesizeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getLoggerconfig();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getLoggerconfig());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *loggerconfigKey = "logger.config";
	json_object_set_member(pJsonObject, loggerconfigKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMessagessize();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMessagessize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *messagessizeKey = "messages.size";
	json_object_set_member(pJsonObject, messagessizeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::getMessagesqueuesize()
{
	return messagesqueuesize;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::setMessagesqueuesize(ConfigNodePropertyInteger  messagesqueuesize)
{
	this->messagesqueuesize = messagesqueuesize;
}

ConfigNodePropertyArray
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::getLoggerconfig()
{
	return loggerconfig;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::setLoggerconfig(ConfigNodePropertyArray  loggerconfig)
{
	this->loggerconfig = loggerconfig;
}

ConfigNodePropertyInteger
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::getMessagessize()
{
	return messagessize;
}

void
ComAdobeGraniteLoggingImplLogAnalyserImplProperties::setMessagessize(ConfigNodePropertyInteger  messagessize)
{
	this->messagessize = messagessize;
}


