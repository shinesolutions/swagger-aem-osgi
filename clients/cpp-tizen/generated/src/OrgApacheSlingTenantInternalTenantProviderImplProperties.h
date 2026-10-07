/*
 * OrgApacheSlingTenantInternalTenantProviderImplProperties.h
 *
 * 
 */

#ifndef _OrgApacheSlingTenantInternalTenantProviderImplProperties_H_
#define _OrgApacheSlingTenantInternalTenantProviderImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class OrgApacheSlingTenantInternalTenantProviderImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	OrgApacheSlingTenantInternalTenantProviderImplProperties();
	OrgApacheSlingTenantInternalTenantProviderImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrgApacheSlingTenantInternalTenantProviderImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTenantroot();

	/*! \brief Set 
	 */
	void setTenantroot(ConfigNodePropertyString  tenantroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTenantpathmatcher();

	/*! \brief Set 
	 */
	void setTenantpathmatcher(ConfigNodePropertyArray  tenantpathmatcher);

private:
	ConfigNodePropertyString tenantroot;
	ConfigNodePropertyArray tenantpathmatcher;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrgApacheSlingTenantInternalTenantProviderImplProperties_H_ */
