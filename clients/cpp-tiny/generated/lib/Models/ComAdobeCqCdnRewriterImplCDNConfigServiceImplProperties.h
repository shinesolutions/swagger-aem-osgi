
/*
 * ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties();
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getCdnconfigdistributiondomain();

	/*! \brief Set 
	 */
	void setCdnconfigdistributiondomain(ConfigNodePropertyString cdnconfigdistributiondomain);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCdnconfigenablerewriting();

	/*! \brief Set 
	 */
	void setCdnconfigenablerewriting(ConfigNodePropertyBoolean cdnconfigenablerewriting);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCdnconfigpathprefixes();

	/*! \brief Set 
	 */
	void setCdnconfigpathprefixes(ConfigNodePropertyArray cdnconfigpathprefixes);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCdnconfigcdnttl();

	/*! \brief Set 
	 */
	void setCdnconfigcdnttl(ConfigNodePropertyInteger cdnconfigcdnttl);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCdnconfigapplicationprotocol();

	/*! \brief Set 
	 */
	void setCdnconfigapplicationprotocol(ConfigNodePropertyString cdnconfigapplicationprotocol);


    private:
    ConfigNodePropertyString cdnconfigdistributiondomain;
    ConfigNodePropertyBoolean cdnconfigenablerewriting;
    ConfigNodePropertyArray cdnconfigpathprefixes;
    ConfigNodePropertyInteger cdnconfigcdnttl;
    ConfigNodePropertyString cdnconfigapplicationprotocol;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties_H_ */
