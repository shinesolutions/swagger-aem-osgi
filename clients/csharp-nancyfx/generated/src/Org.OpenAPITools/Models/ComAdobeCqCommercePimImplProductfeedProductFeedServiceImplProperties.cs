using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties
    /// </summary>
    public sealed class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties:  IEquatable<ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties>
    { 
        /// <summary>
        /// FeedGeneratorAlgorithm
        /// </summary>
        public ConfigNodePropertyDropDown FeedGeneratorAlgorithm { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties()
        {
        }

        private ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(ConfigNodePropertyDropDown FeedGeneratorAlgorithm)
        {
            
            this.FeedGeneratorAlgorithm = FeedGeneratorAlgorithm;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder</returns>
        public static ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder</returns>
        public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder With()
        {
            return Builder()
                .FeedGeneratorAlgorithm(FeedGeneratorAlgorithm);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties left, ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties left, ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.
        /// </summary>
        public sealed class ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _FeedGeneratorAlgorithm;

            internal ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.FeedGeneratorAlgorithm property.
            /// </summary>
            /// <param name="value">FeedGeneratorAlgorithm</param>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplPropertiesBuilder FeedGeneratorAlgorithm(ConfigNodePropertyDropDown value)
            {
                _FeedGeneratorAlgorithm = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties</returns>
            public ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties Build()
            {
                Validate();
                return new ComAdobeCqCommercePimImplProductfeedProductFeedServiceImplProperties(
                    FeedGeneratorAlgorithm: _FeedGeneratorAlgorithm
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}