using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
    /// </summary>
    public sealed class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties:  IEquatable<ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties>
    { 
        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyString SlingServletSelectors { get; private set; }

        /// <summary>
        /// SlingServletExtensions
        /// </summary>
        public ConfigNodePropertyString SlingServletExtensions { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties()
        {
        }

        private ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties(ConfigNodePropertyString SlingServletSelectors, ConfigNodePropertyString SlingServletExtensions)
        {
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.SlingServletExtensions = SlingServletExtensions;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder</returns>
        public static ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder</returns>
        public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletSelectors(SlingServletSelectors)
                .SlingServletExtensions(SlingServletExtensions);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties left, ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties left, ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletSelectors;
            private ConfigNodePropertyString _SlingServletExtensions;

            internal ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyString value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.SlingServletExtensions property.
            /// </summary>
            /// <param name="value">SlingServletExtensions</param>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletPropertiesBuilder SlingServletExtensions(ConfigNodePropertyString value)
            {
                _SlingServletExtensions = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties</returns>
            public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties(
                    SlingServletSelectors: _SlingServletSelectors,
                    SlingServletExtensions: _SlingServletExtensions
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}