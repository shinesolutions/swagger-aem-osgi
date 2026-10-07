
/*
 * OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties();
    OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getEnabled();

	/*! \brief Set 
	 */
	void setEnabled(ConfigNodePropertyBoolean enabled);


    private:
    ConfigNodePropertyBoolean enabled;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplConfigurationBindingsValueProviderProperties_H_ */
