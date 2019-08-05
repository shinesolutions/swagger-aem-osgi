#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties()
{
	//__init();
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::~ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties()
{
	//__cleanup();
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::__init()
{
	//codeupgradetasks = new ConfigNodePropertyArray();
	//codeupgradetaskfilters = new ConfigNodePropertyArray();
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::__cleanup()
{
	//if(codeupgradetasks != NULL) {
	//
	//delete codeupgradetasks;
	//codeupgradetasks = NULL;
	//}
	//if(codeupgradetaskfilters != NULL) {
	//
	//delete codeupgradetaskfilters;
	//codeupgradetaskfilters = NULL;
	//}
	//
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *codeupgradetasksKey = "codeupgradetasks";
	node = json_object_get_member(pJsonObject, codeupgradetasksKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&codeupgradetasks, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&codeupgradetasks);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *codeupgradetaskfiltersKey = "codeupgradetaskfilters";
	node = json_object_get_member(pJsonObject, codeupgradetaskfiltersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&codeupgradetaskfilters, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&codeupgradetaskfilters);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCodeupgradetasks();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCodeupgradetasks());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *codeupgradetasksKey = "codeupgradetasks";
	json_object_set_member(pJsonObject, codeupgradetasksKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCodeupgradetaskfilters();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCodeupgradetaskfilters());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *codeupgradetaskfiltersKey = "codeupgradetaskfilters";
	json_object_set_member(pJsonObject, codeupgradetaskfiltersKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::getCodeupgradetasks()
{
	return codeupgradetasks;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::setCodeupgradetasks(ConfigNodePropertyArray  codeupgradetasks)
{
	this->codeupgradetasks = codeupgradetasks;
}

ConfigNodePropertyArray
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::getCodeupgradetaskfilters()
{
	return codeupgradetaskfilters;
}

void
ComDayCqCompatCodeupgradeImplCodeUpgradeExecutionConditionCheckeProperties::setCodeupgradetaskfilters(ConfigNodePropertyArray  codeupgradetaskfilters)
{
	this->codeupgradetaskfilters = codeupgradetaskfilters;
}


