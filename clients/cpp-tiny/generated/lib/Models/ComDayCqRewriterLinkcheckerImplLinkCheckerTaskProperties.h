
/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties_H_
#define TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties();
    ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger schedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean schedulerconcurrent);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGoodLinkTestInterval();

	/*! \brief Set 
	 */
	void setGoodLinkTestInterval(ConfigNodePropertyInteger good_link_test_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBadLinkTestInterval();

	/*! \brief Set 
	 */
	void setBadLinkTestInterval(ConfigNodePropertyInteger bad_link_test_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLinkUnusedInterval();

	/*! \brief Set 
	 */
	void setLinkUnusedInterval(ConfigNodePropertyInteger link_unused_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectiontimeout();

	/*! \brief Set 
	 */
	void setConnectiontimeout(ConfigNodePropertyInteger connectiontimeout);


    private:
    ConfigNodePropertyInteger schedulerperiod;
    ConfigNodePropertyBoolean schedulerconcurrent;
    ConfigNodePropertyInteger good_link_test_interval;
    ConfigNodePropertyInteger bad_link_test_interval;
    ConfigNodePropertyInteger link_unused_interval;
    ConfigNodePropertyInteger connectiontimeout;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties_H_ */
