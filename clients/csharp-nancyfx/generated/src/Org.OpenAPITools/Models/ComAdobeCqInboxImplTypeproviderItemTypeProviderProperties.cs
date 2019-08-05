using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties
    /// </summary>
    public sealed class ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties:  IEquatable<ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties>
    { 
        /// <summary>
        /// InboxImplTypeproviderRegistrypaths
        /// </summary>
        public ConfigNodePropertyArray InboxImplTypeproviderRegistrypaths { get; private set; }

        /// <summary>
        /// InboxImplTypeproviderLegacypaths
        /// </summary>
        public ConfigNodePropertyArray InboxImplTypeproviderLegacypaths { get; private set; }

        /// <summary>
        /// InboxImplTypeproviderDefaulturlFailureitem
        /// </summary>
        public ConfigNodePropertyString InboxImplTypeproviderDefaulturlFailureitem { get; private set; }

        /// <summary>
        /// InboxImplTypeproviderDefaulturlWorkitem
        /// </summary>
        public ConfigNodePropertyString InboxImplTypeproviderDefaulturlWorkitem { get; private set; }

        /// <summary>
        /// InboxImplTypeproviderDefaulturlTask
        /// </summary>
        public ConfigNodePropertyString InboxImplTypeproviderDefaulturlTask { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties()
        {
        }

        private ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(ConfigNodePropertyArray InboxImplTypeproviderRegistrypaths, ConfigNodePropertyArray InboxImplTypeproviderLegacypaths, ConfigNodePropertyString InboxImplTypeproviderDefaulturlFailureitem, ConfigNodePropertyString InboxImplTypeproviderDefaulturlWorkitem, ConfigNodePropertyString InboxImplTypeproviderDefaulturlTask)
        {
            
            this.InboxImplTypeproviderRegistrypaths = InboxImplTypeproviderRegistrypaths;
            
            this.InboxImplTypeproviderLegacypaths = InboxImplTypeproviderLegacypaths;
            
            this.InboxImplTypeproviderDefaulturlFailureitem = InboxImplTypeproviderDefaulturlFailureitem;
            
            this.InboxImplTypeproviderDefaulturlWorkitem = InboxImplTypeproviderDefaulturlWorkitem;
            
            this.InboxImplTypeproviderDefaulturlTask = InboxImplTypeproviderDefaulturlTask;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
        /// </summary>
        /// <returns>ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder</returns>
        public static ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder Builder()
        {
            return new ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder</returns>
        public ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder With()
        {
            return Builder()
                .InboxImplTypeproviderRegistrypaths(InboxImplTypeproviderRegistrypaths)
                .InboxImplTypeproviderLegacypaths(InboxImplTypeproviderLegacypaths)
                .InboxImplTypeproviderDefaulturlFailureitem(InboxImplTypeproviderDefaulturlFailureitem)
                .InboxImplTypeproviderDefaulturlWorkitem(InboxImplTypeproviderDefaulturlWorkitem)
                .InboxImplTypeproviderDefaulturlTask(InboxImplTypeproviderDefaulturlTask);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties left, ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties</param>
        /// <param name="right">Compared (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties left, ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
        /// </summary>
        public sealed class ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder
        {
            private ConfigNodePropertyArray _InboxImplTypeproviderRegistrypaths;
            private ConfigNodePropertyArray _InboxImplTypeproviderLegacypaths;
            private ConfigNodePropertyString _InboxImplTypeproviderDefaulturlFailureitem;
            private ConfigNodePropertyString _InboxImplTypeproviderDefaulturlWorkitem;
            private ConfigNodePropertyString _InboxImplTypeproviderDefaulturlTask;

            internal ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.InboxImplTypeproviderRegistrypaths property.
            /// </summary>
            /// <param name="value">InboxImplTypeproviderRegistrypaths</param>
            public ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder InboxImplTypeproviderRegistrypaths(ConfigNodePropertyArray value)
            {
                _InboxImplTypeproviderRegistrypaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.InboxImplTypeproviderLegacypaths property.
            /// </summary>
            /// <param name="value">InboxImplTypeproviderLegacypaths</param>
            public ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder InboxImplTypeproviderLegacypaths(ConfigNodePropertyArray value)
            {
                _InboxImplTypeproviderLegacypaths = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.InboxImplTypeproviderDefaulturlFailureitem property.
            /// </summary>
            /// <param name="value">InboxImplTypeproviderDefaulturlFailureitem</param>
            public ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder InboxImplTypeproviderDefaulturlFailureitem(ConfigNodePropertyString value)
            {
                _InboxImplTypeproviderDefaulturlFailureitem = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.InboxImplTypeproviderDefaulturlWorkitem property.
            /// </summary>
            /// <param name="value">InboxImplTypeproviderDefaulturlWorkitem</param>
            public ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder InboxImplTypeproviderDefaulturlWorkitem(ConfigNodePropertyString value)
            {
                _InboxImplTypeproviderDefaulturlWorkitem = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.InboxImplTypeproviderDefaulturlTask property.
            /// </summary>
            /// <param name="value">InboxImplTypeproviderDefaulturlTask</param>
            public ComAdobeCqInboxImplTypeproviderItemTypeProviderPropertiesBuilder InboxImplTypeproviderDefaulturlTask(ConfigNodePropertyString value)
            {
                _InboxImplTypeproviderDefaulturlTask = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.
            /// </summary>
            /// <returns>ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties</returns>
            public ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties Build()
            {
                Validate();
                return new ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties(
                    InboxImplTypeproviderRegistrypaths: _InboxImplTypeproviderRegistrypaths,
                    InboxImplTypeproviderLegacypaths: _InboxImplTypeproviderLegacypaths,
                    InboxImplTypeproviderDefaulturlFailureitem: _InboxImplTypeproviderDefaulturlFailureitem,
                    InboxImplTypeproviderDefaulturlWorkitem: _InboxImplTypeproviderDefaulturlWorkitem,
                    InboxImplTypeproviderDefaulturlTask: _InboxImplTypeproviderDefaulturlTask
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}