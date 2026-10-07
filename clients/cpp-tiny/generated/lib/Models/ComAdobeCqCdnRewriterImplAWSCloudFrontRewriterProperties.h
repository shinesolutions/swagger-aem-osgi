
/*
 * ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties_H_


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

class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties();
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties();


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
	ConfigNodePropertyString getKeypairid();

	/*! \brief Set 
	 */
	void setKeypairid(ConfigNodePropertyString keypairid);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getKeypairalias();

	/*! \brief Set 
	 */
	void setKeypairalias(ConfigNodePropertyString keypairalias);
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
    ConfigNodePropertyString keypairid;
    ConfigNodePropertyString keypairalias;
    ConfigNodePropertyArray cdnrewriterattributes;
    ConfigNodePropertyString cdnrewriterdistributiondomain;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties_H_ */
