
/*
 * ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties_H_
#define TINY_CPP_CLIENT_ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyBoolean.h"
#include "ConfigNodePropertyInteger.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
    ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrzktimeout();

	/*! \brief Set 
	 */
	void setSolrzktimeout(ConfigNodePropertyString solrzktimeout);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getSolrcommit();

	/*! \brief Set 
	 */
	void setSolrcommit(ConfigNodePropertyString solrcommit);
	/*! \brief Get 
	 */
	ConfigNodePropertyBoolean getCacheon();

	/*! \brief Set 
	 */
	void setCacheon(ConfigNodePropertyBoolean cacheon);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getConcurrencylevel();

	/*! \brief Set 
	 */
	void setConcurrencylevel(ConfigNodePropertyInteger concurrencylevel);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachestartsize();

	/*! \brief Set 
	 */
	void setCachestartsize(ConfigNodePropertyInteger cachestartsize);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachettl();

	/*! \brief Set 
	 */
	void setCachettl(ConfigNodePropertyInteger cachettl);
	/*! \brief Get 
	 */
	ConfigNodePropertyInteger getCachesize();

	/*! \brief Set 
	 */
	void setCachesize(ConfigNodePropertyInteger cachesize);


    private:
    ConfigNodePropertyString solrzktimeout;
    ConfigNodePropertyString solrcommit;
    ConfigNodePropertyBoolean cacheon;
    ConfigNodePropertyInteger concurrencylevel;
    ConfigNodePropertyInteger cachestartsize;
    ConfigNodePropertyInteger cachettl;
    ConfigNodePropertyInteger cachesize;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties_H_ */
