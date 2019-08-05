#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
{
	//__init();
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::~ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::__init()
{
	//slingservletselectors = new ConfigNodePropertyArray();
	//slingservletextensions = new ConfigNodePropertyString();
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::__cleanup()
{
	//if(slingservletselectors != NULL) {
	//
	//delete slingservletselectors;
	//slingservletselectors = NULL;
	//}
	//if(slingservletextensions != NULL) {
	//
	//delete slingservletextensions;
	//slingservletextensions = NULL;
	//}
	//
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	node = json_object_get_member(pJsonObject, slingservletselectorsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&slingservletselectors, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&slingservletselectors);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *slingservletextensionsKey = "sling.servlet.extensions";
	node = json_object_get_member(pJsonObject, slingservletextensionsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&slingservletextensions, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&slingservletextensions);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getSlingservletselectors();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getSlingservletselectors());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletselectorsKey = "sling.servlet.selectors";
	json_object_set_member(pJsonObject, slingservletselectorsKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getSlingservletextensions();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getSlingservletextensions());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *slingservletextensionsKey = "sling.servlet.extensions";
	json_object_set_member(pJsonObject, slingservletextensionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::getSlingservletselectors()
{
	return slingservletselectors;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::setSlingservletselectors(ConfigNodePropertyArray  slingservletselectors)
{
	this->slingservletselectors = slingservletselectors;
}

ConfigNodePropertyString
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::getSlingservletextensions()
{
	return slingservletextensions;
}

void
ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties::setSlingservletextensions(ConfigNodePropertyString  slingservletextensions)
{
	this->slingservletextensions = slingservletextensions;
}


