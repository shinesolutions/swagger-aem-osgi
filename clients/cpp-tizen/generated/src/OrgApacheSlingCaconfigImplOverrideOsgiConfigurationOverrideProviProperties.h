/*
 * OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties_H_
#define _OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties_H_


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

class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties();
	OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getDescription();

	/*! \brief Set 
	 */
	void setDescription(ConfigNodePropertyString  description);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getOverrides();

	/*! \brief Set 
	 */
	void setOverrides(ConfigNodePropertyArray  overrides);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean  enabled);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);

private:
	ConfigNodePropertyString description;
	ConfigNodePropertyArray overrides;
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties_H_ */
