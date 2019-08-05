/*
 * OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties_H_
#define _OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
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

class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties();
	OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	ConfigNodePropertyBoolean enabled;
	ConfigNodePropertyInteger serviceranking;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties_H_ */
