#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties()
{
	//__init();
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::~ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::__init()
{
	//cqsocialconsoleanalyticscomponents = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::__cleanup()
{
	//if(cqsocialconsoleanalyticscomponents != NULL) {
	//
	//delete cqsocialconsoleanalyticscomponents;
	//cqsocialconsoleanalyticscomponents = NULL;
	//}
	//
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqsocialconsoleanalyticscomponentsKey = "cq.social.console.analytics.components";
	node = json_object_get_member(pJsonObject, cqsocialconsoleanalyticscomponentsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&cqsocialconsoleanalyticscomponents, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&cqsocialconsoleanalyticscomponents);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getCqsocialconsoleanalyticscomponents();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getCqsocialconsoleanalyticscomponents());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsocialconsoleanalyticscomponentsKey = "cq.social.console.analytics.components";
	json_object_set_member(pJsonObject, cqsocialconsoleanalyticscomponentsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::getCqsocialconsoleanalyticscomponents()
{
	return cqsocialconsoleanalyticscomponents;
}

void
ComAdobeCqSocialSiteImplAnalyticsComponentConfigurationServiceImProperties::setCqsocialconsoleanalyticscomponents(ConfigNodePropertyArray  cqsocialconsoleanalyticscomponents)
{
	this->cqsocialconsoleanalyticscomponents = cqsocialconsoleanalyticscomponents;
}


