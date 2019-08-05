#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqAuditPurgePagesProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqAuditPurgePagesProperties::ComAdobeCqAuditPurgePagesProperties()
{
	//__init();
}

ComAdobeCqAuditPurgePagesProperties::~ComAdobeCqAuditPurgePagesProperties()
{
	//__cleanup();
}

void
ComAdobeCqAuditPurgePagesProperties::__init()
{
	//auditlogrulename = new ConfigNodePropertyString();
	//auditlogrulecontentpath = new ConfigNodePropertyString();
	//auditlogruleminimumage = new ConfigNodePropertyInteger();
	//auditlogruletypes = new ConfigNodePropertyDropDown();
}

void
ComAdobeCqAuditPurgePagesProperties::__cleanup()
{
	//if(auditlogrulename != NULL) {
	//
	//delete auditlogrulename;
	//auditlogrulename = NULL;
	//}
	//if(auditlogrulecontentpath != NULL) {
	//
	//delete auditlogrulecontentpath;
	//auditlogrulecontentpath = NULL;
	//}
	//if(auditlogruleminimumage != NULL) {
	//
	//delete auditlogruleminimumage;
	//auditlogruleminimumage = NULL;
	//}
	//if(auditlogruletypes != NULL) {
	//
	//delete auditlogruletypes;
	//auditlogruletypes = NULL;
	//}
	//
}

void
ComAdobeCqAuditPurgePagesProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *auditlogrulenameKey = "auditlog.rule.name";
	node = json_object_get_member(pJsonObject, auditlogrulenameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&auditlogrulename, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&auditlogrulename);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *auditlogrulecontentpathKey = "auditlog.rule.contentpath";
	node = json_object_get_member(pJsonObject, auditlogrulecontentpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&auditlogrulecontentpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&auditlogrulecontentpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *auditlogruleminimumageKey = "auditlog.rule.minimumage";
	node = json_object_get_member(pJsonObject, auditlogruleminimumageKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&auditlogruleminimumage, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&auditlogruleminimumage);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *auditlogruletypesKey = "auditlog.rule.types";
	node = json_object_get_member(pJsonObject, auditlogruletypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&auditlogruletypes, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&auditlogruletypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqAuditPurgePagesProperties::ComAdobeCqAuditPurgePagesProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqAuditPurgePagesProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuditlogrulename();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuditlogrulename());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auditlogrulenameKey = "auditlog.rule.name";
	json_object_set_member(pJsonObject, auditlogrulenameKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuditlogrulecontentpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuditlogrulecontentpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auditlogrulecontentpathKey = "auditlog.rule.contentpath";
	json_object_set_member(pJsonObject, auditlogrulecontentpathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAuditlogruleminimumage();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAuditlogruleminimumage());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auditlogruleminimumageKey = "auditlog.rule.minimumage";
	json_object_set_member(pJsonObject, auditlogruleminimumageKey, node);
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getAuditlogruletypes();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getAuditlogruletypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auditlogruletypesKey = "auditlog.rule.types";
	json_object_set_member(pJsonObject, auditlogruletypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqAuditPurgePagesProperties::getAuditlogrulename()
{
	return auditlogrulename;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogrulename(ConfigNodePropertyString  auditlogrulename)
{
	this->auditlogrulename = auditlogrulename;
}

ConfigNodePropertyString
ComAdobeCqAuditPurgePagesProperties::getAuditlogrulecontentpath()
{
	return auditlogrulecontentpath;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogrulecontentpath(ConfigNodePropertyString  auditlogrulecontentpath)
{
	this->auditlogrulecontentpath = auditlogrulecontentpath;
}

ConfigNodePropertyInteger
ComAdobeCqAuditPurgePagesProperties::getAuditlogruleminimumage()
{
	return auditlogruleminimumage;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogruleminimumage(ConfigNodePropertyInteger  auditlogruleminimumage)
{
	this->auditlogruleminimumage = auditlogruleminimumage;
}

ConfigNodePropertyDropDown
ComAdobeCqAuditPurgePagesProperties::getAuditlogruletypes()
{
	return auditlogruletypes;
}

void
ComAdobeCqAuditPurgePagesProperties::setAuditlogruletypes(ConfigNodePropertyDropDown  auditlogruletypes)
{
	this->auditlogruletypes = auditlogruletypes;
}


