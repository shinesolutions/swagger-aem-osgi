
/*
 * ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties_H_


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

class ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties();
    ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getForcelocation();

	/*! \brief Set 
	 */
	void setForcelocation(ConfigNodePropertyBoolean forcelocation);


    private:
    ConfigNodePropertyBoolean forcelocation;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties_H_ */
