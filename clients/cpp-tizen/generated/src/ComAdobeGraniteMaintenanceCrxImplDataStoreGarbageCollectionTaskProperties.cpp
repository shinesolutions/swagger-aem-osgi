#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties()
{
	//__init();
}

ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::~ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::__init()
{
	//granitemaintenancemandatory = new ConfigNodePropertyBoolean();
	//jobtopics = new ConfigNodePropertyString();
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::__cleanup()
{
	//if(granitemaintenancemandatory != NULL) {
	//
	//delete granitemaintenancemandatory;
	//granitemaintenancemandatory = NULL;
	//}
	//if(jobtopics != NULL) {
	//
	//delete jobtopics;
	//jobtopics = NULL;
	//}
	//
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *granitemaintenancemandatoryKey = "granite.maintenance.mandatory";
	node = json_object_get_member(pJsonObject, granitemaintenancemandatoryKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&granitemaintenancemandatory, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&granitemaintenancemandatory);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *jobtopicsKey = "job.topics";
	node = json_object_get_member(pJsonObject, jobtopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&jobtopics, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&jobtopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getGranitemaintenancemandatory();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getGranitemaintenancemandatory());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *granitemaintenancemandatoryKey = "granite.maintenance.mandatory";
	json_object_set_member(pJsonObject, granitemaintenancemandatoryKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getJobtopics();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getJobtopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobtopicsKey = "job.topics";
	json_object_set_member(pJsonObject, jobtopicsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::getGranitemaintenancemandatory()
{
	return granitemaintenancemandatory;
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::setGranitemaintenancemandatory(ConfigNodePropertyBoolean  granitemaintenancemandatory)
{
	this->granitemaintenancemandatory = granitemaintenancemandatory;
}

ConfigNodePropertyString
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties::setJobtopics(ConfigNodePropertyString  jobtopics)
{
	this->jobtopics = jobtopics;
}


