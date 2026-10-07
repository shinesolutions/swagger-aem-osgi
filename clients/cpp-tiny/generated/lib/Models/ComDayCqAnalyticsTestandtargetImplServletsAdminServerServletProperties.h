
/*
 * ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties_H_
#define TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties_H_


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

class ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties();
    ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getTestandtargetendpointurl();

	/*! \brief Set 
	 */
	void setTestandtargetendpointurl(ConfigNodePropertyString testandtargetendpointurl);


    private:
    ConfigNodePropertyString testandtargetendpointurl;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties_H_ */
