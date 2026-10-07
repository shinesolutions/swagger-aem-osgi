#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.h"

using namespace std;
using namespace Tizen::ArtikCloud;

OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties()
{
	//__init();
}

OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::~OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties()
{
	//__cleanup();
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::__init()
{
	//resourceresolversearchpath = new ConfigNodePropertyArray();
	//resourceresolvermanglenamespaces = new ConfigNodePropertyBoolean();
	//resourceresolverallowDirect = new ConfigNodePropertyBoolean();
	//resourceresolverrequiredproviders = new ConfigNodePropertyArray();
	//resourceresolverrequiredprovidernames = new ConfigNodePropertyArray();
	//resourceresolvervirtual = new ConfigNodePropertyArray();
	//resourceresolvermapping = new ConfigNodePropertyArray();
	//resourceresolvermaplocation = new ConfigNodePropertyString();
	//resourceresolvermapobservation = new ConfigNodePropertyArray();
	//resourceresolverdefaultvanityredirectstatus = new ConfigNodePropertyInteger();
	//resourceresolverenablevanitypath = new ConfigNodePropertyBoolean();
	//resourceresolvervanitypathmaxEntries = new ConfigNodePropertyInteger();
	//resourceresolvervanitypathmaxEntriesstartup = new ConfigNodePropertyBoolean();
	//resourceresolvervanitypathbloomfiltermaxBytes = new ConfigNodePropertyInteger();
	//resourceresolveroptimizealiasresolution = new ConfigNodePropertyBoolean();
	//resourceresolvervanitypathwhitelist = new ConfigNodePropertyArray();
	//resourceresolvervanitypathblacklist = new ConfigNodePropertyArray();
	//resourceresolvervanityprecedence = new ConfigNodePropertyBoolean();
	//resourceresolverproviderhandlingparanoid = new ConfigNodePropertyBoolean();
	//resourceresolverlogclosing = new ConfigNodePropertyBoolean();
	//resourceresolverlogunclosed = new ConfigNodePropertyBoolean();
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::__cleanup()
{
	//if(resourceresolversearchpath != NULL) {
	//
	//delete resourceresolversearchpath;
	//resourceresolversearchpath = NULL;
	//}
	//if(resourceresolvermanglenamespaces != NULL) {
	//
	//delete resourceresolvermanglenamespaces;
	//resourceresolvermanglenamespaces = NULL;
	//}
	//if(resourceresolverallowDirect != NULL) {
	//
	//delete resourceresolverallowDirect;
	//resourceresolverallowDirect = NULL;
	//}
	//if(resourceresolverrequiredproviders != NULL) {
	//
	//delete resourceresolverrequiredproviders;
	//resourceresolverrequiredproviders = NULL;
	//}
	//if(resourceresolverrequiredprovidernames != NULL) {
	//
	//delete resourceresolverrequiredprovidernames;
	//resourceresolverrequiredprovidernames = NULL;
	//}
	//if(resourceresolvervirtual != NULL) {
	//
	//delete resourceresolvervirtual;
	//resourceresolvervirtual = NULL;
	//}
	//if(resourceresolvermapping != NULL) {
	//
	//delete resourceresolvermapping;
	//resourceresolvermapping = NULL;
	//}
	//if(resourceresolvermaplocation != NULL) {
	//
	//delete resourceresolvermaplocation;
	//resourceresolvermaplocation = NULL;
	//}
	//if(resourceresolvermapobservation != NULL) {
	//
	//delete resourceresolvermapobservation;
	//resourceresolvermapobservation = NULL;
	//}
	//if(resourceresolverdefaultvanityredirectstatus != NULL) {
	//
	//delete resourceresolverdefaultvanityredirectstatus;
	//resourceresolverdefaultvanityredirectstatus = NULL;
	//}
	//if(resourceresolverenablevanitypath != NULL) {
	//
	//delete resourceresolverenablevanitypath;
	//resourceresolverenablevanitypath = NULL;
	//}
	//if(resourceresolvervanitypathmaxEntries != NULL) {
	//
	//delete resourceresolvervanitypathmaxEntries;
	//resourceresolvervanitypathmaxEntries = NULL;
	//}
	//if(resourceresolvervanitypathmaxEntriesstartup != NULL) {
	//
	//delete resourceresolvervanitypathmaxEntriesstartup;
	//resourceresolvervanitypathmaxEntriesstartup = NULL;
	//}
	//if(resourceresolvervanitypathbloomfiltermaxBytes != NULL) {
	//
	//delete resourceresolvervanitypathbloomfiltermaxBytes;
	//resourceresolvervanitypathbloomfiltermaxBytes = NULL;
	//}
	//if(resourceresolveroptimizealiasresolution != NULL) {
	//
	//delete resourceresolveroptimizealiasresolution;
	//resourceresolveroptimizealiasresolution = NULL;
	//}
	//if(resourceresolvervanitypathwhitelist != NULL) {
	//
	//delete resourceresolvervanitypathwhitelist;
	//resourceresolvervanitypathwhitelist = NULL;
	//}
	//if(resourceresolvervanitypathblacklist != NULL) {
	//
	//delete resourceresolvervanitypathblacklist;
	//resourceresolvervanitypathblacklist = NULL;
	//}
	//if(resourceresolvervanityprecedence != NULL) {
	//
	//delete resourceresolvervanityprecedence;
	//resourceresolvervanityprecedence = NULL;
	//}
	//if(resourceresolverproviderhandlingparanoid != NULL) {
	//
	//delete resourceresolverproviderhandlingparanoid;
	//resourceresolverproviderhandlingparanoid = NULL;
	//}
	//if(resourceresolverlogclosing != NULL) {
	//
	//delete resourceresolverlogclosing;
	//resourceresolverlogclosing = NULL;
	//}
	//if(resourceresolverlogunclosed != NULL) {
	//
	//delete resourceresolverlogunclosed;
	//resourceresolverlogunclosed = NULL;
	//}
	//
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *resourceresolversearchpathKey = "resource.resolver.searchpath";
	node = json_object_get_member(pJsonObject, resourceresolversearchpathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolversearchpath, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolversearchpath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvermanglenamespacesKey = "resource.resolver.manglenamespaces";
	node = json_object_get_member(pJsonObject, resourceresolvermanglenamespacesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolvermanglenamespaces, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolvermanglenamespaces);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverallowDirectKey = "resource.resolver.allowDirect";
	node = json_object_get_member(pJsonObject, resourceresolverallowDirectKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolverallowDirect, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolverallowDirect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverrequiredprovidersKey = "resource.resolver.required.providers";
	node = json_object_get_member(pJsonObject, resourceresolverrequiredprovidersKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolverrequiredproviders, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolverrequiredproviders);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverrequiredprovidernamesKey = "resource.resolver.required.providernames";
	node = json_object_get_member(pJsonObject, resourceresolverrequiredprovidernamesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolverrequiredprovidernames, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolverrequiredprovidernames);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervirtualKey = "resource.resolver.virtual";
	node = json_object_get_member(pJsonObject, resourceresolvervirtualKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolvervirtual, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolvervirtual);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvermappingKey = "resource.resolver.mapping";
	node = json_object_get_member(pJsonObject, resourceresolvermappingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolvermapping, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolvermapping);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvermaplocationKey = "resource.resolver.map.location";
	node = json_object_get_member(pJsonObject, resourceresolvermaplocationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyString")) {
			jsonToValue(&resourceresolvermaplocation, node, "ConfigNodePropertyString", "ConfigNodePropertyString");
		} else {
			
			ConfigNodePropertyString* obj = static_cast<ConfigNodePropertyString*> (&resourceresolvermaplocation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvermapobservationKey = "resource.resolver.map.observation";
	node = json_object_get_member(pJsonObject, resourceresolvermapobservationKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolvermapobservation, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolvermapobservation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverdefaultvanityredirectstatusKey = "resource.resolver.default.vanity.redirect.status";
	node = json_object_get_member(pJsonObject, resourceresolverdefaultvanityredirectstatusKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&resourceresolverdefaultvanityredirectstatus, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&resourceresolverdefaultvanityredirectstatus);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverenablevanitypathKey = "resource.resolver.enable.vanitypath";
	node = json_object_get_member(pJsonObject, resourceresolverenablevanitypathKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolverenablevanitypath, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolverenablevanitypath);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervanitypathmaxEntriesKey = "resource.resolver.vanitypath.maxEntries";
	node = json_object_get_member(pJsonObject, resourceresolvervanitypathmaxEntriesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&resourceresolvervanitypathmaxEntries, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&resourceresolvervanitypathmaxEntries);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervanitypathmaxEntriesstartupKey = "resource.resolver.vanitypath.maxEntries.startup";
	node = json_object_get_member(pJsonObject, resourceresolvervanitypathmaxEntriesstartupKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolvervanitypathmaxEntriesstartup, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolvervanitypathmaxEntriesstartup);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervanitypathbloomfiltermaxBytesKey = "resource.resolver.vanitypath.bloomfilter.maxBytes";
	node = json_object_get_member(pJsonObject, resourceresolvervanitypathbloomfiltermaxBytesKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyInteger")) {
			jsonToValue(&resourceresolvervanitypathbloomfiltermaxBytes, node, "ConfigNodePropertyInteger", "ConfigNodePropertyInteger");
		} else {
			
			ConfigNodePropertyInteger* obj = static_cast<ConfigNodePropertyInteger*> (&resourceresolvervanitypathbloomfiltermaxBytes);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolveroptimizealiasresolutionKey = "resource.resolver.optimize.alias.resolution";
	node = json_object_get_member(pJsonObject, resourceresolveroptimizealiasresolutionKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolveroptimizealiasresolution, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolveroptimizealiasresolution);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervanitypathwhitelistKey = "resource.resolver.vanitypath.whitelist";
	node = json_object_get_member(pJsonObject, resourceresolvervanitypathwhitelistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolvervanitypathwhitelist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolvervanitypathwhitelist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervanitypathblacklistKey = "resource.resolver.vanitypath.blacklist";
	node = json_object_get_member(pJsonObject, resourceresolvervanitypathblacklistKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyArray")) {
			jsonToValue(&resourceresolvervanitypathblacklist, node, "ConfigNodePropertyArray", "ConfigNodePropertyArray");
		} else {
			
			ConfigNodePropertyArray* obj = static_cast<ConfigNodePropertyArray*> (&resourceresolvervanitypathblacklist);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolvervanityprecedenceKey = "resource.resolver.vanity.precedence";
	node = json_object_get_member(pJsonObject, resourceresolvervanityprecedenceKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolvervanityprecedence, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolvervanityprecedence);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverproviderhandlingparanoidKey = "resource.resolver.providerhandling.paranoid";
	node = json_object_get_member(pJsonObject, resourceresolverproviderhandlingparanoidKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolverproviderhandlingparanoid, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolverproviderhandlingparanoid);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverlogclosingKey = "resource.resolver.log.closing";
	node = json_object_get_member(pJsonObject, resourceresolverlogclosingKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolverlogclosing, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolverlogclosing);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *resourceresolverlogunclosedKey = "resource.resolver.log.unclosed";
	node = json_object_get_member(pJsonObject, resourceresolverlogunclosedKey);
	if (node !=NULL) {
	

		if (isprimitive("ConfigNodePropertyBoolean")) {
			jsonToValue(&resourceresolverlogunclosed, node, "ConfigNodePropertyBoolean", "ConfigNodePropertyBoolean");
		} else {
			
			ConfigNodePropertyBoolean* obj = static_cast<ConfigNodePropertyBoolean*> (&resourceresolverlogunclosed);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(char* json)
{
	this->fromJson(json);
}

char*
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolversearchpath();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolversearchpath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolversearchpathKey = "resource.resolver.searchpath";
	json_object_set_member(pJsonObject, resourceresolversearchpathKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolvermanglenamespaces();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolvermanglenamespaces());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvermanglenamespacesKey = "resource.resolver.manglenamespaces";
	json_object_set_member(pJsonObject, resourceresolvermanglenamespacesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolverallowDirect();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolverallowDirect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverallowDirectKey = "resource.resolver.allowDirect";
	json_object_set_member(pJsonObject, resourceresolverallowDirectKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolverrequiredproviders();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolverrequiredproviders());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverrequiredprovidersKey = "resource.resolver.required.providers";
	json_object_set_member(pJsonObject, resourceresolverrequiredprovidersKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolverrequiredprovidernames();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolverrequiredprovidernames());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverrequiredprovidernamesKey = "resource.resolver.required.providernames";
	json_object_set_member(pJsonObject, resourceresolverrequiredprovidernamesKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolvervirtual();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolvervirtual());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervirtualKey = "resource.resolver.virtual";
	json_object_set_member(pJsonObject, resourceresolvervirtualKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolvermapping();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolvermapping());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvermappingKey = "resource.resolver.mapping";
	json_object_set_member(pJsonObject, resourceresolvermappingKey, node);
	if (isprimitive("ConfigNodePropertyString")) {
		ConfigNodePropertyString obj = getResourceresolvermaplocation();
		node = converttoJson(&obj, "ConfigNodePropertyString", "");
	}
	else {
		
		ConfigNodePropertyString obj = static_cast<ConfigNodePropertyString> (getResourceresolvermaplocation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvermaplocationKey = "resource.resolver.map.location";
	json_object_set_member(pJsonObject, resourceresolvermaplocationKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolvermapobservation();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolvermapobservation());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvermapobservationKey = "resource.resolver.map.observation";
	json_object_set_member(pJsonObject, resourceresolvermapobservationKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getResourceresolverdefaultvanityredirectstatus();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getResourceresolverdefaultvanityredirectstatus());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverdefaultvanityredirectstatusKey = "resource.resolver.default.vanity.redirect.status";
	json_object_set_member(pJsonObject, resourceresolverdefaultvanityredirectstatusKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolverenablevanitypath();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolverenablevanitypath());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverenablevanitypathKey = "resource.resolver.enable.vanitypath";
	json_object_set_member(pJsonObject, resourceresolverenablevanitypathKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getResourceresolvervanitypathmaxEntries();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getResourceresolvervanitypathmaxEntries());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervanitypathmaxEntriesKey = "resource.resolver.vanitypath.maxEntries";
	json_object_set_member(pJsonObject, resourceresolvervanitypathmaxEntriesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolvervanitypathmaxEntriesstartup();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolvervanitypathmaxEntriesstartup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervanitypathmaxEntriesstartupKey = "resource.resolver.vanitypath.maxEntries.startup";
	json_object_set_member(pJsonObject, resourceresolvervanitypathmaxEntriesstartupKey, node);
	if (isprimitive("ConfigNodePropertyInteger")) {
		ConfigNodePropertyInteger obj = getResourceresolvervanitypathbloomfiltermaxBytes();
		node = converttoJson(&obj, "ConfigNodePropertyInteger", "");
	}
	else {
		
		ConfigNodePropertyInteger obj = static_cast<ConfigNodePropertyInteger> (getResourceresolvervanitypathbloomfiltermaxBytes());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervanitypathbloomfiltermaxBytesKey = "resource.resolver.vanitypath.bloomfilter.maxBytes";
	json_object_set_member(pJsonObject, resourceresolvervanitypathbloomfiltermaxBytesKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolveroptimizealiasresolution();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolveroptimizealiasresolution());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolveroptimizealiasresolutionKey = "resource.resolver.optimize.alias.resolution";
	json_object_set_member(pJsonObject, resourceresolveroptimizealiasresolutionKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolvervanitypathwhitelist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolvervanitypathwhitelist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervanitypathwhitelistKey = "resource.resolver.vanitypath.whitelist";
	json_object_set_member(pJsonObject, resourceresolvervanitypathwhitelistKey, node);
	if (isprimitive("ConfigNodePropertyArray")) {
		ConfigNodePropertyArray obj = getResourceresolvervanitypathblacklist();
		node = converttoJson(&obj, "ConfigNodePropertyArray", "");
	}
	else {
		
		ConfigNodePropertyArray obj = static_cast<ConfigNodePropertyArray> (getResourceresolvervanitypathblacklist());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervanitypathblacklistKey = "resource.resolver.vanitypath.blacklist";
	json_object_set_member(pJsonObject, resourceresolvervanitypathblacklistKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolvervanityprecedence();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolvervanityprecedence());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolvervanityprecedenceKey = "resource.resolver.vanity.precedence";
	json_object_set_member(pJsonObject, resourceresolvervanityprecedenceKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolverproviderhandlingparanoid();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolverproviderhandlingparanoid());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverproviderhandlingparanoidKey = "resource.resolver.providerhandling.paranoid";
	json_object_set_member(pJsonObject, resourceresolverproviderhandlingparanoidKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolverlogclosing();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolverlogclosing());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverlogclosingKey = "resource.resolver.log.closing";
	json_object_set_member(pJsonObject, resourceresolverlogclosingKey, node);
	if (isprimitive("ConfigNodePropertyBoolean")) {
		ConfigNodePropertyBoolean obj = getResourceresolverlogunclosed();
		node = converttoJson(&obj, "ConfigNodePropertyBoolean", "");
	}
	else {
		
		ConfigNodePropertyBoolean obj = static_cast<ConfigNodePropertyBoolean> (getResourceresolverlogunclosed());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *resourceresolverlogunclosedKey = "resource.resolver.log.unclosed";
	json_object_set_member(pJsonObject, resourceresolverlogunclosedKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolversearchpath()
{
	return resourceresolversearchpath;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolversearchpath(ConfigNodePropertyArray  resourceresolversearchpath)
{
	this->resourceresolversearchpath = resourceresolversearchpath;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermanglenamespaces()
{
	return resourceresolvermanglenamespaces;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermanglenamespaces(ConfigNodePropertyBoolean  resourceresolvermanglenamespaces)
{
	this->resourceresolvermanglenamespaces = resourceresolvermanglenamespaces;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverallowDirect()
{
	return resourceresolverallowDirect;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverallowDirect(ConfigNodePropertyBoolean  resourceresolverallowDirect)
{
	this->resourceresolverallowDirect = resourceresolverallowDirect;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverrequiredproviders()
{
	return resourceresolverrequiredproviders;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverrequiredproviders(ConfigNodePropertyArray  resourceresolverrequiredproviders)
{
	this->resourceresolverrequiredproviders = resourceresolverrequiredproviders;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverrequiredprovidernames()
{
	return resourceresolverrequiredprovidernames;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverrequiredprovidernames(ConfigNodePropertyArray  resourceresolverrequiredprovidernames)
{
	this->resourceresolverrequiredprovidernames = resourceresolverrequiredprovidernames;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervirtual()
{
	return resourceresolvervirtual;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervirtual(ConfigNodePropertyArray  resourceresolvervirtual)
{
	this->resourceresolvervirtual = resourceresolvervirtual;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermapping()
{
	return resourceresolvermapping;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermapping(ConfigNodePropertyArray  resourceresolvermapping)
{
	this->resourceresolvermapping = resourceresolvermapping;
}

ConfigNodePropertyString
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermaplocation()
{
	return resourceresolvermaplocation;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermaplocation(ConfigNodePropertyString  resourceresolvermaplocation)
{
	this->resourceresolvermaplocation = resourceresolvermaplocation;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvermapobservation()
{
	return resourceresolvermapobservation;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvermapobservation(ConfigNodePropertyArray  resourceresolvermapobservation)
{
	this->resourceresolvermapobservation = resourceresolvermapobservation;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverdefaultvanityredirectstatus()
{
	return resourceresolverdefaultvanityredirectstatus;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverdefaultvanityredirectstatus(ConfigNodePropertyInteger  resourceresolverdefaultvanityredirectstatus)
{
	this->resourceresolverdefaultvanityredirectstatus = resourceresolverdefaultvanityredirectstatus;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverenablevanitypath()
{
	return resourceresolverenablevanitypath;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverenablevanitypath(ConfigNodePropertyBoolean  resourceresolverenablevanitypath)
{
	this->resourceresolverenablevanitypath = resourceresolverenablevanitypath;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathmaxEntries()
{
	return resourceresolvervanitypathmaxEntries;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathmaxEntries(ConfigNodePropertyInteger  resourceresolvervanitypathmaxEntries)
{
	this->resourceresolvervanitypathmaxEntries = resourceresolvervanitypathmaxEntries;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathmaxEntriesstartup()
{
	return resourceresolvervanitypathmaxEntriesstartup;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathmaxEntriesstartup(ConfigNodePropertyBoolean  resourceresolvervanitypathmaxEntriesstartup)
{
	this->resourceresolvervanitypathmaxEntriesstartup = resourceresolvervanitypathmaxEntriesstartup;
}

ConfigNodePropertyInteger
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathbloomfiltermaxBytes()
{
	return resourceresolvervanitypathbloomfiltermaxBytes;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathbloomfiltermaxBytes(ConfigNodePropertyInteger  resourceresolvervanitypathbloomfiltermaxBytes)
{
	this->resourceresolvervanitypathbloomfiltermaxBytes = resourceresolvervanitypathbloomfiltermaxBytes;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolveroptimizealiasresolution()
{
	return resourceresolveroptimizealiasresolution;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolveroptimizealiasresolution(ConfigNodePropertyBoolean  resourceresolveroptimizealiasresolution)
{
	this->resourceresolveroptimizealiasresolution = resourceresolveroptimizealiasresolution;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathwhitelist()
{
	return resourceresolvervanitypathwhitelist;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathwhitelist(ConfigNodePropertyArray  resourceresolvervanitypathwhitelist)
{
	this->resourceresolvervanitypathwhitelist = resourceresolvervanitypathwhitelist;
}

ConfigNodePropertyArray
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanitypathblacklist()
{
	return resourceresolvervanitypathblacklist;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanitypathblacklist(ConfigNodePropertyArray  resourceresolvervanitypathblacklist)
{
	this->resourceresolvervanitypathblacklist = resourceresolvervanitypathblacklist;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolvervanityprecedence()
{
	return resourceresolvervanityprecedence;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolvervanityprecedence(ConfigNodePropertyBoolean  resourceresolvervanityprecedence)
{
	this->resourceresolvervanityprecedence = resourceresolvervanityprecedence;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverproviderhandlingparanoid()
{
	return resourceresolverproviderhandlingparanoid;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverproviderhandlingparanoid(ConfigNodePropertyBoolean  resourceresolverproviderhandlingparanoid)
{
	this->resourceresolverproviderhandlingparanoid = resourceresolverproviderhandlingparanoid;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverlogclosing()
{
	return resourceresolverlogclosing;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverlogclosing(ConfigNodePropertyBoolean  resourceresolverlogclosing)
{
	this->resourceresolverlogclosing = resourceresolverlogclosing;
}

ConfigNodePropertyBoolean
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::getResourceresolverlogunclosed()
{
	return resourceresolverlogunclosed;
}

void
OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties::setResourceresolverlogunclosed(ConfigNodePropertyBoolean  resourceresolverlogunclosed)
{
	this->resourceresolverlogunclosed = resourceresolverlogunclosed;
}


