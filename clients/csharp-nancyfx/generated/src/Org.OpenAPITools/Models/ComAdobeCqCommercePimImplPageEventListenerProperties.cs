using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqCommercePimImplPageEventListenerProperties
    /// </summary>
    public sealed class ComAdobeCqCommercePimImplPageEventListenerProperties:  IEquatable<ComAdobeCqCommercePimImplPageEventListenerProperties>
    { 
        /// <summary>
        /// CqCommercePageeventlistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqCommercePageeventlistenerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqCommercePimImplPageEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqCommercePimImplPageEventListenerProperties()
        {
        }

        private ComAdobeCqCommercePimImplPageEventListenerProperties(ConfigNodePropertyBoolean CqCommercePageeventlistenerEnabled)
        {
            
            this.CqCommercePageeventlistenerEnabled = CqCommercePageeventlistenerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqCommercePimImplPageEventListenerProperties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder</returns>
        public static ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder Builder()
        {
            return new ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder</returns>
        public ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder With()
        {
            return Builder()
                .CqCommercePageeventlistenerEnabled(CqCommercePageeventlistenerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqCommercePimImplPageEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqCommercePimImplPageEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplPageEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplPageEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqCommercePimImplPageEventListenerProperties left, ComAdobeCqCommercePimImplPageEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqCommercePimImplPageEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqCommercePimImplPageEventListenerProperties</param>
        /// <param name="right">Compared (ComAdobeCqCommercePimImplPageEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqCommercePimImplPageEventListenerProperties left, ComAdobeCqCommercePimImplPageEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqCommercePimImplPageEventListenerProperties.
        /// </summary>
        public sealed class ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqCommercePageeventlistenerEnabled;

            internal ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqCommercePimImplPageEventListenerProperties.CqCommercePageeventlistenerEnabled property.
            /// </summary>
            /// <param name="value">CqCommercePageeventlistenerEnabled</param>
            public ComAdobeCqCommercePimImplPageEventListenerPropertiesBuilder CqCommercePageeventlistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqCommercePageeventlistenerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqCommercePimImplPageEventListenerProperties.
            /// </summary>
            /// <returns>ComAdobeCqCommercePimImplPageEventListenerProperties</returns>
            public ComAdobeCqCommercePimImplPageEventListenerProperties Build()
            {
                Validate();
                return new ComAdobeCqCommercePimImplPageEventListenerProperties(
                    CqCommercePageeventlistenerEnabled: _CqCommercePageeventlistenerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}