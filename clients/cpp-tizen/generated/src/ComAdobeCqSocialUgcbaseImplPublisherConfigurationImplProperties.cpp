#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties()
{
	//__init();
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::~ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::__init()
{
	//isPrimaryPublisher = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::__cleanup()
{
	//if(isPrimaryPublisher != NULL) {
	//
	//delete isPrimaryPublisher;
	//isPrimaryPublisher = NULL;
	//}
	//
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *isPrimaryPublisherKey = "isPrimaryPublisher";
	node = json_object_get_member(pJsonObject, isPrimaryPublisherKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&isPrimaryPublisher, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&isPrimaryPublisher);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIsPrimaryPublisher();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIsPrimaryPublisher());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *isPrimaryPublisherKey = "isPrimaryPublisher";
	json_object_set_member(pJsonObject, isPrimaryPublisherKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::getIsPrimaryPublisher()
{
	return isPrimaryPublisher;
}

void
ComAdobeCqSocialUgcbaseImplPublisherConfigurationImplProperties::setIsPrimaryPublisher(ConfigNodePropertyBoolean  isPrimaryPublisher)
{
	this->isPrimaryPublisher = isPrimaryPublisher;
}


