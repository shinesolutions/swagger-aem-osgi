#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties()
{
	//__init();
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::~ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::__init()
{
	//connectProtocol = new ConfigNodePropertyDropDown();
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::__cleanup()
{
	//if(connectProtocol != NULL) {
	//
	//delete connectProtocol;
	//connectProtocol = NULL;
	//}
	//
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *connectProtocolKey = "connectProtocol";
	node = json_object_get_member(pJsonObject, connectProtocolKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyDropDown")) {
			jsonToValue(&connectProtocol, node, "ConfigNodePropertyDropDown", "ConfigNodePropertyDropDown");
		} else {
			
			ConfigNodePropertyDropDown* obj = static_cast<ConfigNodePropertyDropDown*> (&connectProtocol);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyDropDown")) {
		ConfigNodePropertyDropDown obj = getConnectProtocol();
		node = converttoJson(&obj, "ConfigNodePropertyDropDown", "");
	}
	else {
		
		ConfigNodePropertyDropDown obj = static_cast<ConfigNodePropertyDropDown> (getConnectProtocol());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *connectProtocolKey = "connectProtocol";
	json_object_set_member(pJsonObject, connectProtocolKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyDropDown
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::getConnectProtocol()
{
	return connectProtocol;
}

void
ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties::setConnectProtocol(ConfigNodePropertyDropDown  connectProtocol)
{
	this->connectProtocol = connectProtocol;
}


