
/*
 * ComAdobeGraniteHttpcacheFileFileCacheStoreProperties.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ComAdobeGraniteHttpcacheFileFileCacheStoreProperties_H_
#define TINY_CPP_CLIENT_ComAdobeGraniteHttpcacheFileFileCacheStoreProperties_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ConfigNodePropertyString.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties{
public:

    /*! \brief Constructor.
	 */
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties();
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ComAdobeGraniteHttpcacheFileFileCacheStoreProperties();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitehttpcachefiledocumentRoot();

	/*! \brief Set 
	 */
	void setComadobegranitehttpcachefiledocumentRoot(ConfigNodePropertyString comadobegranitehttpcachefiledocumentRoot);
	/*! \brief Get 
	 */
	ConfigNodePropertyString getComadobegranitehttpcachefileincludeHost();

	/*! \brief Set 
	 */
	void setComadobegranitehttpcachefileincludeHost(ConfigNodePropertyString comadobegranitehttpcachefileincludeHost);


    private:
    ConfigNodePropertyString comadobegranitehttpcachefiledocumentRoot;
    ConfigNodePropertyString comadobegranitehttpcachefileincludeHost;
};
}

#endif /* TINY_CPP_CLIENT_ComAdobeGraniteHttpcacheFileFileCacheStoreProperties_H_ */
