#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties()
{
	//__init();
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::~ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties()
{
	//__cleanup();
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::__init()
{
	//rootpath = new ConfigNodePropertyString();
	//fixinconsistencies = new ConfigNodePropertyBoolean();
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::__cleanup()
{
	//if(rootpath != NULL) {
	//
	//delete rootpath;
	//rootpath = NULL;
	//}
	//if(fixinconsistencies != NULL) {
	//
	//delete fixinconsistencies;
	//fixinconsistencies = NULL;
	//}
	//
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rootpathKey = "root.path";
	node = json_object_get_member(pJsonObject, rootpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&rootpath, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&rootpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *fixinconsistenciesKey = "fix.inconsistencies";
	node = json_object_get_member(pJsonObject, fixinconsistenciesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&fixinconsistencies, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&fixinconsistencies);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getRootpath();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getRootpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *rootpathKey = "root.path";
	json_object_set_member(pJsonObject, rootpathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getFixinconsistencies();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getFixinconsistencies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fixinconsistenciesKey = "fix.inconsistencies";
	json_object_set_member(pJsonObject, fixinconsistenciesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::getRootpath()
{
	return rootpath;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::setRootpath(ConfigNodePropertyString  rootpath)
{
	this->rootpath = rootpath;
}

ConfigNodePropertyBoolean
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::getFixinconsistencies()
{
	return fixinconsistencies;
}

void
ComAdobeAemUpgradePrechecksTasksImplConsistencyCheckTaskImplProperties::setFixinconsistencies(ConfigNodePropertyBoolean  fixinconsistencies)
{
	this->fixinconsistencies = fixinconsistencies;
}


