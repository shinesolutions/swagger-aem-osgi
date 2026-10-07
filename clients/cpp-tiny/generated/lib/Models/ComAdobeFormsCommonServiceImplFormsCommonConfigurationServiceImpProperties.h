
/*
 * ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties_H_
#define TINY_CPP_CLIENT_ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyDropDown.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties();
    ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyDropDown getTempStorageConfig();

	/*! \brief Set 
	 */
	void setTempStorageConfig(ConfigNodePropertyDropDown tempStorageConfig);


    private:
    ConfigNodePropertyDropDown tempStorageConfig;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeFormsCommonServiceImplFormsCommonConfigurationServiceImpProperties_H_ */
