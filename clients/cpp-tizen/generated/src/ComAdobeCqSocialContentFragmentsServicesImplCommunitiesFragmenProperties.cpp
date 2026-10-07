#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties()
{
	//__init();
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::~ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::__init()
{
	//cqsocialcontentfragmentsservicesenabled = new ConfigNodePropertyBoolean();
	//cqsocialcontentfragmentsserviceswaitTimeSeconds = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::__cleanup()
{
	//if(cqsocialcontentfragmentsservicesenabled != NULL) {
	//
	//delete cqsocialcontentfragmentsservicesenabled;
	//cqsocialcontentfragmentsservicesenabled = NULL;
	//}
	//if(cqsocialcontentfragmentsserviceswaitTimeSeconds != NULL) {
	//
	//delete cqsocialcontentfragmentsserviceswaitTimeSeconds;
	//cqsocialcontentfragmentsserviceswaitTimeSeconds = NULL;
	//}
	//
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *cqsocialcontentfragmentsservicesenabledKey = "cq.social.content.fragments.services.enabled";
	node = json_object_get_member(pJsonObject, cqsocialcontentfragmentsservicesenabledKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&cqsocialcontentfragmentsservicesenabled, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&cqsocialcontentfragmentsservicesenabled);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cqsocialcontentfragmentsserviceswaitTimeSecondsKey = "cq.social.content.fragments.services.waitTimeSeconds";
	node = json_object_get_member(pJsonObject, cqsocialcontentfragmentsserviceswaitTimeSecondsKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&cqsocialcontentfragmentsserviceswaitTimeSeconds, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&cqsocialcontentfragmentsserviceswaitTimeSeconds);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getCqsocialcontentfragmentsservicesenabled();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getCqsocialcontentfragmentsservicesenabled());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsocialcontentfragmentsservicesenabledKey = "cq.social.content.fragments.services.enabled";
	json_object_set_member(pJsonObject, cqsocialcontentfragmentsservicesenabledKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getCqsocialcontentfragmentsserviceswaitTimeSeconds();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getCqsocialcontentfragmentsserviceswaitTimeSeconds());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cqsocialcontentfragmentsserviceswaitTimeSecondsKey = "cq.social.content.fragments.services.waitTimeSeconds";
	json_object_set_member(pJsonObject, cqsocialcontentfragmentsserviceswaitTimeSecondsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::getCqsocialcontentfragmentsservicesenabled()
{
	return cqsocialcontentfragmentsservicesenabled;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::setCqsocialcontentfragmentsservicesenabled(ConfigNodePropertyBoolean  cqsocialcontentfragmentsservicesenabled)
{
	this->cqsocialcontentfragmentsservicesenabled = cqsocialcontentfragmentsservicesenabled;
}

ConfigNodePropertyInteger
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::getCqsocialcontentfragmentsserviceswaitTimeSeconds()
{
	return cqsocialcontentfragmentsserviceswaitTimeSeconds;
}

void
ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties::setCqsocialcontentfragmentsserviceswaitTimeSeconds(ConfigNodePropertyInteger  cqsocialcontentfragmentsserviceswaitTimeSeconds)
{
	this->cqsocialcontentfragmentsserviceswaitTimeSeconds = cqsocialcontentfragmentsserviceswaitTimeSeconds;
}


