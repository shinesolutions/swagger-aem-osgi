
/*
 * ApacheSlingHealthCheckResultHTMLSerializerProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ApacheSlingHealthCheckResultHTMLSerializerProperties_H_
#define TINY_CPP_CLIENT_ApacheSlingHealthCheckResultHTMLSerializerProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ApacheSlingHealthCheckResultHTMLSerializerProperties{
public:

    /*! \brief Constructor.
	 */
    ApacheSlingHealthCheckResultHTMLSerializerProperties();
    ApacheSlingHealthCheckResultHTMLSerializerProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ApacheSlingHealthCheckResultHTMLSerializerProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getStyleString();

	/*! \brief Set 
	 */
	void setStyleString(ConfigNodePropertyString styleString);


    private:
    ConfigNodePropertyString styleString;
};
}

#endif /* TINY_CPP_CLIENT_ApacheSlingHealthCheckResultHTMLSerializerProperties_H_ */
