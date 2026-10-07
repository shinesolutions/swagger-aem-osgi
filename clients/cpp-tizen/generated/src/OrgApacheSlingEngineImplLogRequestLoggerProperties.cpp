#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEngineImplLogRequestLoggerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEngineImplLogRequestLoggerProperties::OrgApacheSlingEngineImplLogRequestLoggerProperties()
{
	//__init();
}

OrgApacheSlingEngineImplLogRequestLoggerProperties::~OrgApacheSlingEngineImplLogRequestLoggerProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::__init()
{
	//requestlogoutput = new ConfigNodePropertyString();
	//requestlogoutputtype = new ConfigNodePropertyDropDown();
	//requestlogenabled = new ConfigNodePropertyBoolean();
	//accesslogoutput = new ConfigNodePropertyString();
	//accesslogoutputtype = new ConfigNodePropertyDropDown();
	//accesslogenabled = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::__cleanup()
{
	//if(requestlogoutput != NULL) {
	//
	//delete requestlogoutput;
	//requestlogoutput = NULL;
	//}
	//if(requestlogoutputtype != NULL) {
	//
	//delete requestlogoutputtype;
	//requestlogoutputtype = NULL;
	//}
	//if(requestlogenabled != NULL) {
	//
	//delete requestlogenabled;
	//requestlogenabled = NULL;
	//}
	//if(accesslogoutput != NULL) {
	//
	//delete accesslogoutput;
	//accesslogoutput = NULL;
	//}
	//if(accesslogoutputtype != NULL) {
	//
	//delete accesslogoutputtype;
	//accesslogoutputtype = NULL;
	//}
	//if(accesslogenabled != NULL) {
	//
	//delete accesslogenabled;
	//accesslogenabled = NULL;
	//}
	//
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *requestlogoutputKey = "request.log.output";
	node = json_object_get_member(pJsonObject, requestlogoutputKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&requestlogoutput, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&requestlogoutput);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestlogoutputtypeKey = "request.log.outputtype";
	node = json_object_get_member(pJsonObject, requestlogoutputtypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&requestlogoutputtype, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&requestlogoutputtype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestlogenabledKey = "request.log.enabled";
	node = json_object_get_member(pJsonObject, requestlogenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&requestlogenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&requestlogenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *accesslogoutputKey = "access.log.output";
	node = json_object_get_member(pJsonObject, accesslogoutputKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&accesslogoutput, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&accesslogoutput);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *accesslogoutputtypeKey = "access.log.outputtype";
	node = json_object_get_member(pJsonObject, accesslogoutputtypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&accesslogoutputtype, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&accesslogoutputtype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *accesslogenabledKey = "access.log.enabled";
	node = json_object_get_member(pJsonObject, accesslogenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&accesslogenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&accesslogenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEngineImplLogRequestLoggerProperties::OrgApacheSlingEngineImplLogRequestLoggerProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEngineImplLogRequestLoggerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRequestlogoutput();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRequestlogoutput());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogoutputKey = "request.log.output";
	json_object_set_member(pJsonObject, requestlogoutputKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getRequestlogoutputtype();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getRequestlogoutputtype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogoutputtypeKey = "request.log.outputtype";
	json_object_set_member(pJsonObject, requestlogoutputtypeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRequestlogenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRequestlogenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogenabledKey = "request.log.enabled";
	json_object_set_member(pJsonObject, requestlogenabledKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAccesslogoutput();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAccesslogoutput());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accesslogoutputKey = "access.log.output";
	json_object_set_member(pJsonObject, accesslogoutputKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getAccesslogoutputtype();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getAccesslogoutputtype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accesslogoutputtypeKey = "access.log.outputtype";
	json_object_set_member(pJsonObject, accesslogoutputtypeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAccesslogenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAccesslogenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *accesslogenabledKey = "access.log.enabled";
	json_object_set_member(pJsonObject, accesslogenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerProperties::getRequestlogoutput()
{
	return requestlogoutput;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setRequestlogoutput(ConfigNodePropertyString  requestlogoutput)
{
	this->requestlogoutput = requestlogoutput;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplLogRequestLoggerProperties::getRequestlogoutputtype()
{
	return requestlogoutputtype;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setRequestlogoutputtype(ConfigNodePropertyDropDown  requestlogoutputtype)
{
	this->requestlogoutputtype = requestlogoutputtype;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplLogRequestLoggerProperties::getRequestlogenabled()
{
	return requestlogenabled;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setRequestlogenabled(ConfigNodePropertyBoolean  requestlogenabled)
{
	this->requestlogenabled = requestlogenabled;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerProperties::getAccesslogoutput()
{
	return accesslogoutput;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setAccesslogoutput(ConfigNodePropertyString  accesslogoutput)
{
	this->accesslogoutput = accesslogoutput;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplLogRequestLoggerProperties::getAccesslogoutputtype()
{
	return accesslogoutputtype;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setAccesslogoutputtype(ConfigNodePropertyDropDown  accesslogoutputtype)
{
	this->accesslogoutputtype = accesslogoutputtype;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplLogRequestLoggerProperties::getAccesslogenabled()
{
	return accesslogenabled;
}

void
OrgApacheSlingEngineImplLogRequestLoggerProperties::setAccesslogenabled(ConfigNodePropertyBoolean  accesslogenabled)
{
	this->accesslogenabled = accesslogenabled;
}


