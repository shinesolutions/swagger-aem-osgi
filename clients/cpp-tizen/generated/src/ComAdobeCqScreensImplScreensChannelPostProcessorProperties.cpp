#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqScreensImplScreensChannelPostProcessorProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqScreensImplScreensChannelPostProcessorProperties::ComAdobeCqScreensImplScreensChannelPostProcessorProperties()
{
	//__init();
}

ComAdobeCqScreensImplScreensChannelPostProcessorProperties::~ComAdobeCqScreensImplScreensChannelPostProcessorProperties()
{
	//__cleanup();
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::__init()
{
	//screenschannelspropertiestoremove = new ConfigNodePropertyArray();
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::__cleanup()
{
	//if(screenschannelspropertiestoremove != NULL) {
	//
	//delete screenschannelspropertiestoremove;
	//screenschannelspropertiestoremove = NULL;
	//}
	//
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *screenschannelspropertiestoremoveKey = "screens.channels.properties.to.remove";
	node = json_object_get_member(pJsonObject, screenschannelspropertiestoremoveKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&screenschannelspropertiestoremove, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&screenschannelspropertiestoremove);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqScreensImplScreensChannelPostProcessorProperties::ComAdobeCqScreensImplScreensChannelPostProcessorProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getScreenschannelspropertiestoremove();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getScreenschannelspropertiestoremove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *screenschannelspropertiestoremoveKey = "screens.channels.properties.to.remove";
	json_object_set_member(pJsonObject, screenschannelspropertiestoremoveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::getScreenschannelspropertiestoremove()
{
	return screenschannelspropertiestoremove;
}

void
ComAdobeCqScreensImplScreensChannelPostProcessorProperties::setScreenschannelspropertiestoremove(ConfigNodePropertyArray  screenschannelspropertiestoremove)
{
	this->screenschannelspropertiestoremove = screenschannelspropertiestoremove;
}


