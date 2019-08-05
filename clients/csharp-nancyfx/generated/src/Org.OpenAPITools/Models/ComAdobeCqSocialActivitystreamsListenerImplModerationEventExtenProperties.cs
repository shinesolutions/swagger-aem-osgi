using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties>
    { 
        /// <summary>
        /// Accepted
        /// </summary>
        public ConfigNodePropertyBoolean Accepted { get; private set; }

        /// <summary>
        /// Ranked
        /// </summary>
        public ConfigNodePropertyInteger Ranked { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(ConfigNodePropertyBoolean Accepted, ConfigNodePropertyInteger Ranked)
        {
            
            this.Accepted = Accepted;
            
            this.Ranked = Ranked;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder With()
        {
            return Builder()
                .Accepted(Accepted)
                .Ranked(Ranked);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties left, ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties left, ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _Accepted;
            private ConfigNodePropertyInteger _Ranked;

            internal ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.Accepted property.
            /// </summary>
            /// <param name="value">Accepted</param>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder Accepted(ConfigNodePropertyBoolean value)
            {
                _Accepted = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.Ranked property.
            /// </summary>
            /// <param name="value">Ranked</param>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenPropertiesBuilder Ranked(ConfigNodePropertyInteger value)
            {
                _Ranked = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplModerationEventExtenProperties(
                    Accepted: _Accepted,
                    Ranked: _Ranked
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}