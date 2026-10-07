
/*
 * OrgApacheSlingJmxProviderImplJMXResourceProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJmxProviderImplJMXResourceProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJmxProviderImplJMXResourceProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingJmxProviderImplJMXResourceProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJmxProviderImplJMXResourceProviderProperties();
    OrgApacheSlingJmxProviderImplJMXResourceProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJmxProviderImplJMXResourceProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getProviderroots();

	/*! \brief Set 
	 */
	void setProviderroots(ConfigNodePropertyString providerroots);


    private:
    ConfigNodePropertyString providerroots;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJmxProviderImplJMXResourceProviderProperties_H_ */
