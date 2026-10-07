#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::~ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::__init()
{
	//jobtopics = new ConfigNodePropertyString();
}

void
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::__cleanup()
{
	//if(jobtopics != NULL) {
	//
	//delete jobtopics;
	//jobtopics = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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

ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
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

ConfigNodePropertyString
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteWorkflowCoreOffloadingWorkflowOffloadingJobConsumProperties::setJobtopics(ConfigNodePropertyString  jobtopics)
{
	this->jobtopics = jobtopics;
}


