
/*
 * ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties_H_


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

class ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties();
    ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getOffloadingjobclonerenabled();

	/*! \brief Set 
	 */
	void setOffloadingjobclonerenabled(ConfigNodePropertyBoolean offloadingjobclonerenabled);


    private:
    ConfigNodePropertyBoolean offloadingjobclonerenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteOffloadingImplOffloadingJobClonerProperties_H_ */
