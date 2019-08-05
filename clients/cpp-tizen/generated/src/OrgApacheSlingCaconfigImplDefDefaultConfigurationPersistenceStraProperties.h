/*
 * OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties_H_
#define _OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
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

class OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties();
	OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties();

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

private:
	ConfigNodePropertyBoolean enabled;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties_H_ */
