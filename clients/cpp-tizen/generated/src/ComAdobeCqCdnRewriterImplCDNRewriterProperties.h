/*
 * ComAdobeCqCdnRewriterImplCDNRewriterProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCdnRewriterImplCDNRewriterProperties_H_
#define _ComAdobeCqCdnRewriterImplCDNRewriterProperties_H_


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

class ComAdobeCqCdnRewriterImplCDNRewriterProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCdnRewriterImplCDNRewriterProperties();
	ComAdobeCqCdnRewriterImplCDNRewriterProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCdnRewriterImplCDNRewriterProperties();

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
	ConfigNodePropertyArray cdnrewriterattributes;
	ConfigNodePropertyString cdnrewriterdistributiondomain;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCdnRewriterImplCDNRewriterProperties_H_ */
