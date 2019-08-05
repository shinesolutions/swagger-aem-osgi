using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties:  IEquatable<OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties>
    { 
        /// <summary>
        /// OsgiHttpWhiteboardServletPattern
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardServletPattern { get; private set; }

        /// <summary>
        /// OsgiHttpWhiteboardContextSelect
        /// </summary>
        public ConfigNodePropertyString OsgiHttpWhiteboardContextSelect { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties()
        {
        }

        private OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(ConfigNodePropertyString OsgiHttpWhiteboardServletPattern, ConfigNodePropertyString OsgiHttpWhiteboardContextSelect)
        {
            
            this.OsgiHttpWhiteboardServletPattern = OsgiHttpWhiteboardServletPattern;
            
            this.OsgiHttpWhiteboardContextSelect = OsgiHttpWhiteboardContextSelect;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder</returns>
        public static OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder</returns>
        public OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder With()
        {
            return Builder()
                .OsgiHttpWhiteboardServletPattern(OsgiHttpWhiteboardServletPattern)
                .OsgiHttpWhiteboardContextSelect(OsgiHttpWhiteboardContextSelect);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties left, OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties left, OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder
        {
            private ConfigNodePropertyString _OsgiHttpWhiteboardServletPattern;
            private ConfigNodePropertyString _OsgiHttpWhiteboardContextSelect;

            internal OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.OsgiHttpWhiteboardServletPattern property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardServletPattern</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder OsgiHttpWhiteboardServletPattern(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardServletPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.OsgiHttpWhiteboardContextSelect property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardContextSelect</param>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletPropertiesBuilder OsgiHttpWhiteboardContextSelect(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardContextSelect = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties</returns>
            public OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplServletSystemReadyServletProperties(
                    OsgiHttpWhiteboardServletPattern: _OsgiHttpWhiteboardServletPattern,
                    OsgiHttpWhiteboardContextSelect: _OsgiHttpWhiteboardContextSelect
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}