
/*
 * ComDayCqWcmCoreStatsPageViewStatisticsImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_


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

class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties();
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmCoreStatsPageViewStatisticsImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getPageviewstatisticstrackingurl();

	/*! \brief Set 
	 */
	void setPageviewstatisticstrackingurl(ConfigNodePropertyString pageviewstatisticstrackingurl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getPageviewstatisticstrackingscriptenabled();

	/*! \brief Set 
	 */
	void setPageviewstatisticstrackingscriptenabled(ConfigNodePropertyString pageviewstatisticstrackingscriptenabled);


    private:
    ConfigNodePropertyString pageviewstatisticstrackingurl;
    ConfigNodePropertyString pageviewstatisticstrackingscriptenabled;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmCoreStatsPageViewStatisticsImplProperties_H_ */
