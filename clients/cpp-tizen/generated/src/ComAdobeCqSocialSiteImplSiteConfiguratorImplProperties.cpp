#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties()
{
	//__init();
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::~ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::__init()
{
	//componentsUsingTags = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::__cleanup()
{
	//if(componentsUsingTags != NULL) {
	//
	//delete componentsUsingTags;
	//componentsUsingTags = NULL;
	//}
	//
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *componentsUsingTagsKey = "componentsUsingTags";
	node = json_object_get_member(pJsonObject, componentsUsingTagsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&componentsUsingTags, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&componentsUsingTags);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getComponentsUsingTags();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getComponentsUsingTags());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *componentsUsingTagsKey = "componentsUsingTags";
	json_object_set_member(pJsonObject, componentsUsingTagsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::getComponentsUsingTags()
{
	return componentsUsingTags;
}

void
ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties::setComponentsUsingTags(ConfigNodePropertyArray  componentsUsingTags)
{
	this->componentsUsingTags = componentsUsingTags;
}


