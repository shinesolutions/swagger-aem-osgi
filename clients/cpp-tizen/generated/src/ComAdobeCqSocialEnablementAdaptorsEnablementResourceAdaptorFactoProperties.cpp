#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties()
{
	//__init();
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::~ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::__init()
{
	//isMemberCheck = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::__cleanup()
{
	//if(isMemberCheck != NULL) {
	//
	//delete isMemberCheck;
	//isMemberCheck = NULL;
	//}
	//
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *isMemberCheckKey = "isMemberCheck";
	node = json_object_get_member(pJsonObject, isMemberCheckKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&isMemberCheck, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&isMemberCheck);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getIsMemberCheck();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getIsMemberCheck());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *isMemberCheckKey = "isMemberCheck";
	json_object_set_member(pJsonObject, isMemberCheckKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyBoolean
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::getIsMemberCheck()
{
	return isMemberCheck;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementResourceAdaptorFactoProperties::setIsMemberCheck(ConfigNodePropertyBoolean  isMemberCheck)
{
	this->isMemberCheck = isMemberCheck;
}


