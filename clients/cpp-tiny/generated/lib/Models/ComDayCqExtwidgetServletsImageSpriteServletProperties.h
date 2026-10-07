
/*
 * ComDayCqExtwidgetServletsImageSpriteServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqExtwidgetServletsImageSpriteServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqExtwidgetServletsImageSpriteServletProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqExtwidgetServletsImageSpriteServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqExtwidgetServletsImageSpriteServletProperties();
    ComDayCqExtwidgetServletsImageSpriteServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqExtwidgetServletsImageSpriteServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxWidth();

	/*! \brief Set 
	 */
	void setMaxWidth(ConfigNodePropertyInteger maxWidth);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getMaxHeight();

	/*! \brief Set 
	 */
	void setMaxHeight(ConfigNodePropertyInteger maxHeight);


    private:
    ConfigNodePropertyInteger maxWidth;
    ConfigNodePropertyInteger maxHeight;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqExtwidgetServletsImageSpriteServletProperties_H_ */
