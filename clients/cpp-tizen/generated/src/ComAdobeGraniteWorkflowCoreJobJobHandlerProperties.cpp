#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteWorkflowCoreJobJobHandlerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobJobHandlerProperties()
{
	//__init();
}

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::~ComAdobeGraniteWorkflowCoreJobJobHandlerProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::__init()
{
	//jobtopics = new ConfigNodePropertyArray();
	//allowselfprocesstermination = new ConfigNodePropertyBoolean();
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::__cleanup()
{
	//if(jobtopics != NULL) {
	//
	//delete jobtopics;
	//jobtopics = NULL;
	//}
	//if(allowselfprocesstermination != NULL) {
	//
	//delete allowselfprocesstermination;
	//allowselfprocesstermination = NULL;
	//}
	//
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *jobtopicsKey = "job.topics";
	node = json_object_get_member(pJsonObject, jobtopicsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&jobtopics, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&jobtopics);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *allowselfprocessterminationKey = "allow.self.process.termination";
	node = json_object_get_member(pJsonObject, allowselfprocessterminationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&allowselfprocesstermination, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&allowselfprocesstermination);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::ComAdobeGraniteWorkflowCoreJobJobHandlerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getJobtopics();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getJobtopics());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *jobtopicsKey = "job.topics";
	json_object_set_member(pJsonObject, jobtopicsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getAllowselfprocesstermination();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getAllowselfprocesstermination());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *allowselfprocessterminationKey = "allow.self.process.termination";
	json_object_set_member(pJsonObject, allowselfprocessterminationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::getJobtopics()
{
	return jobtopics;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::setJobtopics(ConfigNodePropertyArray  jobtopics)
{
	this->jobtopics = jobtopics;
}

ConfigNodePropertyBoolean
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::getAllowselfprocesstermination()
{
	return allowselfprocesstermination;
}

void
ComAdobeGraniteWorkflowCoreJobJobHandlerProperties::setAllowselfprocesstermination(ConfigNodePropertyBoolean  allowselfprocesstermination)
{
	this->allowselfprocesstermination = allowselfprocesstermination;
}


