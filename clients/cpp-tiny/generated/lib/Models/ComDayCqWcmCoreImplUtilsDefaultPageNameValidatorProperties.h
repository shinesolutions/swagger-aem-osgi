
/*
 * ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties_H_


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

class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties();
    ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getNonValidChars();

	/*! \brief Set 
	 */
	void setNonValidChars(ConfigNodePropertyString nonValidChars);


    private:
    ConfigNodePropertyString nonValidChars;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties_H_ */
