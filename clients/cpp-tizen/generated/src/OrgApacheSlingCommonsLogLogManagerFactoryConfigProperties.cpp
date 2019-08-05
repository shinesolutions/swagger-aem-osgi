#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties()
{
	//__init();
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::~OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties()
{
	//__cleanup();
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::__init()
{
	//orgapacheslingcommonsloglevel = new ConfigNodePropertyDropDown();
	//orgapacheslingcommonslogfile = new ConfigNodePropertyString();
	//orgapacheslingcommonslogpattern = new ConfigNodePropertyString();
	//orgapacheslingcommonslognames = new ConfigNodePropertyArray();
	//orgapacheslingcommonslogadditiv = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::__cleanup()
{
	//if(orgapacheslingcommonsloglevel != NULL) {
	//
	//delete orgapacheslingcommonsloglevel;
	//orgapacheslingcommonsloglevel = NULL;
	//}
	//if(orgapacheslingcommonslogfile != NULL) {
	//
	//delete orgapacheslingcommonslogfile;
	//orgapacheslingcommonslogfile = NULL;
	//}
	//if(orgapacheslingcommonslogpattern != NULL) {
	//
	//delete orgapacheslingcommonslogpattern;
	//orgapacheslingcommonslogpattern = NULL;
	//}
	//if(orgapacheslingcommonslognames != NULL) {
	//
	//delete orgapacheslingcommonslognames;
	//orgapacheslingcommonslognames = NULL;
	//}
	//if(orgapacheslingcommonslogadditiv != NULL) {
	//
	//delete orgapacheslingcommonslogadditiv;
	//orgapacheslingcommonslogadditiv = NULL;
	//}
	//
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *orgapacheslingcommonsloglevelKey = "org.apache.sling.commons.log.level";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonsloglevelKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&orgapacheslingcommonsloglevel, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&orgapacheslingcommonsloglevel);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
	const gchar *orgapacheslingcommonslogpatternKey = "org.apache.sling.commons.log.pattern";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogpatternKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&orgapacheslingcommonslogpattern, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&orgapacheslingcommonslogpattern);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslognamesKey = "org.apache.sling.commons.log.names";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslognamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&orgapacheslingcommonslognames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&orgapacheslingcommonslognames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orgapacheslingcommonslogadditivKey = "org.apache.sling.commons.log.additiv";
	node = json_object_get_member(pJsonObject, orgapacheslingcommonslogadditivKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&orgapacheslingcommonslogadditiv, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&orgapacheslingcommonslogadditiv);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getOrgapacheslingcommonsloglevel();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getOrgapacheslingcommonsloglevel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonsloglevelKey = "org.apache.sling.commons.log.level";
	json_object_set_member(pJsonObject, orgapacheslingcommonsloglevelKey, node);
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
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getOrgapacheslingcommonslogpattern();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getOrgapacheslingcommonslogpattern());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogpatternKey = "org.apache.sling.commons.log.pattern";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogpatternKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getOrgapacheslingcommonslognames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getOrgapacheslingcommonslognames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslognamesKey = "org.apache.sling.commons.log.names";
	json_object_set_member(pJsonObject, orgapacheslingcommonslognamesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getOrgapacheslingcommonslogadditiv();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getOrgapacheslingcommonslogadditiv());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *orgapacheslingcommonslogadditivKey = "org.apache.sling.commons.log.additiv";
	json_object_set_member(pJsonObject, orgapacheslingcommonslogadditivKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonsloglevel()
{
	return orgapacheslingcommonsloglevel;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonsloglevel(ConfigNodePropertyDropDown  orgapacheslingcommonsloglevel)
{
	this->orgapacheslingcommonsloglevel = orgapacheslingcommonsloglevel;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslogfile()
{
	return orgapacheslingcommonslogfile;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslogfile(ConfigNodePropertyString  orgapacheslingcommonslogfile)
{
	this->orgapacheslingcommonslogfile = orgapacheslingcommonslogfile;
}

ConfigNodePropertyString
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslogpattern()
{
	return orgapacheslingcommonslogpattern;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslogpattern(ConfigNodePropertyString  orgapacheslingcommonslogpattern)
{
	this->orgapacheslingcommonslogpattern = orgapacheslingcommonslogpattern;
}

ConfigNodePropertyArray
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslognames()
{
	return orgapacheslingcommonslognames;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslognames(ConfigNodePropertyArray  orgapacheslingcommonslognames)
{
	this->orgapacheslingcommonslognames = orgapacheslingcommonslognames;
}

ConfigNodePropertyBoolean
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::getOrgapacheslingcommonslogadditiv()
{
	return orgapacheslingcommonslogadditiv;
}

void
OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties::setOrgapacheslingcommonslogadditiv(ConfigNodePropertyBoolean  orgapacheslingcommonslogadditiv)
{
	this->orgapacheslingcommonslogadditiv = orgapacheslingcommonslogadditiv;
}


