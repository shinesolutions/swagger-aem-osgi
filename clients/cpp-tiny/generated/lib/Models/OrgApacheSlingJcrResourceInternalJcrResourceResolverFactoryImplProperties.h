
/*
 * OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties();
    OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolversearchpath();

	/*! \brief Set 
	 */
	void setResourceresolversearchpath(ConfigNodePropertyArray resourceresolversearchpath);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolvermanglenamespaces();

	/*! \brief Set 
	 */
	void setResourceresolvermanglenamespaces(ConfigNodePropertyBoolean resourceresolvermanglenamespaces);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverallowDirect();

	/*! \brief Set 
	 */
	void setResourceresolverallowDirect(ConfigNodePropertyBoolean resourceresolverallowDirect);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolverrequiredproviders();

	/*! \brief Set 
	 */
	void setResourceresolverrequiredproviders(ConfigNodePropertyArray resourceresolverrequiredproviders);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolverrequiredprovidernames();

	/*! \brief Set 
	 */
	void setResourceresolverrequiredprovidernames(ConfigNodePropertyArray resourceresolverrequiredprovidernames);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvervirtual();

	/*! \brief Set 
	 */
	void setResourceresolvervirtual(ConfigNodePropertyArray resourceresolvervirtual);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvermapping();

	/*! \brief Set 
	 */
	void setResourceresolvermapping(ConfigNodePropertyArray resourceresolvermapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getResourceresolvermaplocation();

	/*! \brief Set 
	 */
	void setResourceresolvermaplocation(ConfigNodePropertyString resourceresolvermaplocation);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvermapobservation();

	/*! \brief Set 
	 */
	void setResourceresolvermapobservation(ConfigNodePropertyArray resourceresolvermapobservation);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResourceresolverdefaultvanityredirectstatus();

	/*! \brief Set 
	 */
	void setResourceresolverdefaultvanityredirectstatus(ConfigNodePropertyInteger resourceresolverdefaultvanityredirectstatus);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverenablevanitypath();

	/*! \brief Set 
	 */
	void setResourceresolverenablevanitypath(ConfigNodePropertyBoolean resourceresolverenablevanitypath);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResourceresolvervanitypathmaxEntries();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathmaxEntries(ConfigNodePropertyInteger resourceresolvervanitypathmaxEntries);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolvervanitypathmaxEntriesstartup();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathmaxEntriesstartup(ConfigNodePropertyBoolean resourceresolvervanitypathmaxEntriesstartup);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getResourceresolvervanitypathbloomfiltermaxBytes();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathbloomfiltermaxBytes(ConfigNodePropertyInteger resourceresolvervanitypathbloomfiltermaxBytes);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolveroptimizealiasresolution();

	/*! \brief Set 
	 */
	void setResourceresolveroptimizealiasresolution(ConfigNodePropertyBoolean resourceresolveroptimizealiasresolution);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvervanitypathwhitelist();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathwhitelist(ConfigNodePropertyArray resourceresolvervanitypathwhitelist);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getResourceresolvervanitypathblacklist();

	/*! \brief Set 
	 */
	void setResourceresolvervanitypathblacklist(ConfigNodePropertyArray resourceresolvervanitypathblacklist);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolvervanityprecedence();

	/*! \brief Set 
	 */
	void setResourceresolvervanityprecedence(ConfigNodePropertyBoolean resourceresolvervanityprecedence);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverproviderhandlingparanoid();

	/*! \brief Set 
	 */
	void setResourceresolverproviderhandlingparanoid(ConfigNodePropertyBoolean resourceresolverproviderhandlingparanoid);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverlogclosing();

	/*! \brief Set 
	 */
	void setResourceresolverlogclosing(ConfigNodePropertyBoolean resourceresolverlogclosing);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getResourceresolverlogunclosed();

	/*! \brief Set 
	 */
	void setResourceresolverlogunclosed(ConfigNodePropertyBoolean resourceresolverlogunclosed);


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
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrResourceInternalJcrResourceResolverFactoryImplProperties_H_ */
