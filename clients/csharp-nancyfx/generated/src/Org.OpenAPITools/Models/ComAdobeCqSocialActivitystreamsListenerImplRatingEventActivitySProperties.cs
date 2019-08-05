using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties
    /// </summary>
    public sealed class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties:  IEquatable<ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties>
    { 
        /// <summary>
        /// Ranking
        /// </summary>
        public ConfigNodePropertyInteger Ranking { get; private set; }

        /// <summary>
        /// Enable
        /// </summary>
        public ConfigNodePropertyBoolean Enable { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties()
        {
        }

        private ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(ConfigNodePropertyInteger Ranking, ConfigNodePropertyBoolean Enable)
        {
            
            this.Ranking = Ranking;
            
            this.Enable = Enable;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder</returns>
        public static ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder</returns>
        public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder With()
        {
            return Builder()
                .Ranking(Ranking)
                .Enable(Enable);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties left, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties left, ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder
        {
            private ConfigNodePropertyInteger _Ranking;
            private ConfigNodePropertyBoolean _Enable;

            internal ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.Ranking property.
            /// </summary>
            /// <param name="value">Ranking</param>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder Ranking(ConfigNodePropertyInteger value)
            {
                _Ranking = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.Enable property.
            /// </summary>
            /// <param name="value">Enable</param>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySPropertiesBuilder Enable(ConfigNodePropertyBoolean value)
            {
                _Enable = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties</returns>
            public ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties(
                    Ranking: _Ranking,
                    Enable: _Enable
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}