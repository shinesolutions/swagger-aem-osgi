
/*
 * ComDayCqDamCoreImplLightboxLightboxServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplLightboxLightboxServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplLightboxLightboxServletProperties_H_


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

class ComDayCqDamCoreImplLightboxLightboxServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplLightboxLightboxServletProperties();
    ComDayCqDamCoreImplLightboxLightboxServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplLightboxLightboxServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSlingservletpaths();

	/*! \brief Set 
	 */
	void setSlingservletpaths(ConfigNodePropertyString slingservletpaths);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getSlingservletmethods();

	/*! \brief Set 
	 */
	void setSlingservletmethods(ConfigNodePropertyArray slingservletmethods);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCqdamenableanonymous();

	/*! \brief Set 
	 */
	void setCqdamenableanonymous(ConfigNodePropertyBoolean cqdamenableanonymous);


    private:
    ConfigNodePropertyString slingservletpaths;
    ConfigNodePropertyArray slingservletmethods;
    ConfigNodePropertyBoolean cqdamenableanonymous;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplLightboxLightboxServletProperties_H_ */
