#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties()
{
	//__init();
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::~ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::__init()
{
	//brightedgeurl = new ConfigNodePropertyString();
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::__cleanup()
{
	//if(brightedgeurl != NULL) {
	//
	//delete brightedgeurl;
	//brightedgeurl = NULL;
	//}
	//
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *brightedgeurlKey = "brightedge.url";
	node = json_object_get_member(pJsonObject, brightedgeurlKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&brightedgeurl, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&brightedgeurl);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getBrightedgeurl();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getBrightedgeurl());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *brightedgeurlKey = "brightedge.url";
	json_object_set_member(pJsonObject, brightedgeurlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::getBrightedgeurl()
{
	return brightedgeurl;
}

void
ComAdobeCqContentinsightImplServletsBrightEdgeProxyServletProperties::setBrightedgeurl(ConfigNodePropertyString  brightedgeurl)
{
	this->brightedgeurl = brightedgeurl;
}


