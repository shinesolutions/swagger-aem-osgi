#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmMsmImplServletsAuditLogServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmMsmImplServletsAuditLogServletProperties::ComDayCqWcmMsmImplServletsAuditLogServletProperties()
{
	//__init();
}

ComDayCqWcmMsmImplServletsAuditLogServletProperties::~ComDayCqWcmMsmImplServletsAuditLogServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::__init()
{
	//auditlogservletdefaulteventscount = new ConfigNodePropertyInteger();
	//auditlogservletdefaultpath = new ConfigNodePropertyString();
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::__cleanup()
{
	//if(auditlogservletdefaulteventscount != NULL) {
	//
	//delete auditlogservletdefaulteventscount;
	//auditlogservletdefaulteventscount = NULL;
	//}
	//if(auditlogservletdefaultpath != NULL) {
	//
	//delete auditlogservletdefaultpath;
	//auditlogservletdefaultpath = NULL;
	//}
	//
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *auditlogservletdefaulteventscountKey = "auditlogservlet.default.events.count";
	node = json_object_get_member(pJsonObject, auditlogservletdefaulteventscountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&auditlogservletdefaulteventscount, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&auditlogservletdefaulteventscount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *auditlogservletdefaultpathKey = "auditlogservlet.default.path";
	node = json_object_get_member(pJsonObject, auditlogservletdefaultpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&auditlogservletdefaultpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&auditlogservletdefaultpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmMsmImplServletsAuditLogServletProperties::ComDayCqWcmMsmImplServletsAuditLogServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmMsmImplServletsAuditLogServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getAuditlogservletdefaulteventscount();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getAuditlogservletdefaulteventscount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auditlogservletdefaulteventscountKey = "auditlogservlet.default.events.count";
	json_object_set_member(pJsonObject, auditlogservletdefaulteventscountKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getAuditlogservletdefaultpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getAuditlogservletdefaultpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *auditlogservletdefaultpathKey = "auditlogservlet.default.path";
	json_object_set_member(pJsonObject, auditlogservletdefaultpathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqWcmMsmImplServletsAuditLogServletProperties::getAuditlogservletdefaulteventscount()
{
	return auditlogservletdefaulteventscount;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::setAuditlogservletdefaulteventscount(ConfigNodePropertyInteger  auditlogservletdefaulteventscount)
{
	this->auditlogservletdefaulteventscount = auditlogservletdefaulteventscount;
}

ConfigNodePropertyString
ComDayCqWcmMsmImplServletsAuditLogServletProperties::getAuditlogservletdefaultpath()
{
	return auditlogservletdefaultpath;
}

void
ComDayCqWcmMsmImplServletsAuditLogServletProperties::setAuditlogservletdefaultpath(ConfigNodePropertyString  auditlogservletdefaultpath)
{
	this->auditlogservletdefaultpath = auditlogservletdefaultpath;
}


