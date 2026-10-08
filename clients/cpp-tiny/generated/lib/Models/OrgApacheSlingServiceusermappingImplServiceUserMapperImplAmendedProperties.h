
/*
 * OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties_H_
#define TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties{
public:

    /*! \brief Constructor.
	 */
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties();
    OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getUsermapping();

	/*! \brief Set 
	 */
	void setUsermapping(ConfigNodePropertyArray usermapping);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyArray usermapping;
};
}

#endif /* TINY_CPP_CLIENT_OrgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties_H_ */
