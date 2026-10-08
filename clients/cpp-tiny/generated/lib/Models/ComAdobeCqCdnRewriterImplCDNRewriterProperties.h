
/*
 * ComAdobeCqCdnRewriterImplCDNRewriterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplCDNRewriterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplCDNRewriterProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyArray.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqCdnRewriterImplCDNRewriterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCdnRewriterImplCDNRewriterProperties();
    ComAdobeCqCdnRewriterImplCDNRewriterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCdnRewriterImplCDNRewriterProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getServiceranking();

	/*! \brief Set 
	 */
	void setServiceranking(ConfigNodePropertyInteger serviceranking);
	/*! \brief Get 
	 */
	ConfigNodePropertyArray getCdnrewriterattributes();

	/*! \brief Set 
	 */
	void setCdnrewriterattributes(ConfigNodePropertyArray cdnrewriterattributes);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getCdnrewriterdistributiondomain();

	/*! \brief Set 
	 */
	void setCdnrewriterdistributiondomain(ConfigNodePropertyString cdnrewriterdistributiondomain);


    private:
    ConfigNodePropertyInteger serviceranking;
    ConfigNodePropertyArray cdnrewriterattributes;
    ConfigNodePropertyString cdnrewriterdistributiondomain;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplCDNRewriterProperties_H_ */
