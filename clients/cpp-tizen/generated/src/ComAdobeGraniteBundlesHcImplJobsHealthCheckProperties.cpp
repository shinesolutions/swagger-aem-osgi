#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties()
{
	//__init();
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::~ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::__init()
{
	//hctags = new ConfigNodePropertyArray();
	//maxqueuedjobs = new ConfigNodePropertyInteger();
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::__cleanup()
{
	//if(hctags != NULL) {
	//
	//delete hctags;
	//hctags = NULL;
	//}
	//if(maxqueuedjobs != NULL) {
	//
	//delete maxqueuedjobs;
	//maxqueuedjobs = NULL;
	//}
	//
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	const gchar *maxqueuedjobsKey = "max.queued.jobs";
	node = json_object_get_member(pJsonObject, maxqueuedjobsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxqueuedjobs, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxqueuedjobs);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxqueuedjobs();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxqueuedjobs());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxqueuedjobsKey = "max.queued.jobs";
	json_object_set_member(pJsonObject, maxqueuedjobsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::getHctags()
{
	return hctags;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::setHctags(ConfigNodePropertyArray  hctags)
{
	this->hctags = hctags;
}

ConfigNodePropertyInteger
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::getMaxqueuedjobs()
{
	return maxqueuedjobs;
}

void
ComAdobeGraniteBundlesHcImplJobsHealthCheckProperties::setMaxqueuedjobs(ConfigNodePropertyInteger  maxqueuedjobs)
{
	this->maxqueuedjobs = maxqueuedjobs;
}


