/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h
 *
 * 
 */

#ifndef _ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_
#define _ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
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

class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties();
	ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties();

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
	ConfigNodePropertyInteger getServicebadLinkToleranceInterval();

	/*! \brief Set 
	 */
	void setServicebadLinkToleranceInterval(ConfigNodePropertyInteger  servicebad_link_tolerance_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServicecheckOverridePatterns();

	/*! \brief Set 
	 */
	void setServicecheckOverridePatterns(ConfigNodePropertyArray  servicecheck_override_patterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServicecacheBrokenInternalLinks();

	/*! \brief Set 
	 */
	void setServicecacheBrokenInternalLinks(ConfigNodePropertyBoolean  servicecache_broken_internal_links);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServicespecialLinkPrefix();

	/*! \brief Set 
	 */
	void setServicespecialLinkPrefix(ConfigNodePropertyArray  servicespecial_link_prefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServicespecialLinkPatterns();

	/*! \brief Set 
	 */
	void setServicespecialLinkPatterns(ConfigNodePropertyArray  servicespecial_link_patterns);

private:
	ConfigNodePropertyInteger schedulerperiod;
	ConfigNodePropertyBoolean schedulerconcurrent;
	ConfigNodePropertyInteger servicebad_link_tolerance_interval;
	ConfigNodePropertyArray servicecheck_override_patterns;
	ConfigNodePropertyBoolean servicecache_broken_internal_links;
	ConfigNodePropertyArray servicespecial_link_prefix;
	ConfigNodePropertyArray servicespecial_link_patterns;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_ */
