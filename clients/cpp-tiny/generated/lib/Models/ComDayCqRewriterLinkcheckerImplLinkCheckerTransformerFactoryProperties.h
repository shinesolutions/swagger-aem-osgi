
/*
 * ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties_H_
#define TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties_H_


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

class ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties();
    ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerdisableRewriting();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerdisableRewriting(ConfigNodePropertyBoolean linkcheckertransformerdisableRewriting);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerdisableChecking();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerdisableChecking(ConfigNodePropertyBoolean linkcheckertransformerdisableChecking);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getLinkcheckertransformermapCacheSize();

	/*! \brief Set 
	 */
	void setLinkcheckertransformermapCacheSize(ConfigNodePropertyInteger linkcheckertransformermapCacheSize);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerstrictExtensionCheck();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerstrictExtensionCheck(ConfigNodePropertyBoolean linkcheckertransformerstrictExtensionCheck);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getLinkcheckertransformerstripHtmltExtension();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerstripHtmltExtension(ConfigNodePropertyBoolean linkcheckertransformerstripHtmltExtension);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLinkcheckertransformerrewriteElements();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerrewriteElements(ConfigNodePropertyArray linkcheckertransformerrewriteElements);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getLinkcheckertransformerstripExtensionPathBlacklist();

	/*! \brief Set 
	 */
	void setLinkcheckertransformerstripExtensionPathBlacklist(ConfigNodePropertyArray linkcheckertransformerstripExtensionPathBlacklist);


    private:
    ConfigNodePropertyBoolean linkcheckertransformerdisableRewriting;
    ConfigNodePropertyBoolean linkcheckertransformerdisableChecking;
    ConfigNodePropertyInteger linkcheckertransformermapCacheSize;
    ConfigNodePropertyBoolean linkcheckertransformerstrictExtensionCheck;
    ConfigNodePropertyBoolean linkcheckertransformerstripHtmltExtension;
    ConfigNodePropertyArray linkcheckertransformerrewriteElements;
    ConfigNodePropertyArray linkcheckertransformerstripExtensionPathBlacklist;
};
}

#endif /* TINY_CPP_CLIENT_ComDayCqRewriterLinkcheckerImplLinkCheckerTransformerFactoryProperties_H_ */
