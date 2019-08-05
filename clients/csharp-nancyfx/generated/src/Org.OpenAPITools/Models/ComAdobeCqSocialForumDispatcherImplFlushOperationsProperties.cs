using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
    /// </summary>
    public sealed class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties:  IEquatable<ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties>
    { 
        /// <summary>
        /// ExtensionOrder
        /// </summary>
        public ConfigNodePropertyInteger ExtensionOrder { get; private set; }

        /// <summary>
        /// FlushForumontopic
        /// </summary>
        public ConfigNodePropertyBoolean FlushForumontopic { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties()
        {
        }

        private ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(ConfigNodePropertyInteger ExtensionOrder, ConfigNodePropertyBoolean FlushForumontopic)
        {
            
            this.ExtensionOrder = ExtensionOrder;
            
            this.FlushForumontopic = FlushForumontopic;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder</returns>
        public static ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder</returns>
        public ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder With()
        {
            return Builder()
                .ExtensionOrder(ExtensionOrder)
                .FlushForumontopic(FlushForumontopic);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties left, ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties left, ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ExtensionOrder;
            private ConfigNodePropertyBoolean _FlushForumontopic;

            internal ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.ExtensionOrder property.
            /// </summary>
            /// <param name="value">ExtensionOrder</param>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder ExtensionOrder(ConfigNodePropertyInteger value)
            {
                _ExtensionOrder = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.FlushForumontopic property.
            /// </summary>
            /// <param name="value">FlushForumontopic</param>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsPropertiesBuilder FlushForumontopic(ConfigNodePropertyBoolean value)
            {
                _FlushForumontopic = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties</returns>
            public ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties(
                    ExtensionOrder: _ExtensionOrder,
                    FlushForumontopic: _FlushForumontopic
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}