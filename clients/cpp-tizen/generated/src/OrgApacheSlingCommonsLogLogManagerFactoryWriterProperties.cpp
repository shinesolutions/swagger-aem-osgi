#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties()
{
	//__init();
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::~OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::__init()
{
	//orgapacheslingcommonslogfile = new ConfigNodePropertyString();
	//orgapacheslingcommonslogfilenumber = new ConfigNodePropertyInteger();
	//orgapacheslingcommonslogfilesize = new ConfigNodePropertyString();
	//orgapacheslingcommonslogfilebuffered = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::__cleanup()
{
	//if(orgapacheslingcommonslogfile != NULL) {
	//
	//delete orgapacheslingcommonslogfile;
	//orgapacheslingcommonslogfile = NULL;
	//}
	//if(orgapacheslingcommonslogfilenumber != NULL) {
	//
	//delete orgapacheslingcommonslogfilenumber;
	//orgapacheslingcommonslogfilenumber = NULL;
	//}
	//if(orgapacheslingcommonslogfilesize != NULL) {
	//
	//delete orgapacheslingcommonslogfilesize;
	//orgapacheslingcommonslogfilesize = NULL;
	//}
	//if(orgapacheslingcommonslogfilebuffered != NULL) {
	//
	//delete orgapacheslingcommonslogfilebuffered;
	//orgapacheslingcommonslogfilebuffered = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfileKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogfile, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogfile);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogfilenumberKey = "org.apache.sling.commons.log.file.number";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfilenumberKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&orgapacheslingcommonslogfilenumber, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&orgapacheslingcommonslogfilenumber);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogfilesizeKey = "org.apache.sling.commons.log.file.size";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfilesizeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogfilesize, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogfilesize);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogfilebufferedKey = "org.apache.sling.commons.log.file.buffered";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogfilebufferedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapacheslingcommonslogfilebuffered, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapacheslingcommonslogfilebuffered);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogfile();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogfile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfileKey = "org.apache.sling.commons.log.file";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfileKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOrgapacheslingcommonslogfilenumber();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOrgapacheslingcommonslogfilenumber());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfilenumberKey = "org.apache.sling.commons.log.file.number";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfilenumberKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogfilesize();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogfilesize());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfilesizeKey = "org.apache.sling.commons.log.file.size";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfilesizeKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapacheslingcommonslogfilebuffered();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapacheslingcommonslogfilebuffered());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogfilebufferedKey = "org.apache.sling.commons.log.file.buffered";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogfilebufferedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfile()
{
	return orgapacheslingcommonslogfile;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfile(ConfigNodePropertyString  orgapacheslingcommonslogfile)
{
	this->orgapacheslingcommonslogfile = orgapacheslingcommonslogfile;
}

ConfigNodePropertyInteger
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfilenumber()
{
	return orgapacheslingcommonslogfilenumber;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfilenumber(ConfigNodePropertyInteger  orgapacheslingcommonslogfilenumber)
{
	this->orgapacheslingcommonslogfilenumber = orgapacheslingcommonslogfilenumber;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfilesize()
{
	return orgapacheslingcommonslogfilesize;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfilesize(ConfigNodePropertyString  orgapacheslingcommonslogfilesize)
{
	this->orgapacheslingcommonslogfilesize = orgapacheslingcommonslogfilesize;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::getOrgapacheslingcommonslogfilebuffered()
{
	return orgapacheslingcommonslogfilebuffered;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties::setOrgapacheslingcommonslogfilebuffered(ConfigNodePropertyBoolean  orgapacheslingcommonslogfilebuffered)
{
	this->orgapacheslingcommonslogfilebuffered = orgapacheslingcommonslogfilebuffered;
}


