#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties()
{
	//__init();
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::~ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::__init()
{
	//path = new ConfigNodePropertyArray();
	//serviceranking = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::__cleanup()
{
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//if(serviceranking != NULL) {
	//
	//delete serviceranking;
	//serviceranking = NULL;
	//}
	//
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&path, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&path);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *servicerankingKey = "service.ranking";
	node = json_object_get_member(pJsonObject, servicerankingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&serviceranking, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&serviceranking);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getPath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getPath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getServiceranking();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getServiceranking());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *servicerankingKey = "service.ranking";
	json_object_set_member(pJsonObject, servicerankingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::getPath()
{
	return path;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::setPath(ConfigNodePropertyArray  path)
{
	this->path = path;
}

ConfigNodePropertyInteger
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::getServiceranking()
{
	return serviceranking;
}

void
ComAdobeCqSocialConnectOauthImplSocialOAuthAuthenticationHandleProperties::setServiceranking(ConfigNodePropertyInteger  serviceranking)
{
	this->serviceranking = serviceranking;
}


