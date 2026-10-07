#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties()
{
	//__init();
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::~ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties()
{
	//__cleanup();
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::__init()
{
	//itemresourcetypes = new ConfigNodePropertyArray();
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::__cleanup()
{
	//if(itemresourcetypes != NULL) {
	//
	//delete itemresourcetypes;
	//itemresourcetypes = NULL;
	//}
	//
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *itemresourcetypesKey = "item.resource.types";
	node = json_object_get_member(pJsonObject, itemresourcetypesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&itemresourcetypes, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&itemresourcetypes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getItemresourcetypes();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getItemresourcetypes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *itemresourcetypesKey = "item.resource.types";
	json_object_set_member(pJsonObject, itemresourcetypesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::getItemresourcetypes()
{
	return itemresourcetypes;
}

void
ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties::setItemresourcetypes(ConfigNodePropertyArray  itemresourcetypes)
{
	this->itemresourcetypes = itemresourcetypes;
}


