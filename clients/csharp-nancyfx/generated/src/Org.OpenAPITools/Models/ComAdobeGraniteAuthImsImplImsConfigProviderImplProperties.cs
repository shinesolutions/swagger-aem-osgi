using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties
    /// </summary>
    public sealed class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties:  IEquatable<ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties>
    { 
        /// <summary>
        /// OauthConfigmanagerImsConfigid
        /// </summary>
        public ConfigNodePropertyString OauthConfigmanagerImsConfigid { get; private set; }

        /// <summary>
        /// ImsOwningEntity
        /// </summary>
        public ConfigNodePropertyString ImsOwningEntity { get; private set; }

        /// <summary>
        /// AemInstanceId
        /// </summary>
        public ConfigNodePropertyString AemInstanceId { get; private set; }

        /// <summary>
        /// ImsServiceCode
        /// </summary>
        public ConfigNodePropertyString ImsServiceCode { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties()
        {
        }

        private ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(ConfigNodePropertyString OauthConfigmanagerImsConfigid, ConfigNodePropertyString ImsOwningEntity, ConfigNodePropertyString AemInstanceId, ConfigNodePropertyString ImsServiceCode)
        {
            
            this.OauthConfigmanagerImsConfigid = OauthConfigmanagerImsConfigid;
            
            this.ImsOwningEntity = ImsOwningEntity;
            
            this.AemInstanceId = AemInstanceId;
            
            this.ImsServiceCode = ImsServiceCode;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder</returns>
        public static ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder</returns>
        public ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder With()
        {
            return Builder()
                .OauthConfigmanagerImsConfigid(OauthConfigmanagerImsConfigid)
                .ImsOwningEntity(ImsOwningEntity)
                .AemInstanceId(AemInstanceId)
                .ImsServiceCode(ImsServiceCode);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties left, ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties left, ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
        /// </summary>
        public sealed class ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyString _OauthConfigmanagerImsConfigid;
            private ConfigNodePropertyString _ImsOwningEntity;
            private ConfigNodePropertyString _AemInstanceId;
            private ConfigNodePropertyString _ImsServiceCode;

            internal ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.OauthConfigmanagerImsConfigid property.
            /// </summary>
            /// <param name="value">OauthConfigmanagerImsConfigid</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder OauthConfigmanagerImsConfigid(ConfigNodePropertyString value)
            {
                _OauthConfigmanagerImsConfigid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.ImsOwningEntity property.
            /// </summary>
            /// <param name="value">ImsOwningEntity</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder ImsOwningEntity(ConfigNodePropertyString value)
            {
                _ImsOwningEntity = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.AemInstanceId property.
            /// </summary>
            /// <param name="value">AemInstanceId</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder AemInstanceId(ConfigNodePropertyString value)
            {
                _AemInstanceId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.ImsServiceCode property.
            /// </summary>
            /// <param name="value">ImsServiceCode</param>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplPropertiesBuilder ImsServiceCode(ConfigNodePropertyString value)
            {
                _ImsServiceCode = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties</returns>
            public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties Build()
            {
                Validate();
                return new ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(
                    OauthConfigmanagerImsConfigid: _OauthConfigmanagerImsConfigid,
                    ImsOwningEntity: _ImsOwningEntity,
                    AemInstanceId: _AemInstanceId,
                    ImsServiceCode: _ImsServiceCode
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}