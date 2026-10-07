/*
 * ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.h
 *
 * 
 */

#ifndef _ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties_H_
#define _ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties_H_


#include <string>
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
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

class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties : public Object {
public:
	/*! \brief Constructor.
	 */
	ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties();
	ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCdnconfigdistributiondomain();

	/*! \brief Set 
	 */
	void setCdnconfigdistributiondomain(ConfigNodePropertyString  cdnconfigdistributiondomain);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCdnconfigenablerewriting();

	/*! \brief Set 
	 */
	void setCdnconfigenablerewriting(ConfigNodePropertyBoolean  cdnconfigenablerewriting);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCdnconfigpathprefixes();

	/*! \brief Set 
	 */
	void setCdnconfigpathprefixes(ConfigNodePropertyArray  cdnconfigpathprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCdnconfigcdnttl();

	/*! \brief Set 
	 */
	void setCdnconfigcdnttl(ConfigNodePropertyInteger  cdnconfigcdnttl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCdnconfigapplicationprotocol();

	/*! \brief Set 
	 */
	void setCdnconfigapplicationprotocol(ConfigNodePropertyString  cdnconfigapplicationprotocol);

private:
	ConfigNodePropertyString cdnconfigdistributiondomain;
	ConfigNodePropertyBoolean cdnconfigenablerewriting;
	ConfigNodePropertyArray cdnconfigpathprefixes;
	ConfigNodePropertyInteger cdnconfigcdnttl;
	ConfigNodePropertyString cdnconfigapplicationprotocol;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties_H_ */
