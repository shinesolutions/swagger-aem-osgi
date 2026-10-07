#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties()
{
	//__init();
}

ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::~ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties()
{
	//__cleanup();
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::__init()
{
	//servicemax_links_per_host = new ConfigNodePropertyInteger();
	//servicesave_external_link_references = new ConfigNodePropertyBoolean();
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::__cleanup()
{
	//if(servicemax_links_per_host != NULL) {
	//
	//delete servicemax_links_per_host;
	//servicemax_links_per_host = NULL;
	//}
	//if(servicesave_external_link_references != NULL) {
	//
	//delete servicesave_external_link_references;
	//servicesave_external_link_references = NULL;
	//}
	//
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *servicemax_links_per_hostKey = "service.max_links_per_host";
	node = json_object_get_member(pJsonObject, servicemax_links_per_hostKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&servicemax_links_per_host, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&servicemax_links_per_host);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicesave_external_link_referencesKey = "service.save_external_link_references";
	node = json_object_get_member(pJsonObject, servicesave_external_link_referencesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&servicesave_external_link_references, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&servicesave_external_link_references);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServicemaxLinksPerHost();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServicemaxLinksPerHost());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicemax_links_per_hostKey = "service.max_links_per_host";
	json_object_set_member(pJsonObject, servicemax_links_per_hostKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getServicesaveExternalLinkReferences();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getServicesaveExternalLinkReferences());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicesave_external_link_referencesKey = "service.save_external_link_references";
	json_object_set_member(pJsonObject, servicesave_external_link_referencesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::getServicemaxLinksPerHost()
{
	return servicemax_links_per_host;
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::setServicemaxLinksPerHost(ConfigNodePropertyInteger  servicemax_links_per_host)
{
	this->servicemax_links_per_host = servicemax_links_per_host;
}

ConfigNodePropertyBoolean
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::getServicesaveExternalLinkReferences()
{
	return servicesave_external_link_references;
}

void
ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties::setServicesaveExternalLinkReferences(ConfigNodePropertyBoolean  servicesave_external_link_references)
{
	this->servicesave_external_link_references = servicesave_external_link_references;
}


