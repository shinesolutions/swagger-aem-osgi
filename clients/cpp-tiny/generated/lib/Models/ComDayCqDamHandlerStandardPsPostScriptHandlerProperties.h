
/*
 * ComDayCqDamHandlerStandardPsPostScriptHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPsPostScriptHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPsPostScriptHandlerProperties_H_


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

class ComDayCqDamHandlerStandardPsPostScriptHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties();
    ComDayCqDamHandlerStandardPsPostScriptHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamHandlerStandardPsPostScriptHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getRasterannotation();

	/*! \brief Set 
	 */
	void setRasterannotation(ConfigNodePropertyBoolean rasterannotation);


    private:
    ConfigNodePropertyBoolean rasterannotation;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPsPostScriptHandlerProperties_H_ */
