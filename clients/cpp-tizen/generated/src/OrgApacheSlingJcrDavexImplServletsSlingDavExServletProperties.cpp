#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties()
{
	//__init();
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::~OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::__init()
{
	//alias = new ConfigNodePropertyString();
	//davcreateabsoluteuri = new ConfigNodePropertyBoolean();
	//davprotectedhandlers = new ConfigNodePropertyString();
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::__cleanup()
{
	//if(alias != NULL) {
	//
	//delete alias;
	//alias = NULL;
	//}
	//if(davcreateabsoluteuri != NULL) {
	//
	//delete davcreateabsoluteuri;
	//davcreateabsoluteuri = NULL;
	//}
	//if(davprotectedhandlers != NULL) {
	//
	//delete davprotectedhandlers;
	//davprotectedhandlers = NULL;
	//}
	//
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *aliasKey = "alias";
	node = json_object_get_member(pJsonObject, aliasKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&alias, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&alias);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *davcreateabsoluteuriKey = "dav.create-absolute-uri";
	node = json_object_get_member(pJsonObject, davcreateabsoluteuriKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&davcreateabsoluteuri, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&davcreateabsoluteuri);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *davprotectedhandlersKey = "dav.protectedhandlers";
	node = json_object_get_member(pJsonObject, davprotectedhandlersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&davprotectedhandlers, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&davprotectedhandlers);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAlias();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAlias());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *aliasKey = "alias";
	json_object_set_member(pJsonObject, aliasKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getDavcreateabsoluteuri();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getDavcreateabsoluteuri());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *davcreateabsoluteuriKey = "dav.create-absolute-uri";
	json_object_set_member(pJsonObject, davcreateabsoluteuriKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDavprotectedhandlers();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDavprotectedhandlers());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *davprotectedhandlersKey = "dav.protectedhandlers";
	json_object_set_member(pJsonObject, davprotectedhandlersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::getAlias()
{
	return alias;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::setAlias(ConfigNodePropertyString  alias)
{
	this->alias = alias;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::getDavcreateabsoluteuri()
{
	return davcreateabsoluteuri;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::setDavcreateabsoluteuri(ConfigNodePropertyBoolean  davcreateabsoluteuri)
{
	this->davcreateabsoluteuri = davcreateabsoluteuri;
}

ConfigNodePropertyString
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::getDavprotectedhandlers()
{
	return davprotectedhandlers;
}

void
OrgApacheSlingJcrDavexImplServletsSlingDavExServletProperties::setDavprotectedhandlers(ConfigNodePropertyString  davprotectedhandlers)
{
	this->davprotectedhandlers = davprotectedhandlers;
}


