
/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_
#define TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties();
    ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties();


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
	ConfigNodePropertyInteger getServicebadLinkToleranceInterval();

	/*! \brief Set 
	 */
	void setServicebadLinkToleranceInterval(ConfigNodePropertyInteger servicebad_link_tolerance_interval);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServicecheckOverridePatterns();

	/*! \brief Set 
	 */
	void setServicecheckOverridePatterns(ConfigNodePropertyArray servicecheck_override_patterns);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getServicecacheBrokenInternalLinks();

	/*! \brief Set 
	 */
	void setServicecacheBrokenInternalLinks(ConfigNodePropertyBoolean servicecache_broken_internal_links);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServicespecialLinkPrefix();

	/*! \brief Set 
	 */
	void setServicespecialLinkPrefix(ConfigNodePropertyArray servicespecial_link_prefix);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getServicespecialLinkPatterns();

	/*! \brief Set 
	 */
	void setServicespecialLinkPatterns(ConfigNodePropertyArray servicespecial_link_patterns);


    private:
    ConfigNodePropertyInteger schedulerperiod;
    ConfigNodePropertyBoolean schedulerconcurrent;
    ConfigNodePropertyInteger servicebad_link_tolerance_interval;
    ConfigNodePropertyArray servicecheck_override_patterns;
    ConfigNodePropertyBoolean servicecache_broken_internal_links;
    ConfigNodePropertyArray servicespecial_link_prefix;
    ConfigNodePropertyArray servicespecial_link_patterns;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties_H_ */
