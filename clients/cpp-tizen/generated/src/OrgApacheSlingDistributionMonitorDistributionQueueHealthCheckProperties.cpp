#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
{
	//__init();
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::~OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties()
{
	//__cleanup();
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::__init()
{
	//hcname = new ConfigNodePropertyString();
	//hctags = new ConfigNodePropertyArray();
	//hcmbeanname = new ConfigNodePropertyString();
	//numberOfRetriesAllowed = new ConfigNodePropertyInteger();
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::__cleanup()
{
	//if(hcname != NULL) {
	//
	//delete hcname;
	//hcname = NULL;
	//}
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(hcmbeanname != NULL) {
	//
	//delete hcmbeanname;
	//hcmbeanname = NULL;
	//}
	//if(numberOfRetriesAllowed != NULL) {
	//
	//delete numberOfRetriesAllowed;
	//numberOfRetriesAllowed = NULL;
	//}
	//
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *hcnameKey = "hc.name";
	node = json_object_get_member(pJsonObject, hcnameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&hcname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&hcname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hctagsKey = "hc.tags";
	node = json_object_get_member(pJsonObject, hctagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&hctags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&hctags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hcmbeannameKey = "hc.mbean.name";
	node = json_object_get_member(pJsonObject, hcmbeannameKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&hcmbeanname, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&hcmbeanname);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *numberOfRetriesAllowedKey = "numberOfRetriesAllowed";
	node = json_object_get_member(pJsonObject, numberOfRetriesAllowedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&numberOfRetriesAllowed, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&numberOfRetriesAllowed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHcname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHcname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hcnameKey = "hc.name";
	json_object_set_member(pJsonObject, hcnameKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getHctags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getHctags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hctagsKey = "hc.tags";
	json_object_set_member(pJsonObject, hctagsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getHcmbeanname();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getHcmbeanname());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hcmbeannameKey = "hc.mbean.name";
	json_object_set_member(pJsonObject, hcmbeannameKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getNumberOfRetriesAllowed();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getNumberOfRetriesAllowed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *numberOfRetriesAllowedKey = "numberOfRetriesAllowed";
	json_object_set_member(pJsonObject, numberOfRetriesAllowedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcname()
{
	return hcname;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcname(ConfigNodePropertyString  hcname)
{
	this->hcname = hcname;
}

ConfigNodePropertyArray
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHctags()
{
	return hctags;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyString
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getHcmbeanname()
{
	return hcmbeanname;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setHcmbeanname(ConfigNodePropertyString  hcmbeanname)
{
	this->hcmbeanname = hcmbeanname;
}

ConfigNodePropertyInteger
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::getNumberOfRetriesAllowed()
{
	return numberOfRetriesAllowed;
}

void
OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties::setNumberOfRetriesAllowed(ConfigNodePropertyInteger  numberOfRetriesAllowed)
{
	this->numberOfRetriesAllowed = numberOfRetriesAllowed;
}


