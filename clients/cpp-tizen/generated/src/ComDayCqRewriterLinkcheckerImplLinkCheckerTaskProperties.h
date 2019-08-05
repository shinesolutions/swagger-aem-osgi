/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.h
 *
 * 
 */

#ifndef _ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties_H_
#define _ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties_H_


#include <string>
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties();
	ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getSchedulerperiod();

	/*! \brief Set 
	 */
	void setSchedulerperiod(ConfigNodePropertyInteger  schedulerperiod);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getSchedulerconcurrent();

	/*! \brief Set 
	 */
	void setSchedulerconcurrent(ConfigNodePropertyBoolean  schedulerconcurrent);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getGoodLinkTestInterval();

	/*! \brief Set 
	 */
	void setGoodLinkTestInterval(ConfigNodePropertyInteger  good_link_test_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getBadLinkTestInterval();

	/*! \brief Set 
	 */
	void setBadLinkTestInterval(ConfigNodePropertyInteger  bad_link_test_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLinkUnusedInterval();

	/*! \brief Set 
	 */
	void setLinkUnusedInterval(ConfigNodePropertyInteger  link_unused_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConnectiontimeout();

	/*! \brief Set 
	 */
	void setConnectiontimeout(ConfigNodePropertyInteger  connectiontimeout);

private:
	ConfigNodePropertyInteger schedulerperiod;
	ConfigNodePropertyBoolean schedulerconcurrent;
	ConfigNodePropertyInteger good_link_test_interval;
	ConfigNodePropertyInteger bad_link_test_interval;
	ConfigNodePropertyInteger link_unused_interval;
	ConfigNodePropertyInteger connectiontimeout;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties_H_ */
