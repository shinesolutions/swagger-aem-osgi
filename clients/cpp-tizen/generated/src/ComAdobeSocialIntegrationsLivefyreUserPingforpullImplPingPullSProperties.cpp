#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties()
{
	//__init();
}

ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::~ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties()
{
	//__cleanup();
}

void
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::__init()
{
	//communitiesintegrationlivefyreslingeventfilter = new ConfigNodePropertyString();
}

void
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::__cleanup()
{
	//if(communitiesintegrationlivefyreslingeventfilter != NULL) {
	//
	//delete communitiesintegrationlivefyreslingeventfilter;
	//communitiesintegrationlivefyreslingeventfilter = NULL;
	//}
	//
}

void
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *communitiesintegrationlivefyreslingeventfilterKey = "communities.integration.livefyre.sling.event.filter";
	node = json_object_get_member(pJsonObject, communitiesintegrationlivefyreslingeventfilterKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&communitiesintegrationlivefyreslingeventfilter, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&communitiesintegrationlivefyreslingeventfilter);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getCommunitiesintegrationlivefyreslingeventfilter();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getCommunitiesintegrationlivefyreslingeventfilter());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *communitiesintegrationlivefyreslingeventfilterKey = "communities.integration.livefyre.sling.event.filter";
	json_object_set_member(pJsonObject, communitiesintegrationlivefyreslingeventfilterKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyString
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::getCommunitiesintegrationlivefyreslingeventfilter()
{
	return communitiesintegrationlivefyreslingeventfilter;
}

void
ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties::setCommunitiesintegrationlivefyreslingeventfilter(ConfigNodePropertyString  communitiesintegrationlivefyreslingeventfilter)
{
	this->communitiesintegrationlivefyreslingeventfilter = communitiesintegrationlivefyreslingeventfilter;
}


