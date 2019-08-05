using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties:  IEquatable<ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties>
    { 
        /// <summary>
        /// ParameterGuavaCacheEnabled
        /// </summary>
        public ConfigNodePropertyBoolean ParameterGuavaCacheEnabled { get; private set; }

        /// <summary>
        /// ParameterGuavaCacheParams
        /// </summary>
        public ConfigNodePropertyString ParameterGuavaCacheParams { get; private set; }

        /// <summary>
        /// ParameterGuavaCacheReload
        /// </summary>
        public ConfigNodePropertyBoolean ParameterGuavaCacheReload { get; private set; }

        /// <summary>
        /// ServiceRanking
        /// </summary>
        public ConfigNodePropertyInteger ServiceRanking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties()
        {
        }

        private ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(ConfigNodePropertyBoolean ParameterGuavaCacheEnabled, ConfigNodePropertyString ParameterGuavaCacheParams, ConfigNodePropertyBoolean ParameterGuavaCacheReload, ConfigNodePropertyInteger ServiceRanking)
        {
            
            this.ParameterGuavaCacheEnabled = ParameterGuavaCacheEnabled;
            
            this.ParameterGuavaCacheParams = ParameterGuavaCacheParams;
            
            this.ParameterGuavaCacheReload = ParameterGuavaCacheReload;
            
            this.ServiceRanking = ServiceRanking;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder</returns>
        public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder With()
        {
            return Builder()
                .ParameterGuavaCacheEnabled(ParameterGuavaCacheEnabled)
                .ParameterGuavaCacheParams(ParameterGuavaCacheParams)
                .ParameterGuavaCacheReload(ParameterGuavaCacheReload)
                .ServiceRanking(ServiceRanking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties left, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties left, ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ParameterGuavaCacheEnabled;
            private ConfigNodePropertyString _ParameterGuavaCacheParams;
            private ConfigNodePropertyBoolean _ParameterGuavaCacheReload;
            private ConfigNodePropertyInteger _ServiceRanking;

            internal ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.ParameterGuavaCacheEnabled property.
            /// </summary>
            /// <param name="value">ParameterGuavaCacheEnabled</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder ParameterGuavaCacheEnabled(ConfigNodePropertyBoolean value)
            {
                _ParameterGuavaCacheEnabled = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.ParameterGuavaCacheParams property.
            /// </summary>
            /// <param name="value">ParameterGuavaCacheParams</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder ParameterGuavaCacheParams(ConfigNodePropertyString value)
            {
                _ParameterGuavaCacheParams = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.ParameterGuavaCacheReload property.
            /// </summary>
            /// <param name="value">ParameterGuavaCacheReload</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder ParameterGuavaCacheReload(ConfigNodePropertyBoolean value)
            {
                _ParameterGuavaCacheReload = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.ServiceRanking property.
            /// </summary>
            /// <param name="value">ServiceRanking</param>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplPropertiesBuilder ServiceRanking(ConfigNodePropertyInteger value)
            {
                _ServiceRanking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties</returns>
            public ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialHandlebarsGuavaTemplateCacheImplProperties(
                    ParameterGuavaCacheEnabled: _ParameterGuavaCacheEnabled,
                    ParameterGuavaCacheParams: _ParameterGuavaCacheParams,
                    ParameterGuavaCacheReload: _ParameterGuavaCacheReload,
                    ServiceRanking: _ServiceRanking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}