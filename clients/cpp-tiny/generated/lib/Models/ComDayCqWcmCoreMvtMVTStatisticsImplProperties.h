
/*
 * ComDayCqWcmCoreMvtMVTStatisticsImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreMvtMVTStatisticsImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreMvtMVTStatisticsImplProperties_H_


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

class ComDayCqWcmCoreMvtMVTStatisticsImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties();
    ComDayCqWcmCoreMvtMVTStatisticsImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreMvtMVTStatisticsImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getMvtstatisticstrackingurl();

	/*! \brief Set 
	 */
	void setMvtstatisticstrackingurl(ConfigNodePropertyString mvtstatisticstrackingurl);


    private:
    ConfigNodePropertyString mvtstatisticstrackingurl;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreMvtMVTStatisticsImplProperties_H_ */
