using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWidgetImplWidgetExtensionProviderImplProperties
    /// </summary>
    public sealed class ComDayCqWidgetImplWidgetExtensionProviderImplProperties:  IEquatable<ComDayCqWidgetImplWidgetExtensionProviderImplProperties>
    { 
        /// <summary>
        /// ExtendableWidgets
        /// </summary>
        public ConfigNodePropertyArray ExtendableWidgets { get; private set; }

        /// <summary>
        /// WidgetextensionproviderDebug
        /// </summary>
        public ConfigNodePropertyBoolean WidgetextensionproviderDebug { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWidgetImplWidgetExtensionProviderImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWidgetImplWidgetExtensionProviderImplProperties()
        {
        }

        private ComDayCqWidgetImplWidgetExtensionProviderImplProperties(ConfigNodePropertyArray ExtendableWidgets, ConfigNodePropertyBoolean WidgetextensionproviderDebug)
        {
            
            this.ExtendableWidgets = ExtendableWidgets;
            
            this.WidgetextensionproviderDebug = WidgetextensionproviderDebug;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWidgetImplWidgetExtensionProviderImplProperties.
        /// </summary>
        /// <returns>ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder</returns>
        public static ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder Builder()
        {
            return new ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder</returns>
        public ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder With()
        {
            return Builder()
                .ExtendableWidgets(ExtendableWidgets)
                .WidgetextensionproviderDebug(WidgetextensionproviderDebug);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWidgetImplWidgetExtensionProviderImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWidgetImplWidgetExtensionProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWidgetImplWidgetExtensionProviderImplProperties left, ComDayCqWidgetImplWidgetExtensionProviderImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWidgetImplWidgetExtensionProviderImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplProperties</param>
        /// <param name="right">Compared (ComDayCqWidgetImplWidgetExtensionProviderImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWidgetImplWidgetExtensionProviderImplProperties left, ComDayCqWidgetImplWidgetExtensionProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWidgetImplWidgetExtensionProviderImplProperties.
        /// </summary>
        public sealed class ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder
        {
            private ConfigNodePropertyArray _ExtendableWidgets;
            private ConfigNodePropertyBoolean _WidgetextensionproviderDebug;

            internal ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplProperties.ExtendableWidgets property.
            /// </summary>
            /// <param name="value">ExtendableWidgets</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder ExtendableWidgets(ConfigNodePropertyArray value)
            {
                _ExtendableWidgets = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWidgetImplWidgetExtensionProviderImplProperties.WidgetextensionproviderDebug property.
            /// </summary>
            /// <param name="value">WidgetextensionproviderDebug</param>
            public ComDayCqWidgetImplWidgetExtensionProviderImplPropertiesBuilder WidgetextensionproviderDebug(ConfigNodePropertyBoolean value)
            {
                _WidgetextensionproviderDebug = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWidgetImplWidgetExtensionProviderImplProperties.
            /// </summary>
            /// <returns>ComDayCqWidgetImplWidgetExtensionProviderImplProperties</returns>
            public ComDayCqWidgetImplWidgetExtensionProviderImplProperties Build()
            {
                Validate();
                return new ComDayCqWidgetImplWidgetExtensionProviderImplProperties(
                    ExtendableWidgets: _ExtendableWidgets,
                    WidgetextensionproviderDebug: _WidgetextensionproviderDebug
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}