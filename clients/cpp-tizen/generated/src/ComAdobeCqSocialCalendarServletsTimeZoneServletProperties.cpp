#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ComAdobeCqSocialCalendarServletsTimeZoneServletProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::ComAdobeCqSocialCalendarServletsTimeZoneServletProperties()
{
	//__init();
}

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::~ComAdobeCqSocialCalendarServletsTimeZoneServletProperties()
{
	//__cleanup();
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::__init()
{
	//timezonesexpirytime = new ConfigNodePropertyInteger();
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::__cleanup()
{
	//if(timezonesexpirytime != NULL) {
	//
	//delete timezonesexpirytime;
	//timezonesexpirytime = NULL;
	//}
	//
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timezonesexpirytimeKey = "timezones.expirytime";
	node = json_object_get_member(pJsonObject, timezonesexpirytimeKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&timezonesexpirytime, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&timezonesexpirytime);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::ComAdobeCqSocialCalendarServletsTimeZoneServletProperties(char* json)
{
	this->fromJson(json);
}

char*
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getTimezonesexpirytime();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getTimezonesexpirytime());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *timezonesexpirytimeKey = "timezones.expirytime";
	json_object_set_member(pJsonObject, timezonesexpirytimeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyInteger
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::getTimezonesexpirytime()
{
	return timezonesexpirytime;
}

void
ComAdobeCqSocialCalendarServletsTimeZoneServletProperties::setTimezonesexpirytime(ConfigNodePropertyInteger  timezonesexpirytime)
{
	this->timezonesexpirytime = timezonesexpirytime;
}


