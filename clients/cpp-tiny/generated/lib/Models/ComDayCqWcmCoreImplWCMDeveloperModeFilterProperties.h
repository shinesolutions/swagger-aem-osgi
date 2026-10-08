
/*
 * ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_


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

class ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();
    ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getWcmdevmodefilterenabled();

	/*! \brief Set 
	 */
	void setWcmdevmodefilterenabled(ConfigNodePropertyBoolean wcmdevmodefilterenabled);


    private:
    ConfigNodePropertyBoolean wcmdevmodefilterenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreImplWCMDeveloperModeFilterProperties_H_ */
