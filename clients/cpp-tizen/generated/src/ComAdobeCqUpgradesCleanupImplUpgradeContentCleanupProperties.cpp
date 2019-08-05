#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties()
{
	//__init();
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::~ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties()
{
	//__cleanup();
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::__init()
{
	//deletepathregexps = new ConfigNodePropertyArray();
	//deletesql2query = new ConfigNodePropertyString();
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::__cleanup()
{
	//if(deletepathregexps != NULL) {
	//
	//delete deletepathregexps;
	//deletepathregexps = NULL;
	//}
	//if(deletesql2query != NULL) {
	//
	//delete deletesql2query;
	//deletesql2query = NULL;
	//}
	//
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deletepathregexpsKey = "delete.path.regexps";
	node = json_object_get_member(pJsonObject, deletepathregexpsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&deletepathregexps, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&deletepathregexps);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *deletesql2queryKey = "delete.sql2.query";
	node = json_object_get_member(pJsonObject, deletesql2queryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&deletesql2query, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&deletesql2query);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getDeletepathregexps();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getDeletepathregexps());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deletepathregexpsKey = "delete.path.regexps";
	json_object_set_member(pJsonObject, deletepathregexpsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getDeletesql2query();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getDeletesql2query());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *deletesql2queryKey = "delete.sql2.query";
	json_object_set_member(pJsonObject, deletesql2queryKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::getDeletepathregexps()
{
	return deletepathregexps;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::setDeletepathregexps(ConfigNodePropertyArray  deletepathregexps)
{
	this->deletepathregexps = deletepathregexps;
}

ConfigNodePropertyString
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::getDeletesql2query()
{
	return deletesql2query;
}

void
ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties::setDeletesql2query(ConfigNodePropertyString  deletesql2query)
{
	this->deletesql2query = deletesql2query;
}


