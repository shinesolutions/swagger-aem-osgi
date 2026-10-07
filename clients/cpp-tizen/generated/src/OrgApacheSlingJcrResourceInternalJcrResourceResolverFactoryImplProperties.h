/*
 * OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_
#define _OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties();
	OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolversearchpath();

	/*! \brief Set 
	 */
	void setResourceresolversearchpath(ConfigNodePropertyArray  resourceresolversearchpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolvermanglenamespaces();

	/*! \brief Set 
	 */
	void setResourceresolvermanglenamespaces(ConfigNodePropertyBoolean  resourceresolvermanglenamespaces);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverallowDirect();

	/*! \brief Set 
	 */
	void setResourceresolverallowDirect(ConfigNodePropertyBoolean  resourceresolverallowDirect);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolverrequiredproviders();

	/*! \brief Set 
	 */
	void setResourceresolverrequiredproviders(ConfigNodePropertyArray  resourceresolverrequiredproviders);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolverrequiredprovidernames();

	/*! \brief Set 
	 */
	void setResourceresolverrequiredprovidernames(ConfigNodePropertyArray  resourceresolverrequiredprovidernames);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvervirtual();

	/*! \brief Set 
	 */
	void setResourceresolvervirtual(ConfigNodePropertyArray  resourceresolvervirtual);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvermapping();

	/*! \brief Set 
	 */
	void setResourceresolvermapping(ConfigNodePropertyArray  resourceresolvermapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getResourceresolvermaplocation();

	/*! \brief Set 
	 */
	void setResourceresolvermaplocation(ConfigNodePropertyString  resourceresolvermaplocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvermapobservation();

	/*! \brief Set 
	 */
	void setResourceresolvermapobservation(ConfigNodePropertyArray  resourceresolvermapobservation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResourceresolverdefaultvanityredirectstatus();

	/*! \brief Set 
	 */
	void setResourceresolverdefaultvanityredirectstatus(ConfigNodePropertyInteger  resourceresolverdefaultvanityredirectstatus);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverenablevanitypath();

	/*! \brief Set 
	 */
	void setResourceresolverenablevanitypath(ConfigNodePropertyBoolean  resourceresolverenablevanitypath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResourceresolvervanitypathmaxEntries();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathmaxEntries(ConfigNodePropertyInteger  resourceresolvervanitypathmaxEntries);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolvervanitypathmaxEntriesstartup();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathmaxEntriesstartup(ConfigNodePropertyBoolean  resourceresolvervanitypathmaxEntriesstartup);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResourceresolvervanitypathbloomfiltermaxBytes();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathbloomfiltermaxBytes(ConfigNodePropertyInteger  resourceresolvervanitypathbloomfiltermaxBytes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolveroptimizealiasresolution();

	/*! \brief Set 
	 */
	void setResourceresolveroptimizealiasresolution(ConfigNodePropertyBoolean  resourceresolveroptimizealiasresolution);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvervanitypathwhitelist();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathwhitelist(ConfigNodePropertyArray  resourceresolvervanitypathwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvervanitypathblacklist();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathblacklist(ConfigNodePropertyArray  resourceresolvervanitypathblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolvervanityprecedence();

	/*! \brief Set 
	 */
	void setResourceresolvervanityprecedence(ConfigNodePropertyBoolean  resourceresolvervanityprecedence);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverproviderhandlingparanoid();

	/*! \brief Set 
	 */
	void setResourceresolverproviderhandlingparanoid(ConfigNodePropertyBoolean  resourceresolverproviderhandlingparanoid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverlogclosing();

	/*! \brief Set 
	 */
	void setResourceresolverlogclosing(ConfigNodePropertyBoolean  resourceresolverlogclosing);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverlogunclosed();

	/*! \brief Set 
	 */
	void setResourceresolverlogunclosed(ConfigNodePropertyBoolean  resourceresolverlogunclosed);

private:
	ConfigNodePropertyArray resourceresolversearchpath;
	ConfigNodePropertyBoolean resourceresolvermanglenamespaces;
	ConfigNodePropertyBoolean resourceresolverallowDirect;
	ConfigNodePropertyArray resourceresolverrequiredproviders;
	ConfigNodePropertyArray resourceresolverrequiredprovidernames;
	ConfigNodePropertyArray resourceresolvervirtual;
	ConfigNodePropertyArray resourceresolvermapping;
	ConfigNodePropertyString resourceresolvermaplocation;
	ConfigNodePropertyArray resourceresolvermapobservation;
	ConfigNodePropertyInteger resourceresolverdefaultvanityredirectstatus;
	ConfigNodePropertyBoolean resourceresolverenablevanitypath;
	ConfigNodePropertyInteger resourceresolvervanitypathmaxEntries;
	ConfigNodePropertyBoolean resourceresolvervanitypathmaxEntriesstartup;
	ConfigNodePropertyInteger resourceresolvervanitypathbloomfiltermaxBytes;
	ConfigNodePropertyBoolean resourceresolveroptimizealiasresolution;
	ConfigNodePropertyArray resourceresolvervanitypathwhitelist;
	ConfigNodePropertyArray resourceresolvervanitypathblacklist;
	ConfigNodePropertyBoolean resourceresolvervanityprecedence;
	ConfigNodePropertyBoolean resourceresolverproviderhandlingparanoid;
	ConfigNodePropertyBoolean resourceresolverlogclosing;
	ConfigNodePropertyBoolean resourceresolverlogunclosed;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_ */
