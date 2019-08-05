#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties()
{
	//__init();
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::~ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::__init()
{
	//maxunreadnotificationcount = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::__cleanup()
{
	//if(maxunreadnotificationcount != NULL) {
	//
	//delete maxunreadnotificationcount;
	//maxunreadnotificationcount = NULL;
	//}
	//
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *maxunreadnotificationcountKey = "max.unread.notification.count";
	node = json_object_get_member(pJsonObject, maxunreadnotificationcountKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&maxunreadnotificationcount, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&maxunreadnotificationcount);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getMaxunreadnotificationcount();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getMaxunreadnotificationcount());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *maxunreadnotificationcountKey = "max.unread.notification.count";
	json_object_set_member(pJsonObject, maxunreadnotificationcountKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::getMaxunreadnotificationcount()
{
	return maxunreadnotificationcount;
}

void
ComAdobeCqSocialNotificationsImplNotificationManagerImplProperties::setMaxunreadnotificationcount(ConfigNodePropertyInteger  maxunreadnotificationcount)
{
	this->maxunreadnotificationcount = maxunreadnotificationcount;
}


