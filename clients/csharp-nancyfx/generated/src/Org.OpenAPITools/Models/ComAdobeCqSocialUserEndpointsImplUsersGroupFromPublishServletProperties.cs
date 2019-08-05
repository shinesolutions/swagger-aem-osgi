using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties
    /// </summary>
    public sealed class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties:  IEquatable<ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties>
    { 
        /// <summary>
        /// SlingServletExtensions
        /// </summary>
        public ConfigNodePropertyString SlingServletExtensions { get; private set; }

        /// <summary>
        /// SlingServletPaths
        /// </summary>
        public ConfigNodePropertyString SlingServletPaths { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyString SlingServletMethods { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties()
        {
        }

        private ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(ConfigNodePropertyString SlingServletExtensions, ConfigNodePropertyString SlingServletPaths, ConfigNodePropertyString SlingServletMethods)
        {
            
            this.SlingServletExtensions = SlingServletExtensions;
            
            this.SlingServletPaths = SlingServletPaths;
            
            this.SlingServletMethods = SlingServletMethods;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder</returns>
        public static ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder</returns>
        public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletExtensions(SlingServletExtensions)
                .SlingServletPaths(SlingServletPaths)
                .SlingServletMethods(SlingServletMethods);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties left, ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties left, ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletExtensions;
            private ConfigNodePropertyString _SlingServletPaths;
            private ConfigNodePropertyString _SlingServletMethods;

            internal ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.SlingServletExtensions property.
            /// </summary>
            /// <param name="value">SlingServletExtensions</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder SlingServletExtensions(ConfigNodePropertyString value)
            {
                _SlingServletExtensions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.SlingServletPaths property.
            /// </summary>
            /// <param name="value">SlingServletPaths</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder SlingServletPaths(ConfigNodePropertyString value)
            {
                _SlingServletPaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyString value)
            {
                _SlingServletMethods = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties</returns>
            public ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties(
                    SlingServletExtensions: _SlingServletExtensions,
                    SlingServletPaths: _SlingServletPaths,
                    SlingServletMethods: _SlingServletMethods
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}