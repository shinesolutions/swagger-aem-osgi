#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqCommonsImplExternalizerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqCommonsImplExternalizerImplProperties::ComDayCqCommonsImplExternalizerImplProperties()
{
	//__init();
}

ComDayCqCommonsImplExternalizerImplProperties::~ComDayCqCommonsImplExternalizerImplProperties()
{
	//__cleanup();
}

void
ComDayCqCommonsImplExternalizerImplProperties::__init()
{
	//externalizerdomains = new ConfigNodePropertyArray();
	//externalizerhost = new ConfigNodePropertyString();
	//externalizercontextpath = new ConfigNodePropertyString();
	//externalizerencodedpath = new ConfigNodePropertyBoolean();
}

void
ComDayCqCommonsImplExternalizerImplProperties::__cleanup()
{
	//if(externalizerdomains != NULL) {
	//
	//delete externalizerdomains;
	//externalizerdomains = NULL;
	//}
	//if(externalizerhost != NULL) {
	//
	//delete externalizerhost;
	//externalizerhost = NULL;
	//}
	//if(externalizercontextpath != NULL) {
	//
	//delete externalizercontextpath;
	//externalizercontextpath = NULL;
	//}
	//if(externalizerencodedpath != NULL) {
	//
	//delete externalizerencodedpath;
	//externalizerencodedpath = NULL;
	//}
	//
}

void
ComDayCqCommonsImplExternalizerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *externalizerdomainsKey = "externalizer.domains";
	node = json_object_get_member(pJsonObject, externalizerdomainsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&externalizerdomains, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&externalizerdomains);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *externalizerhostKey = "externalizer.host";
	node = json_object_get_member(pJsonObject, externalizerhostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&externalizerhost, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&externalizerhost);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *externalizercontextpathKey = "externalizer.contextpath";
	node = json_object_get_member(pJsonObject, externalizercontextpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&externalizercontextpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&externalizercontextpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *externalizerencodedpathKey = "externalizer.encodedpath";
	node = json_object_get_member(pJsonObject, externalizerencodedpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&externalizerencodedpath, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&externalizerencodedpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqCommonsImplExternalizerImplProperties::ComDayCqCommonsImplExternalizerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqCommonsImplExternalizerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExternalizerdomains();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExternalizerdomains());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *externalizerdomainsKey = "externalizer.domains";
	json_object_set_member(pJsonObject, externalizerdomainsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getExternalizerhost();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getExternalizerhost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *externalizerhostKey = "externalizer.host";
	json_object_set_member(pJsonObject, externalizerhostKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getExternalizercontextpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getExternalizercontextpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *externalizercontextpathKey = "externalizer.contextpath";
	json_object_set_member(pJsonObject, externalizercontextpathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getExternalizerencodedpath();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getExternalizerencodedpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *externalizerencodedpathKey = "externalizer.encodedpath";
	json_object_set_member(pJsonObject, externalizerencodedpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqCommonsImplExternalizerImplProperties::getExternalizerdomains()
{
	return externalizerdomains;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizerdomains(ConfigNodePropertyArray  externalizerdomains)
{
	this->externalizerdomains = externalizerdomains;
}

ConfigNodePropertyString
ComDayCqCommonsImplExternalizerImplProperties::getExternalizerhost()
{
	return externalizerhost;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizerhost(ConfigNodePropertyString  externalizerhost)
{
	this->externalizerhost = externalizerhost;
}

ConfigNodePropertyString
ComDayCqCommonsImplExternalizerImplProperties::getExternalizercontextpath()
{
	return externalizercontextpath;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizercontextpath(ConfigNodePropertyString  externalizercontextpath)
{
	this->externalizercontextpath = externalizercontextpath;
}

ConfigNodePropertyBoolean
ComDayCqCommonsImplExternalizerImplProperties::getExternalizerencodedpath()
{
	return externalizerencodedpath;
}

void
ComDayCqCommonsImplExternalizerImplProperties::setExternalizerencodedpath(ConfigNodePropertyBoolean  externalizerencodedpath)
{
	this->externalizerencodedpath = externalizerencodedpath;
}


