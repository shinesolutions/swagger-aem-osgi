#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingHapiImplHApiUtilImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingHapiImplHApiUtilImplProperties::OrgApacheSlingHapiImplHApiUtilImplProperties()
{
	//__init();
}

OrgApacheSlingHapiImplHApiUtilImplProperties::~OrgApacheSlingHapiImplHApiUtilImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::__init()
{
	//orgapacheslinghapitoolsresourcetype = new ConfigNodePropertyString();
	//orgapacheslinghapitoolscollectionresourcetype = new ConfigNodePropertyString();
	//orgapacheslinghapitoolssearchpaths = new ConfigNodePropertyArray();
	//orgapacheslinghapitoolsexternalurl = new ConfigNodePropertyString();
	//orgapacheslinghapitoolsenabled = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::__cleanup()
{
	//if(orgapacheslinghapitoolsresourcetype != NULL) {
	//
	//delete orgapacheslinghapitoolsresourcetype;
	//orgapacheslinghapitoolsresourcetype = NULL;
	//}
	//if(orgapacheslinghapitoolscollectionresourcetype != NULL) {
	//
	//delete orgapacheslinghapitoolscollectionresourcetype;
	//orgapacheslinghapitoolscollectionresourcetype = NULL;
	//}
	//if(orgapacheslinghapitoolssearchpaths != NULL) {
	//
	//delete orgapacheslinghapitoolssearchpaths;
	//orgapacheslinghapitoolssearchpaths = NULL;
	//}
	//if(orgapacheslinghapitoolsexternalurl != NULL) {
	//
	//delete orgapacheslinghapitoolsexternalurl;
	//orgapacheslinghapitoolsexternalurl = NULL;
	//}
	//if(orgapacheslinghapitoolsenabled != NULL) {
	//
	//delete orgapacheslinghapitoolsenabled;
	//orgapacheslinghapitoolsenabled = NULL;
	//}
	//
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslinghapitoolsresourcetypeKey = "org.apache.sling.hapi.tools.resourcetype";
	node = json_object_get_member(pJsonObject, orgapacheslinghapitoolsresourcetypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslinghapitoolsresourcetype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslinghapitoolsresourcetype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslinghapitoolscollectionresourcetypeKey = "org.apache.sling.hapi.tools.collectionresourcetype";
	node = json_object_get_member(pJsonObject, orgapacheslinghapitoolscollectionresourcetypeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslinghapitoolscollectionresourcetype, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslinghapitoolscollectionresourcetype);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslinghapitoolssearchpathsKey = "org.apache.sling.hapi.tools.searchpaths";
	node = json_object_get_member(pJsonObject, orgapacheslinghapitoolssearchpathsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&orgapacheslinghapitoolssearchpaths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&orgapacheslinghapitoolssearchpaths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslinghapitoolsexternalurlKey = "org.apache.sling.hapi.tools.externalurl";
	node = json_object_get_member(pJsonObject, orgapacheslinghapitoolsexternalurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslinghapitoolsexternalurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslinghapitoolsexternalurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslinghapitoolsenabledKey = "org.apache.sling.hapi.tools.enabled";
	node = json_object_get_member(pJsonObject, orgapacheslinghapitoolsenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapacheslinghapitoolsenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapacheslinghapitoolsenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingHapiImplHApiUtilImplProperties::OrgApacheSlingHapiImplHApiUtilImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingHapiImplHApiUtilImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslinghapitoolsresourcetype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslinghapitoolsresourcetype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinghapitoolsresourcetypeKey = "org.apache.sling.hapi.tools.resourcetype";
	json_object_set_member(pJsonObject, orgapacheslinghapitoolsresourcetypeKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslinghapitoolscollectionresourcetype();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslinghapitoolscollectionresourcetype());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinghapitoolscollectionresourcetypeKey = "org.apache.sling.hapi.tools.collectionresourcetype";
	json_object_set_member(pJsonObject, orgapacheslinghapitoolscollectionresourcetypeKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOrgapacheslinghapitoolssearchpaths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOrgapacheslinghapitoolssearchpaths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinghapitoolssearchpathsKey = "org.apache.sling.hapi.tools.searchpaths";
	json_object_set_member(pJsonObject, orgapacheslinghapitoolssearchpathsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslinghapitoolsexternalurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslinghapitoolsexternalurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinghapitoolsexternalurlKey = "org.apache.sling.hapi.tools.externalurl";
	json_object_set_member(pJsonObject, orgapacheslinghapitoolsexternalurlKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapacheslinghapitoolsenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapacheslinghapitoolsenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslinghapitoolsenabledKey = "org.apache.sling.hapi.tools.enabled";
	json_object_set_member(pJsonObject, orgapacheslinghapitoolsenabledKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolsresourcetype()
{
	return orgapacheslinghapitoolsresourcetype;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolsresourcetype(ConfigNodePropertyString  orgapacheslinghapitoolsresourcetype)
{
	this->orgapacheslinghapitoolsresourcetype = orgapacheslinghapitoolsresourcetype;
}

ConfigNodePropertyString
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolscollectionresourcetype()
{
	return orgapacheslinghapitoolscollectionresourcetype;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolscollectionresourcetype(ConfigNodePropertyString  orgapacheslinghapitoolscollectionresourcetype)
{
	this->orgapacheslinghapitoolscollectionresourcetype = orgapacheslinghapitoolscollectionresourcetype;
}

ConfigNodePropertyArray
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolssearchpaths()
{
	return orgapacheslinghapitoolssearchpaths;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolssearchpaths(ConfigNodePropertyArray  orgapacheslinghapitoolssearchpaths)
{
	this->orgapacheslinghapitoolssearchpaths = orgapacheslinghapitoolssearchpaths;
}

ConfigNodePropertyString
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolsexternalurl()
{
	return orgapacheslinghapitoolsexternalurl;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolsexternalurl(ConfigNodePropertyString  orgapacheslinghapitoolsexternalurl)
{
	this->orgapacheslinghapitoolsexternalurl = orgapacheslinghapitoolsexternalurl;
}

ConfigNodePropertyBoolean
OrgApacheSlingHapiImplHApiUtilImplProperties::getOrgapacheslinghapitoolsenabled()
{
	return orgapacheslinghapitoolsenabled;
}

void
OrgApacheSlingHapiImplHApiUtilImplProperties::setOrgapacheslinghapitoolsenabled(ConfigNodePropertyBoolean  orgapacheslinghapitoolsenabled)
{
	this->orgapacheslinghapitoolsenabled = orgapacheslinghapitoolsenabled;
}


