
/*
 * OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties();
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties();


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
	ConfigNodePropertyArray getConfigPropertyInheritancePropertyNames();

	/*! \brief Set 
	 */
	void setConfigPropertyInheritancePropertyNames(ConfigNodePropertyArray configPropertyInheritancePropertyNames);


    private:
    ConfigNodePropertyBoolean enabled;
    ConfigNodePropertyArray configPropertyInheritancePropertyNames;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties_H_ */
