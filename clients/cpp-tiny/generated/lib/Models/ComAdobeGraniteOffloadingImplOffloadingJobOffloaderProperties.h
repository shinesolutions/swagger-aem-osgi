
/*
 * ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties_H_


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

class ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties();
    ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingoffloaderenabled();

	/*! \brief Set 
	 */
	void setOffloadingoffloaderenabled(ConfigNodePropertyBoolean offloadingoffloaderenabled);


    private:
    ConfigNodePropertyBoolean offloadingoffloaderenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingJobOffloaderProperties_H_ */
