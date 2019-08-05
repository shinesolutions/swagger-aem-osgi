#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationImplPageImpressionsTrackerProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::ComDayCqWcmFoundationImplPageImpressionsTrackerProperties()
{
	//__init();
}

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::~ComDayCqWcmFoundationImplPageImpressionsTrackerProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::__init()
{
	//slingauthrequirements = new ConfigNodePropertyString();
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::__cleanup()
{
	//if(slingauthrequirements != NULL) {
	//
	//delete slingauthrequirements;
	//slingauthrequirements = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingauthrequirementsKey = "sling.auth.requirements";
	node = json_object_get_member(pJsonObject, slingauthrequirementsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingauthrequirements, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingauthrequirements);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::ComDayCqWcmFoundationImplPageImpressionsTrackerProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingauthrequirements();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingauthrequirements());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingauthrequirementsKey = "sling.auth.requirements";
	json_object_set_member(pJsonObject, slingauthrequirementsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::getSlingauthrequirements()
{
	return slingauthrequirements;
}

void
ComDayCqWcmFoundationImplPageImpressionsTrackerProperties::setSlingauthrequirements(ConfigNodePropertyString  slingauthrequirements)
{
	this->slingauthrequirements = slingauthrequirements;
}


