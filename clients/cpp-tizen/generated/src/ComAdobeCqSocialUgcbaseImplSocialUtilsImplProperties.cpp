#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::~ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::__init()
{
	//legacyCloudUGCPathMapping = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::__cleanup()
{
	//if(legacyCloudUGCPathMapping != NULL) {
	//
	//delete legacyCloudUGCPathMapping;
	//legacyCloudUGCPathMapping = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *legacyCloudUGCPathMappingKey = "legacyCloudUGCPathMapping";
	node = json_object_get_member(pJsonObject, legacyCloudUGCPathMappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&legacyCloudUGCPathMapping, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&legacyCloudUGCPathMapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getLegacyCloudUGCPathMapping();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getLegacyCloudUGCPathMapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *legacyCloudUGCPathMappingKey = "legacyCloudUGCPathMapping";
	json_object_set_member(pJsonObject, legacyCloudUGCPathMappingKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::getLegacyCloudUGCPathMapping()
{
	return legacyCloudUGCPathMapping;
}

void
ComAdobeCqSocialUgcbaseImplSocialUtilsImplProperties::setLegacyCloudUGCPathMapping(ConfigNodePropertyBoolean  legacyCloudUGCPathMapping)
{
	this->legacyCloudUGCPathMapping = legacyCloudUGCPathMapping;
}


