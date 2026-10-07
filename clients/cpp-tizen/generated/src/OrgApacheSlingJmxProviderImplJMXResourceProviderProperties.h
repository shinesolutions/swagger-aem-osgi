/*
 * OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingJmxProviderImplJMXResourceProviderProperties_H_
#define _OrgApacheSlingJmxProviderImplJMXResourceProviderProperties_H_


#include <string>
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

class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingJmxProviderImplJMXResourceProviderProperties();
	OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingJmxProviderImplJMXResourceProviderProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroots();

	/*! \brief Set 
	 */
	void setProviderroots(ConfigNodePropertyString  providerroots);

private:
	ConfigNodePropertyString providerroots;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingJmxProviderImplJMXResourceProviderProperties_H_ */
