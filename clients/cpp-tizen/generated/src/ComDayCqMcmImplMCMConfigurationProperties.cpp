#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqMcmImplMCMConfigurationProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqMcmImplMCMConfigurationProperties::ComDayCqMcmImplMCMConfigurationProperties()
{
	//__init();
}

ComDayCqMcmImplMCMConfigurationProperties::~ComDayCqMcmImplMCMConfigurationProperties()
{
	//__cleanup();
}

void
ComDayCqMcmImplMCMConfigurationProperties::__init()
{
	//experienceindirection = new ConfigNodePropertyArray();
	//touchpointindirection = new ConfigNodePropertyArray();
}

void
ComDayCqMcmImplMCMConfigurationProperties::__cleanup()
{
	//if(experienceindirection != NULL) {
	//
	//delete experienceindirection;
	//experienceindirection = NULL;
	//}
	//if(touchpointindirection != NULL) {
	//
	//delete touchpointindirection;
	//touchpointindirection = NULL;
	//}
	//
}

void
ComDayCqMcmImplMCMConfigurationProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *experienceindirectionKey = "experience.indirection";
	node = json_object_get_member(pJsonObject, experienceindirectionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&experienceindirection, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&experienceindirection);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *touchpointindirectionKey = "touchpoint.indirection";
	node = json_object_get_member(pJsonObject, touchpointindirectionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&touchpointindirection, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&touchpointindirection);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqMcmImplMCMConfigurationProperties::ComDayCqMcmImplMCMConfigurationProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqMcmImplMCMConfigurationProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExperienceindirection();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExperienceindirection());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *experienceindirectionKey = "experience.indirection";
	json_object_set_member(pJsonObject, experienceindirectionKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getTouchpointindirection();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getTouchpointindirection());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *touchpointindirectionKey = "touchpoint.indirection";
	json_object_set_member(pJsonObject, touchpointindirectionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqMcmImplMCMConfigurationProperties::getExperienceindirection()
{
	return experienceindirection;
}

void
ComDayCqMcmImplMCMConfigurationProperties::setExperienceindirection(ConfigNodePropertyArray  experienceindirection)
{
	this->experienceindirection = experienceindirection;
}

ConfigNodePropertyArray
ComDayCqMcmImplMCMConfigurationProperties::getTouchpointindirection()
{
	return touchpointindirection;
}

void
ComDayCqMcmImplMCMConfigurationProperties::setTouchpointindirection(ConfigNodePropertyArray  touchpointindirection)
{
	this->touchpointindirection = touchpointindirection;
}


