using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties
    /// </summary>
    public sealed class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties:  IEquatable<ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties>
    { 
        /// <summary>
        /// EventFilter
        /// </summary>
        public ConfigNodePropertyString EventFilter { get; private set; }

        /// <summary>
        /// FontmgrSystemFontDir
        /// </summary>
        public ConfigNodePropertyArray FontmgrSystemFontDir { get; private set; }

        /// <summary>
        /// FontmgrAdobeFontDir
        /// </summary>
        public ConfigNodePropertyString FontmgrAdobeFontDir { get; private set; }

        /// <summary>
        /// FontmgrCustomerFontDir
        /// </summary>
        public ConfigNodePropertyString FontmgrCustomerFontDir { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties()
        {
        }

        private ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(ConfigNodePropertyString EventFilter, ConfigNodePropertyArray FontmgrSystemFontDir, ConfigNodePropertyString FontmgrAdobeFontDir, ConfigNodePropertyString FontmgrCustomerFontDir)
        {
            
            this.EventFilter = EventFilter;
            
            this.FontmgrSystemFontDir = FontmgrSystemFontDir;
            
            this.FontmgrAdobeFontDir = FontmgrAdobeFontDir;
            
            this.FontmgrCustomerFontDir = FontmgrCustomerFontDir;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder</returns>
        public static ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder Builder()
        {
            return new ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder</returns>
        public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder With()
        {
            return Builder()
                .EventFilter(EventFilter)
                .FontmgrSystemFontDir(FontmgrSystemFontDir)
                .FontmgrAdobeFontDir(FontmgrAdobeFontDir)
                .FontmgrCustomerFontDir(FontmgrCustomerFontDir);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties left, ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties</param>
        /// <param name="right">Compared (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties left, ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.
        /// </summary>
        public sealed class ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder
        {
            private ConfigNodePropertyString _EventFilter;
            private ConfigNodePropertyArray _FontmgrSystemFontDir;
            private ConfigNodePropertyString _FontmgrAdobeFontDir;
            private ConfigNodePropertyString _FontmgrCustomerFontDir;

            internal ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.EventFilter property.
            /// </summary>
            /// <param name="value">EventFilter</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder EventFilter(ConfigNodePropertyString value)
            {
                _EventFilter = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.FontmgrSystemFontDir property.
            /// </summary>
            /// <param name="value">FontmgrSystemFontDir</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder FontmgrSystemFontDir(ConfigNodePropertyArray value)
            {
                _FontmgrSystemFontDir = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.FontmgrAdobeFontDir property.
            /// </summary>
            /// <param name="value">FontmgrAdobeFontDir</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder FontmgrAdobeFontDir(ConfigNodePropertyString value)
            {
                _FontmgrAdobeFontDir = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.FontmgrCustomerFontDir property.
            /// </summary>
            /// <param name="value">FontmgrCustomerFontDir</param>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplPropertiesBuilder FontmgrCustomerFontDir(ConfigNodePropertyString value)
            {
                _FontmgrCustomerFontDir = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.
            /// </summary>
            /// <returns>ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties</returns>
            public ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties Build()
            {
                Validate();
                return new ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties(
                    EventFilter: _EventFilter,
                    FontmgrSystemFontDir: _FontmgrSystemFontDir,
                    FontmgrAdobeFontDir: _FontmgrAdobeFontDir,
                    FontmgrCustomerFontDir: _FontmgrCustomerFontDir
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}