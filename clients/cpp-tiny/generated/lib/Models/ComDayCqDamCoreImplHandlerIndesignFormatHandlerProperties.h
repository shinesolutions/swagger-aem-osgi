
/*
 * ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties();
    ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getMimetype();

	/*! \brief Set 
	 */
	void setMimetype(ConfigNodePropertyArray mimetype);


    private:
    ConfigNodePropertyArray mimetype;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerIndesignFormatHandlerProperties_H_ */
