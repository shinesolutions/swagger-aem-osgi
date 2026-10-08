
/*
 * ComDayCqDamHandlerStandardPsdPsdHandlerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPsdPsdHandlerProperties_H_
#define TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPsdPsdHandlerProperties_H_


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

class ComDayCqDamHandlerStandardPsdPsdHandlerProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties();
    ComDayCqDamHandlerStandardPsdPsdHandlerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqDamHandlerStandardPsdPsdHandlerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLargeFileThreshold();

	/*! \brief Set 
	 */
	void setLargeFileThreshold(ConfigNodePropertyInteger large_file_threshold);


    private:
    ConfigNodePropertyInteger large_file_threshold;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqDamHandlerStandardPsdPsdHandlerProperties_H_ */
