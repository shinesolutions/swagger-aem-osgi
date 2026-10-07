
/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties_H_
#define TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathdescfield();

	/*! \brief Set 
	 */
	void setPathdescfield(ConfigNodePropertyString pathdescfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathchildfield();

	/*! \brief Set 
	 */
	void setPathchildfield(ConfigNodePropertyString pathchildfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathparentfield();

	/*! \brief Set 
	 */
	void setPathparentfield(ConfigNodePropertyString pathparentfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathexactfield();

	/*! \brief Set 
	 */
	void setPathexactfield(ConfigNodePropertyString pathexactfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCatchallfield();

	/*! \brief Set 
	 */
	void setCatchallfield(ConfigNodePropertyString catchallfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCollapsedpathfield();

	/*! \brief Set 
	 */
	void setCollapsedpathfield(ConfigNodePropertyString collapsedpathfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathdepthfield();

	/*! \brief Set 
	 */
	void setPathdepthfield(ConfigNodePropertyString pathdepthfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getCommitpolicy();

	/*! \brief Set 
	 */
	void setCommitpolicy(ConfigNodePropertyDropDown commitpolicy);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRows();

	/*! \brief Set 
	 */
	void setRows(ConfigNodePropertyInteger rows);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPathrestrictions();

	/*! \brief Set 
	 */
	void setPathrestrictions(ConfigNodePropertyBoolean pathrestrictions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPropertyrestrictions();

	/*! \brief Set 
	 */
	void setPropertyrestrictions(ConfigNodePropertyBoolean propertyrestrictions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPrimarytypesrestrictions();

	/*! \brief Set 
	 */
	void setPrimarytypesrestrictions(ConfigNodePropertyBoolean primarytypesrestrictions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnoredproperties();

	/*! \brief Set 
	 */
	void setIgnoredproperties(ConfigNodePropertyArray ignoredproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsedproperties();

	/*! \brief Set 
	 */
	void setUsedproperties(ConfigNodePropertyArray usedproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTypemappings();

	/*! \brief Set 
	 */
	void setTypemappings(ConfigNodePropertyArray typemappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPropertymappings();

	/*! \brief Set 
	 */
	void setPropertymappings(ConfigNodePropertyArray propertymappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCollapsejcrcontentnodes();

	/*! \brief Set 
	 */
	void setCollapsejcrcontentnodes(ConfigNodePropertyBoolean collapsejcrcontentnodes);


    private:
    ConfigNodePropertyString pathdescfield;
    ConfigNodePropertyString pathchildfield;
    ConfigNodePropertyString pathparentfield;
    ConfigNodePropertyString pathexactfield;
    ConfigNodePropertyString catchallfield;
    ConfigNodePropertyString collapsedpathfield;
    ConfigNodePropertyString pathdepthfield;
    ConfigNodePropertyDropDown commitpolicy;
    ConfigNodePropertyInteger rows;
    ConfigNodePropertyBoolean pathrestrictions;
    ConfigNodePropertyBoolean propertyrestrictions;
    ConfigNodePropertyBoolean primarytypesrestrictions;
    ConfigNodePropertyArray ignoredproperties;
    ConfigNodePropertyArray usedproperties;
    ConfigNodePropertyArray typemappings;
    ConfigNodePropertyArray propertymappings;
    ConfigNodePropertyBoolean collapsejcrcontentnodes;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties_H_ */
