
/*
 * ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties_H_


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

class ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties();
    ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getXmphandlercqformats();

	/*! \brief Set 
	 */
	void setXmphandlercqformats(ConfigNodePropertyArray xmphandlercqformats);


    private:
    ConfigNodePropertyArray xmphandlercqformats;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties_H_ */
