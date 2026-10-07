
/*
 * ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties_H_


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

class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties();
    ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamdrmenable();

	/*! \brief Set 
	 */
	void setCqdamdrmenable(ConfigNodePropertyBoolean cqdamdrmenable);


    private:
    ConfigNodePropertyBoolean cqdamdrmenable;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties_H_ */
