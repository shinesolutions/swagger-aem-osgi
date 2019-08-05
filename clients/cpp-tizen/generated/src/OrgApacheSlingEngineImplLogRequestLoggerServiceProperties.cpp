#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEngineImplLogRequestLoggerServiceProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::OrgApacheSlingEngineImplLogRequestLoggerServiceProperties()
{
	//__init();
}

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::~OrgApacheSlingEngineImplLogRequestLoggerServiceProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::__init()
{
	//requestlogserviceformat = new ConfigNodePropertyString();
	//requestlogserviceoutput = new ConfigNodePropertyString();
	//requestlogserviceoutputtype = new ConfigNodePropertyDropDown();
	//requestlogserviceonentry = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::__cleanup()
{
	//if(requestlogserviceformat != NULL) {
	//
	//delete requestlogserviceformat;
	//requestlogserviceformat = NULL;
	//}
	//if(requestlogserviceoutput != NULL) {
	//
	//delete requestlogserviceoutput;
	//requestlogserviceoutput = NULL;
	//}
	//if(requestlogserviceoutputtype != NULL) {
	//
	//delete requestlogserviceoutputtype;
	//requestlogserviceoutputtype = NULL;
	//}
	//if(requestlogserviceonentry != NULL) {
	//
	//delete requestlogserviceonentry;
	//requestlogserviceonentry = NULL;
	//}
	//
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *requestlogserviceformatKey = "request.log.service.format";
	node = json_object_get_member(pJsonObject, requestlogserviceformatKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&requestlogserviceformat, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&requestlogserviceformat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestlogserviceoutputKey = "request.log.service.output";
	node = json_object_get_member(pJsonObject, requestlogserviceoutputKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&requestlogserviceoutput, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&requestlogserviceoutput);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestlogserviceoutputtypeKey = "request.log.service.outputtype";
	node = json_object_get_member(pJsonObject, requestlogserviceoutputtypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&requestlogserviceoutputtype, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&requestlogserviceoutputtype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *requestlogserviceonentryKey = "request.log.service.onentry";
	node = json_object_get_member(pJsonObject, requestlogserviceonentryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&requestlogserviceonentry, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&requestlogserviceonentry);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::OrgApacheSlingEngineImplLogRequestLoggerServiceProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRequestlogserviceformat();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRequestlogserviceformat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogserviceformatKey = "request.log.service.format";
	json_object_set_member(pJsonObject, requestlogserviceformatKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRequestlogserviceoutput();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRequestlogserviceoutput());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogserviceoutputKey = "request.log.service.output";
	json_object_set_member(pJsonObject, requestlogserviceoutputKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getRequestlogserviceoutputtype();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getRequestlogserviceoutputtype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogserviceoutputtypeKey = "request.log.service.outputtype";
	json_object_set_member(pJsonObject, requestlogserviceoutputtypeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getRequestlogserviceonentry();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getRequestlogserviceonentry());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *requestlogserviceonentryKey = "request.log.service.onentry";
	json_object_set_member(pJsonObject, requestlogserviceonentryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceformat()
{
	return requestlogserviceformat;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceformat(ConfigNodePropertyString  requestlogserviceformat)
{
	this->requestlogserviceformat = requestlogserviceformat;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceoutput()
{
	return requestlogserviceoutput;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceoutput(ConfigNodePropertyString  requestlogserviceoutput)
{
	this->requestlogserviceoutput = requestlogserviceoutput;
}

ConfigNodePropertyDropDown
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceoutputtype()
{
	return requestlogserviceoutputtype;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceoutputtype(ConfigNodePropertyDropDown  requestlogserviceoutputtype)
{
	this->requestlogserviceoutputtype = requestlogserviceoutputtype;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::getRequestlogserviceonentry()
{
	return requestlogserviceonentry;
}

void
OrgApacheSlingEngineImplLogRequestLoggerServiceProperties::setRequestlogserviceonentry(ConfigNodePropertyBoolean  requestlogserviceonentry)
{
	this->requestlogserviceonentry = requestlogserviceonentry;
}


