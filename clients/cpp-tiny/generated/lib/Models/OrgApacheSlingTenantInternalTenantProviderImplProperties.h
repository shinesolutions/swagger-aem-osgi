
/*
 * OrgApacheSlingTenantInternalTenantProviderImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingTenantInternalTenantProviderImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingTenantInternalTenantProviderImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingTenantInternalTenantProviderImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingTenantInternalTenantProviderImplProperties();
    OrgApacheSlingTenantInternalTenantProviderImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingTenantInternalTenantProviderImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTenantroot();

	/*! \brief Set 
	 */
	void setTenantroot(ConfigNodePropertyString tenantroot);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getTenantpathmatcher();

	/*! \brief Set 
	 */
	void setTenantpathmatcher(ConfigNodePropertyArray tenantpathmatcher);


    private:
    ConfigNodePropertyString tenantroot;
    ConfigNodePropertyArray tenantpathmatcher;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingTenantInternalTenantProviderImplProperties_H_ */
