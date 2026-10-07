#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties()
{
	//__init();
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::~ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::__init()
{
	//fieldWhitelist = new ConfigNodePropertyArray();
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::__cleanup()
{
	//if(fieldWhitelist != NULL) {
	//
	//delete fieldWhitelist;
	//fieldWhitelist = NULL;
	//}
	//
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	node = json_object_get_member(pJsonObject, fieldWhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&fieldWhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&fieldWhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getFieldWhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getFieldWhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fieldWhitelistKey = "fieldWhitelist";
	json_object_set_member(pJsonObject, fieldWhitelistKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::getFieldWhitelist()
{
	return fieldWhitelist;
}

void
ComAdobeCqSocialMembersEndpointsImplCommunityMemberGroupProfileProperties::setFieldWhitelist(ConfigNodePropertyArray  fieldWhitelist)
{
	this->fieldWhitelist = fieldWhitelist;
}


