
/*
 * ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties();
    ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getIllegalCharMapping();

	/*! \brief Set 
	 */
	void setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getPageSubTreeActivationCheck();

	/*! \brief Set 
	 */
	void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck);


    private:
    ConfigNodePropertyString illegalCharMapping;
    ConfigNodePropertyBoolean pageSubTreeActivationCheck;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties_H_ */
