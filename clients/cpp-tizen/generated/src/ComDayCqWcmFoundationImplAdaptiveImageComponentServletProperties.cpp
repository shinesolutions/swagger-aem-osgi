#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties()
{
	//__init();
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::~ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties()
{
	//__cleanup();
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::__init()
{
	//adaptsupportedwidths = new ConfigNodePropertyArray();
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::__cleanup()
{
	//if(adaptsupportedwidths != NULL) {
	//
	//delete adaptsupportedwidths;
	//adaptsupportedwidths = NULL;
	//}
	//
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *adaptsupportedwidthsKey = "adapt.supported.widths";
	node = json_object_get_member(pJsonObject, adaptsupportedwidthsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&adaptsupportedwidths, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&adaptsupportedwidths);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getAdaptsupportedwidths();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getAdaptsupportedwidths());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *adaptsupportedwidthsKey = "adapt.supported.widths";
	json_object_set_member(pJsonObject, adaptsupportedwidthsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::getAdaptsupportedwidths()
{
	return adaptsupportedwidths;
}

void
ComDayCqWcmFoundationImplAdaptiveImageComponentServletProperties::setAdaptsupportedwidths(ConfigNodePropertyArray  adaptsupportedwidths)
{
	this->adaptsupportedwidths = adaptsupportedwidths;
}


