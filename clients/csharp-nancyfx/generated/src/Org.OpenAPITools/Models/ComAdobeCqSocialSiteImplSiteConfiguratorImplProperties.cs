using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties
    /// </summary>
    public sealed class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties:  IEquatable<ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties>
    { 
        /// <summary>
        /// ComponentsUsingTags
        /// </summary>
        public ConfigNodePropertyArray ComponentsUsingTags { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties()
        {
        }

        private ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(ConfigNodePropertyArray ComponentsUsingTags)
        {
            
            this.ComponentsUsingTags = ComponentsUsingTags;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder</returns>
        public static ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder</returns>
        public ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder With()
        {
            return Builder()
                .ComponentsUsingTags(ComponentsUsingTags);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties left, ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties left, ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ComponentsUsingTags;

            internal ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.ComponentsUsingTags property.
            /// </summary>
            /// <param name="value">ComponentsUsingTags</param>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplPropertiesBuilder ComponentsUsingTags(ConfigNodePropertyArray value)
            {
                _ComponentsUsingTags = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties</returns>
            public ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties(
                    ComponentsUsingTags: _ComponentsUsingTags
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}