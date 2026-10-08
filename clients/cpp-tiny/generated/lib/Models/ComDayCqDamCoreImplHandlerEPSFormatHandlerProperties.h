
/*
 * ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties();
    ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMimetype();

	/*! \brief Set 
	 */
	void setMimetype(ConfigNodePropertyString mimetype);


    private:
    ConfigNodePropertyString mimetype;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerEPSFormatHandlerProperties_H_ */
