/*
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.h
 *
 * 
 */

#ifndef _OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties_H_
#define _OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyDropDown.h"
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

class OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
	OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathdescfield();

	/*! \brief Set 
	 */
	void setPathdescfield(ConfigNodePropertyString  pathdescfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathchildfield();

	/*! \brief Set 
	 */
	void setPathchildfield(ConfigNodePropertyString  pathchildfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathparentfield();

	/*! \brief Set 
	 */
	void setPathparentfield(ConfigNodePropertyString  pathparentfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathexactfield();

	/*! \brief Set 
	 */
	void setPathexactfield(ConfigNodePropertyString  pathexactfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCatchallfield();

	/*! \brief Set 
	 */
	void setCatchallfield(ConfigNodePropertyString  catchallfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCollapsedpathfield();

	/*! \brief Set 
	 */
	void setCollapsedpathfield(ConfigNodePropertyString  collapsedpathfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPathdepthfield();

	/*! \brief Set 
	 */
	void setPathdepthfield(ConfigNodePropertyString  pathdepthfield);
	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getCommitpolicy();

	/*! \brief Set 
	 */
	void setCommitpolicy(ConfigNodePropertyDropDown  commitpolicy);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getRows();

	/*! \brief Set 
	 */
	void setRows(ConfigNodePropertyInteger  rows);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPathrestrictions();

	/*! \brief Set 
	 */
	void setPathrestrictions(ConfigNodePropertyBoolean  pathrestrictions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPropertyrestrictions();

	/*! \brief Set 
	 */
	void setPropertyrestrictions(ConfigNodePropertyBoolean  propertyrestrictions);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPrimarytypesrestrictions();

	/*! \brief Set 
	 */
	void setPrimarytypesrestrictions(ConfigNodePropertyBoolean  primarytypesrestrictions);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getIgnoredproperties();

	/*! \brief Set 
	 */
	void setIgnoredproperties(ConfigNodePropertyArray  ignoredproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsedproperties();

	/*! \brief Set 
	 */
	void setUsedproperties(ConfigNodePropertyArray  usedproperties);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTypemappings();

	/*! \brief Set 
	 */
	void setTypemappings(ConfigNodePropertyArray  typemappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getPropertymappings();

	/*! \brief Set 
	 */
	void setPropertymappings(ConfigNodePropertyArray  propertymappings);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCollapsejcrcontentnodes();

	/*! \brief Set 
	 */
	void setCollapsejcrcontentnodes(ConfigNodePropertyBoolean  collapsejcrcontentnodes);

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
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties_H_ */
