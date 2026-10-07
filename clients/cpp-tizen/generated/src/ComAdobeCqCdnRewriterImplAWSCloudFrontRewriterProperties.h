/*
 * ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties_H_
#define _ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
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

class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties();
	ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger  serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeypairid();

	/*! \brief Set 
	 */
	void setKeypairid(ConfigNodePropertyString  keypairid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeypairalias();

	/*! \brief Set 
	 */
	void setKeypairalias(ConfigNodePropertyString  keypairalias);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCdnrewriterattributes();

	/*! \brief Set 
	 */
	void setCdnrewriterattributes(ConfigNodePropertyArray  cdnrewriterattributes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCdnrewriterdistributiondomain();

	/*! \brief Set 
	 */
	void setCdnrewriterdistributiondomain(ConfigNodePropertyString  cdnrewriterdistributiondomain);

private:
	ConfigNodePropertyInteger serviceranking;
	ConfigNodePropertyString keypairid;
	ConfigNodePropertyString keypairalias;
	ConfigNodePropertyArray cdnrewriterattributes;
	ConfigNodePropertyString cdnrewriterdistributiondomain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties_H_ */
