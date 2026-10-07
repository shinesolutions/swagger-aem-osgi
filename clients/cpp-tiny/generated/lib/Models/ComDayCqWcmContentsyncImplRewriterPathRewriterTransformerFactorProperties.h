
/*
 * ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties_H_
#define TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties();
    ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcontentsyncpathrewritertransformermappinglinks();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformermappinglinks(ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappinglinks);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcontentsyncpathrewritertransformermappingclientlibs();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformermappingclientlibs(ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingclientlibs);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcontentsyncpathrewritertransformermappingimages();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformermappingimages(ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingimages);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcontentsyncpathrewritertransformerattributepattern();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformerattributepattern(ConfigNodePropertyString cqcontentsyncpathrewritertransformerattributepattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcontentsyncpathrewritertransformerclientlibrarypattern();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformerclientlibrarypattern(ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibrarypattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcontentsyncpathrewritertransformerclientlibraryreplace();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformerclientlibraryreplace(ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibraryreplace);


    private:
    ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappinglinks;
    ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingclientlibs;
    ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingimages;
    ConfigNodePropertyString cqcontentsyncpathrewritertransformerattributepattern;
    ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibrarypattern;
    ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibraryreplace;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties_H_ */
