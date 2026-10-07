#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeGraniteAcpPlatformPlatformServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeGraniteAcpPlatformPlatformServletProperties::ComAdobeGraniteAcpPlatformPlatformServletProperties()
{
	//__init();
}

ComAdobeGraniteAcpPlatformPlatformServletProperties::~ComAdobeGraniteAcpPlatformPlatformServletProperties()
{
	//__cleanup();
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::__init()
{
	//querylimit = new ConfigNodePropertyInteger();
	//filetypeextensionmap = new ConfigNodePropertyArray();
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::__cleanup()
{
	//if(querylimit != NULL) {
	//
	//delete querylimit;
	//querylimit = NULL;
	//}
	//if(filetypeextensionmap != NULL) {
	//
	//delete filetypeextensionmap;
	//filetypeextensionmap = NULL;
	//}
	//
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *querylimitKey = "query.limit";
	node = json_object_get_member(pJsonObject, querylimitKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&querylimit, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&querylimit);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *filetypeextensionmapKey = "file.type.extension.map";
	node = json_object_get_member(pJsonObject, filetypeextensionmapKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&filetypeextensionmap, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&filetypeextensionmap);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeGraniteAcpPlatformPlatformServletProperties::ComAdobeGraniteAcpPlatformPlatformServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeGraniteAcpPlatformPlatformServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getQuerylimit();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getQuerylimit());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *querylimitKey = "query.limit";
	json_object_set_member(pJsonObject, querylimitKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFiletypeextensionmap();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFiletypeextensionmap());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *filetypeextensionmapKey = "file.type.extension.map";
	json_object_set_member(pJsonObject, filetypeextensionmapKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeGraniteAcpPlatformPlatformServletProperties::getQuerylimit()
{
	return querylimit;
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::setQuerylimit(ConfigNodePropertyInteger  querylimit)
{
	this->querylimit = querylimit;
}

ConfigNodePropertyArray
ComAdobeGraniteAcpPlatformPlatformServletProperties::getFiletypeextensionmap()
{
	return filetypeextensionmap;
}

void
ComAdobeGraniteAcpPlatformPlatformServletProperties::setFiletypeextensionmap(ConfigNodePropertyArray  filetypeextensionmap)
{
	this->filetypeextensionmap = filetypeextensionmap;
}


