/*
 * ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties.h
 *
 * 
 */

#ifndef _ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties_H_
#define _ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyString.h"
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

class ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties();
	ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcontentsyncpathrewritertransformermappinglinks();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformermappinglinks(ConfigNodePropertyArray  cqcontentsyncpathrewritertransformermappinglinks);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcontentsyncpathrewritertransformermappingclientlibs();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformermappingclientlibs(ConfigNodePropertyArray  cqcontentsyncpathrewritertransformermappingclientlibs);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCqcontentsyncpathrewritertransformermappingimages();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformermappingimages(ConfigNodePropertyArray  cqcontentsyncpathrewritertransformermappingimages);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcontentsyncpathrewritertransformerattributepattern();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformerattributepattern(ConfigNodePropertyString  cqcontentsyncpathrewritertransformerattributepattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcontentsyncpathrewritertransformerclientlibrarypattern();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformerclientlibrarypattern(ConfigNodePropertyString  cqcontentsyncpathrewritertransformerclientlibrarypattern);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCqcontentsyncpathrewritertransformerclientlibraryreplace();

	/*! \brief Set 
	 */
	void setCqcontentsyncpathrewritertransformerclientlibraryreplace(ConfigNodePropertyString  cqcontentsyncpathrewritertransformerclientlibraryreplace);

private:
	ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappinglinks;
	ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingclientlibs;
	ConfigNodePropertyArray cqcontentsyncpathrewritertransformermappingimages;
	ConfigNodePropertyString cqcontentsyncpathrewritertransformerattributepattern;
	ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibrarypattern;
	ConfigNodePropertyString cqcontentsyncpathrewritertransformerclientlibraryreplace;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties_H_ */
