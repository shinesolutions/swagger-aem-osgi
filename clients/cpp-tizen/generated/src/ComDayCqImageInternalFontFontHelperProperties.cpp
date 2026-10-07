#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqImageInternalFontFontHelperProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqImageInternalFontFontHelperProperties::ComDayCqImageInternalFontFontHelperProperties()
{
	//__init();
}

ComDayCqImageInternalFontFontHelperProperties::~ComDayCqImageInternalFontFontHelperProperties()
{
	//__cleanup();
}

void
ComDayCqImageInternalFontFontHelperProperties::__init()
{
	//fontpath = new ConfigNodePropertyArray();
	//oversamplingFactor = new ConfigNodePropertyInteger();
}

void
ComDayCqImageInternalFontFontHelperProperties::__cleanup()
{
	//if(fontpath != NULL) {
	//
	//delete fontpath;
	//fontpath = NULL;
	//}
	//if(oversamplingFactor != NULL) {
	//
	//delete oversamplingFactor;
	//oversamplingFactor = NULL;
	//}
	//
}

void
ComDayCqImageInternalFontFontHelperProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fontpathKey = "fontpath";
	node = json_object_get_member(pJsonObject, fontpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fontpath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fontpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *oversamplingFactorKey = "oversamplingFactor";
	node = json_object_get_member(pJsonObject, oversamplingFactorKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&oversamplingFactor, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&oversamplingFactor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqImageInternalFontFontHelperProperties::ComDayCqImageInternalFontFontHelperProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqImageInternalFontFontHelperProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFontpath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFontpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fontpathKey = "fontpath";
	json_object_set_member(pJsonObject, fontpathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getOversamplingFactor();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getOversamplingFactor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *oversamplingFactorKey = "oversamplingFactor";
	json_object_set_member(pJsonObject, oversamplingFactorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComDayCqImageInternalFontFontHelperProperties::getFontpath()
{
	return fontpath;
}

void
ComDayCqImageInternalFontFontHelperProperties::setFontpath(ConfigNodePropertyArray  fontpath)
{
	this->fontpath = fontpath;
}

ConfigNodePropertyInteger
ComDayCqImageInternalFontFontHelperProperties::getOversamplingFactor()
{
	return oversamplingFactor;
}

void
ComDayCqImageInternalFontFontHelperProperties::setOversamplingFactor(ConfigNodePropertyInteger  oversamplingFactor)
{
	this->oversamplingFactor = oversamplingFactor;
}


