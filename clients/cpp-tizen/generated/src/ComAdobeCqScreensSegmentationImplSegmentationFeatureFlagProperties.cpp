#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties()
{
	//__init();
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::~ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::__init()
{
	//enableDataTriggeredContent = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::__cleanup()
{
	//if(enableDataTriggeredContent != NULL) {
	//
	//delete enableDataTriggeredContent;
	//enableDataTriggeredContent = NULL;
	//}
	//
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *enableDataTriggeredContentKey = "enableDataTriggeredContent";
	node = json_object_get_member(pJsonObject, enableDataTriggeredContentKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&enableDataTriggeredContent, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&enableDataTriggeredContent);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getEnableDataTriggeredContent();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getEnableDataTriggeredContent());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *enableDataTriggeredContentKey = "enableDataTriggeredContent";
	json_object_set_member(pJsonObject, enableDataTriggeredContentKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::getEnableDataTriggeredContent()
{
	return enableDataTriggeredContent;
}

void
ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties::setEnableDataTriggeredContent(ConfigNodePropertyBoolean  enableDataTriggeredContent)
{
	this->enableDataTriggeredContent = enableDataTriggeredContent;
}


