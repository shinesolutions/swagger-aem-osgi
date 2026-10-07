#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties()
{
	//__init();
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::~ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties()
{
	//__cleanup();
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::__init()
{
	//forcelocation = new ConfigNodePropertyBoolean();
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::__cleanup()
{
	//if(forcelocation != NULL) {
	//
	//delete forcelocation;
	//forcelocation = NULL;
	//}
	//
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *forcelocationKey = "forcelocation";
	node = json_object_get_member(pJsonObject, forcelocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&forcelocation, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&forcelocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getForcelocation();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getForcelocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *forcelocationKey = "forcelocation";
	json_object_set_member(pJsonObject, forcelocationKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::getForcelocation()
{
	return forcelocation;
}

void
ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties::setForcelocation(ConfigNodePropertyBoolean  forcelocation)
{
	this->forcelocation = forcelocation;
}


