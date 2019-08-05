#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqWidgetImplWidgetExtensionProviderImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqWidgetImplWidgetExtensionProviderImplProperties::ComDayCqWidgetImplWidgetExtensionProviderImplProperties()
{
	//__init();
}

ComDayCqWidgetImplWidgetExtensionProviderImplProperties::~ComDayCqWidgetImplWidgetExtensionProviderImplProperties()
{
	//__cleanup();
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::__init()
{
	//extendablewidgets = new ConfigNodePropertyArray();
	//widgetextensionproviderdebug = new ConfigNodePropertyBoolean();
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::__cleanup()
{
	//if(extendablewidgets != NULL) {
	//
	//delete extendablewidgets;
	//extendablewidgets = NULL;
	//}
	//if(widgetextensionproviderdebug != NULL) {
	//
	//delete widgetextensionproviderdebug;
	//widgetextensionproviderdebug = NULL;
	//}
	//
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *extendablewidgetsKey = "extendable.widgets";
	node = json_object_get_member(pJsonObject, extendablewidgetsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&extendablewidgets, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&extendablewidgets);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *widgetextensionproviderdebugKey = "widgetextensionprovider.debug";
	node = json_object_get_member(pJsonObject, widgetextensionproviderdebugKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&widgetextensionproviderdebug, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&widgetextensionproviderdebug);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqWidgetImplWidgetExtensionProviderImplProperties::ComDayCqWidgetImplWidgetExtensionProviderImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getExtendablewidgets();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getExtendablewidgets());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *extendablewidgetsKey = "extendable.widgets";
	json_object_set_member(pJsonObject, extendablewidgetsKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getWidgetextensionproviderdebug();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getWidgetextensionproviderdebug());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *widgetextensionproviderdebugKey = "widgetextensionprovider.debug";
	json_object_set_member(pJsonObject, widgetextensionproviderdebugKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::getExtendablewidgets()
{
	return extendablewidgets;
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::setExtendablewidgets(ConfigNodePropertyArray  extendablewidgets)
{
	this->extendablewidgets = extendablewidgets;
}

ConfigNodePropertyBoolean
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::getWidgetextensionproviderdebug()
{
	return widgetextensionproviderdebug;
}

void
ComDayCqWidgetImplWidgetExtensionProviderImplProperties::setWidgetextensionproviderdebug(ConfigNodePropertyBoolean  widgetextensionproviderdebug)
{
	this->widgetextensionproviderdebug = widgetextensionproviderdebug;
}


