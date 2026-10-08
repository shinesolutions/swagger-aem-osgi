
/*
 * OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties();
    OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties();


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
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyInteger serviceranking;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplOverrideSystemPropertyConfigurationOveProperties_H_ */
