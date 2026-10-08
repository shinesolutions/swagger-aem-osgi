
/*
 * ComDayCqTaggingImplJcrTagManagerFactoryImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqTaggingImplJcrTagManagerFactoryImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqTaggingImplJcrTagManagerFactoryImplProperties_H_


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

class ComDayCqTaggingImplJcrTagManagerFactoryImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqTaggingImplJcrTagManagerFactoryImplProperties();
    ComDayCqTaggingImplJcrTagManagerFactoryImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqTaggingImplJcrTagManagerFactoryImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getValidationenabled();

	/*! \brief Set 
	 */
	void setValidationenabled(ConfigNodePropertyBoolean validationenabled);


    private:
    ConfigNodePropertyBoolean validationenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqTaggingImplJcrTagManagerFactoryImplProperties_H_ */
