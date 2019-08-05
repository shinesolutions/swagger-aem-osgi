#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties()
{
	//__init();
}

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::~ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::__init()
{
	//isMemberCheck = new ConfigNodePropertyBoolean();
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::__cleanup()
{
	//if(isMemberCheck != NULL) {
	//
	//delete isMemberCheck;
	//isMemberCheck = NULL;
	//}
	//
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::fromJson(char* jsonStr)
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

ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::toJson()
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
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::getIsMemberCheck()
{
	return isMemberCheck;
}

void
ComAdobeCqSocialEnablementAdaptorsEnablementLearningPathAdaptorFProperties::setIsMemberCheck(ConfigNodePropertyBoolean  isMemberCheck)
{
	this->isMemberCheck = isMemberCheck;
}


