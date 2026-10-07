/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.h
 *
 * 
 */

#ifndef _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties_H_
#define _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties_H_


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

class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties();
	ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerdisableRewriting();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerdisableRewriting(ConfigNodePropertyBoolean  linkcheckertransformerdisableRewriting);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerdisableChecking();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerdisableChecking(ConfigNodePropertyBoolean  linkcheckertransformerdisableChecking);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLinkcheckertransformermapCacheSize();

	/*! \brief Set 
	 */
	void setLinkcheckertransformermapCacheSize(ConfigNodePropertyInteger  linkcheckertransformermapCacheSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerstrictExtensionCheck();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerstrictExtensionCheck(ConfigNodePropertyBoolean  linkcheckertransformerstrictExtensionCheck);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerstripHtmltExtension();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerstripHtmltExtension(ConfigNodePropertyBoolean  linkcheckertransformerstripHtmltExtension);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLinkcheckertransformerrewriteElements();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerrewriteElements(ConfigNodePropertyArray  linkcheckertransformerrewriteElements);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLinkcheckertransformerstripExtensionPathBlacklist();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerstripExtensionPathBlacklist(ConfigNodePropertyArray  linkcheckertransformerstripExtensionPathBlacklist);

private:
	ConfigNodePropertyBoolean linkcheckertransformerdisableRewriting;
	ConfigNodePropertyBoolean linkcheckertransformerdisableChecking;
	ConfigNodePropertyInteger linkcheckertransformermapCacheSize;
	ConfigNodePropertyBoolean linkcheckertransformerstrictExtensionCheck;
	ConfigNodePropertyBoolean linkcheckertransformerstripHtmltExtension;
	ConfigNodePropertyArray linkcheckertransformerrewriteElements;
	ConfigNodePropertyArray linkcheckertransformerstripExtensionPathBlacklist;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties_H_ */
