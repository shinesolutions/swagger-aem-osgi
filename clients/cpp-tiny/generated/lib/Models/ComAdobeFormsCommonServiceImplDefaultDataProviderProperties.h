
/*
 * ComAdobeFormsCommonServiceImplDefaultDataProviderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeFormsCommonServiceImplDefaultDataProviderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeFormsCommonServiceImplDefaultDataProviderProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeFormsCommonServiceImplDefaultDataProviderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties();
    ComAdobeFormsCommonServiceImplDefaultDataProviderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeFormsCommonServiceImplDefaultDataProviderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getAlloweddataFileLocations();

	/*! \brief Set 
	 */
	void setAlloweddataFileLocations(ConfigNodePropertyArray alloweddataFileLocations);


    private:
    ConfigNodePropertyArray alloweddataFileLocations;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeFormsCommonServiceImplDefaultDataProviderProperties_H_ */
