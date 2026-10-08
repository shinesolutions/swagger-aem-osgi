
/*
 * ComDayCqDamHandlerStandardPdfPdfHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPdfPdfHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPdfPdfHandlerProperties_H_


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

class ComDayCqDamHandlerStandardPdfPdfHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties();
    ComDayCqDamHandlerStandardPdfPdfHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamHandlerStandardPdfPdfHandlerProperties();


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

#endif /* TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPdfPdfHandlerProperties_H_ */
