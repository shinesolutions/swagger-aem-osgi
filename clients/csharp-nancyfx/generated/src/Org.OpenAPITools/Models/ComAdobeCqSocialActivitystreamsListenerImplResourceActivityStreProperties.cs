using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties>
    { 
        /// <summary>
        /// StreamPath
        /// </summary>
        public ConfigNodePropertyString StreamPath { get; private set; }

        /// <summary>
        /// StreamName
        /// </summary>
        public ConfigNodePropertyString StreamName { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(ConfigNodePropertyString StreamPath, ConfigNodePropertyString StreamName)
        {
            
            this.StreamPath = StreamPath;
            
            this.StreamName = StreamName;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder With()
        {
            return Builder()
                .StreamPath(StreamPath)
                .StreamName(StreamName);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties left, ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties left, ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder
        {
            private ConfigNodePropertyString _StreamPath;
            private ConfigNodePropertyString _StreamName;

            internal ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.StreamPath property.
            /// </summary>
            /// <param name="value">StreamPath</param>
            public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder StreamPath(ConfigNodePropertyString value)
            {
                _StreamPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.StreamName property.
            /// </summary>
            /// <param name="value">StreamName</param>
            public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStrePropertiesBuilder StreamName(ConfigNodePropertyString value)
            {
                _StreamName = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplResourceActivityStreProperties(
                    StreamPath: _StreamPath,
                    StreamName: _StreamName
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}