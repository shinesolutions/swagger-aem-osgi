using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties:  IEquatable<ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties>
    { 
        /// <summary>
        /// CqDamScene7ConfigurationeventlistenerEnabled
        /// </summary>
        public ConfigNodePropertyBoolean CqDamScene7ConfigurationeventlistenerEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties()
        {
        }

        private ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(ConfigNodePropertyBoolean CqDamScene7ConfigurationeventlistenerEnabled)
        {
            
            this.CqDamScene7ConfigurationeventlistenerEnabled = CqDamScene7ConfigurationeventlistenerEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder</returns>
        public static ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder</returns>
        public ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder With()
        {
            return Builder()
                .CqDamScene7ConfigurationeventlistenerEnabled(CqDamScene7ConfigurationeventlistenerEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties left, ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties left, ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _CqDamScene7ConfigurationeventlistenerEnabled;

            internal ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.CqDamScene7ConfigurationeventlistenerEnabled property.
            /// </summary>
            /// <param name="value">CqDamScene7ConfigurationeventlistenerEnabled</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerPropertiesBuilder CqDamScene7ConfigurationeventlistenerEnabled(ConfigNodePropertyBoolean value)
            {
                _CqDamScene7ConfigurationeventlistenerEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties</returns>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties(
                    CqDamScene7ConfigurationeventlistenerEnabled: _CqDamScene7ConfigurationeventlistenerEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}