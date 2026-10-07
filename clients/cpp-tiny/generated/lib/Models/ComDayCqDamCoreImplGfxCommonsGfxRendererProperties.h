
/*
 * ComDayCqDamCoreImplGfxCommonsGfxRendererProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamCoreImplGfxCommonsGfxRendererProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamCoreImplGfxCommonsGfxRendererProperties_H_


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

class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties();
    ComDayCqDamCoreImplGfxCommonsGfxRendererProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamCoreImplGfxCommonsGfxRendererProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSkipbufferedcache();

	/*! \brief Set 
	 */
	void setSkipbufferedcache(ConfigNodePropertyBoolean skipbufferedcache);


    private:
    ConfigNodePropertyBoolean skipbufferedcache;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamCoreImplGfxCommonsGfxRendererProperties_H_ */
