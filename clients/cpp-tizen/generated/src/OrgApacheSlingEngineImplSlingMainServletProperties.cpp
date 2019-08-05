#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingEngineImplSlingMainServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingEngineImplSlingMainServletProperties::OrgApacheSlingEngineImplSlingMainServletProperties()
{
	//__init();
}

OrgApacheSlingEngineImplSlingMainServletProperties::~OrgApacheSlingEngineImplSlingMainServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::__init()
{
	//slingmaxcalls = new ConfigNodePropertyInteger();
	//slingmaxinclusions = new ConfigNodePropertyInteger();
	//slingtraceallow = new ConfigNodePropertyBoolean();
	//slingmaxrecordrequests = new ConfigNodePropertyInteger();
	//slingstorepatternrequests = new ConfigNodePropertyArray();
	//slingserverinfo = new ConfigNodePropertyString();
	//slingadditionalresponseheaders = new ConfigNodePropertyArray();
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::__cleanup()
{
	//if(slingmaxcalls != NULL) {
	//
	//delete slingmaxcalls;
	//slingmaxcalls = NULL;
	//}
	//if(slingmaxinclusions != NULL) {
	//
	//delete slingmaxinclusions;
	//slingmaxinclusions = NULL;
	//}
	//if(slingtraceallow != NULL) {
	//
	//delete slingtraceallow;
	//slingtraceallow = NULL;
	//}
	//if(slingmaxrecordrequests != NULL) {
	//
	//delete slingmaxrecordrequests;
	//slingmaxrecordrequests = NULL;
	//}
	//if(slingstorepatternrequests != NULL) {
	//
	//delete slingstorepatternrequests;
	//slingstorepatternrequests = NULL;
	//}
	//if(slingserverinfo != NULL) {
	//
	//delete slingserverinfo;
	//slingserverinfo = NULL;
	//}
	//if(slingadditionalresponseheaders != NULL) {
	//
	//delete slingadditionalresponseheaders;
	//slingadditionalresponseheaders = NULL;
	//}
	//
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingmaxcallsKey = "sling.max.calls";
	node = json_object_get_member(pJsonObject, slingmaxcallsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&slingmaxcalls, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&slingmaxcalls);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingmaxinclusionsKey = "sling.max.inclusions";
	node = json_object_get_member(pJsonObject, slingmaxinclusionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&slingmaxinclusions, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&slingmaxinclusions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingtraceallowKey = "sling.trace.allow";
	node = json_object_get_member(pJsonObject, slingtraceallowKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&slingtraceallow, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&slingtraceallow);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingmaxrecordrequestsKey = "sling.max.record.requests";
	node = json_object_get_member(pJsonObject, slingmaxrecordrequestsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&slingmaxrecordrequests, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&slingmaxrecordrequests);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingstorepatternrequestsKey = "sling.store.pattern.requests";
	node = json_object_get_member(pJsonObject, slingstorepatternrequestsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingstorepatternrequests, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingstorepatternrequests);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingserverinfoKey = "sling.serverinfo";
	node = json_object_get_member(pJsonObject, slingserverinfoKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingserverinfo, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingserverinfo);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingadditionalresponseheadersKey = "sling.additional.response.headers";
	node = json_object_get_member(pJsonObject, slingadditionalresponseheadersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingadditionalresponseheaders, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingadditionalresponseheaders);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingEngineImplSlingMainServletProperties::OrgApacheSlingEngineImplSlingMainServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingEngineImplSlingMainServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSlingmaxcalls();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSlingmaxcalls());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingmaxcallsKey = "sling.max.calls";
	json_object_set_member(pJsonObject, slingmaxcallsKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSlingmaxinclusions();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSlingmaxinclusions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingmaxinclusionsKey = "sling.max.inclusions";
	json_object_set_member(pJsonObject, slingmaxinclusionsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getSlingtraceallow();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getSlingtraceallow());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingtraceallowKey = "sling.trace.allow";
	json_object_set_member(pJsonObject, slingtraceallowKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getSlingmaxrecordrequests();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getSlingmaxrecordrequests());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingmaxrecordrequestsKey = "sling.max.record.requests";
	json_object_set_member(pJsonObject, slingmaxrecordrequestsKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingstorepatternrequests();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingstorepatternrequests());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingstorepatternrequestsKey = "sling.store.pattern.requests";
	json_object_set_member(pJsonObject, slingstorepatternrequestsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingserverinfo();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingserverinfo());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingserverinfoKey = "sling.serverinfo";
	json_object_set_member(pJsonObject, slingserverinfoKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingadditionalresponseheaders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingadditionalresponseheaders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingadditionalresponseheadersKey = "sling.additional.response.headers";
	json_object_set_member(pJsonObject, slingadditionalresponseheadersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingmaxcalls()
{
	return slingmaxcalls;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingmaxcalls(ConfigNodePropertyInteger  slingmaxcalls)
{
	this->slingmaxcalls = slingmaxcalls;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingmaxinclusions()
{
	return slingmaxinclusions;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingmaxinclusions(ConfigNodePropertyInteger  slingmaxinclusions)
{
	this->slingmaxinclusions = slingmaxinclusions;
}

ConfigNodePropertyBoolean
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingtraceallow()
{
	return slingtraceallow;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingtraceallow(ConfigNodePropertyBoolean  slingtraceallow)
{
	this->slingtraceallow = slingtraceallow;
}

ConfigNodePropertyInteger
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingmaxrecordrequests()
{
	return slingmaxrecordrequests;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingmaxrecordrequests(ConfigNodePropertyInteger  slingmaxrecordrequests)
{
	this->slingmaxrecordrequests = slingmaxrecordrequests;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingstorepatternrequests()
{
	return slingstorepatternrequests;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingstorepatternrequests(ConfigNodePropertyArray  slingstorepatternrequests)
{
	this->slingstorepatternrequests = slingstorepatternrequests;
}

ConfigNodePropertyString
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingserverinfo()
{
	return slingserverinfo;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingserverinfo(ConfigNodePropertyString  slingserverinfo)
{
	this->slingserverinfo = slingserverinfo;
}

ConfigNodePropertyArray
OrgApacheSlingEngineImplSlingMainServletProperties::getSlingadditionalresponseheaders()
{
	return slingadditionalresponseheaders;
}

void
OrgApacheSlingEngineImplSlingMainServletProperties::setSlingadditionalresponseheaders(ConfigNodePropertyArray  slingadditionalresponseheaders)
{
	this->slingadditionalresponseheaders = slingadditionalresponseheaders;
}


