
/*
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties();
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsermapping();

	/*! \brief Set 
	 */
	void setUsermapping(ConfigNodePropertyArray usermapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getUserdefault();

	/*! \brief Set 
	 */
	void setUserdefault(ConfigNodePropertyString userdefault);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getUserenabledefaultmapping();

	/*! \brief Set 
	 */
	void setUserenabledefaultmapping(ConfigNodePropertyBoolean userenabledefaultmapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRequirevalidation();

	/*! \brief Set 
	 */
	void setRequirevalidation(ConfigNodePropertyBoolean requirevalidation);


    private:
    ConfigNodePropertyArray usermapping;
    ConfigNodePropertyString userdefault;
    ConfigNodePropertyBoolean userenabledefaultmapping;
    ConfigNodePropertyBoolean requirevalidation;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties_H_ */
