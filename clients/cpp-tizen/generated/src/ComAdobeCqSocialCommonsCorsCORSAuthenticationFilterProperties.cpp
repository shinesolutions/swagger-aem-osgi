#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::~ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::__init()
{
	//corsenabling = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::__cleanup()
{
	//if(corsenabling != NULL) {
	//
	//delete corsenabling;
	//corsenabling = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *corsenablingKey = "cors.enabling";
	node = json_object_get_member(pJsonObject, corsenablingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&corsenabling, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&corsenabling);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCorsenabling();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCorsenabling());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *corsenablingKey = "cors.enabling";
	json_object_set_member(pJsonObject, corsenablingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::getCorsenabling()
{
	return corsenabling;
}

void
ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties::setCorsenabling(ConfigNodePropertyBoolean  corsenabling)
{
	this->corsenabling = corsenabling;
}


