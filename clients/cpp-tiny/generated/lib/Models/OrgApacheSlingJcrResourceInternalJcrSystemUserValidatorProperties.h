
/*
 * OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties_H_


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

class OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties();
    OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getAllowonlysystemuser();

	/*! \brief Set 
	 */
	void setAllowonlysystemuser(ConfigNodePropertyBoolean allowonlysystemuser);


    private:
    ConfigNodePropertyBoolean allowonlysystemuser;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingJcrResourceInternalJcrSystemUserValidatorProperties_H_ */
