using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties
    /// </summary>
    public sealed class OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties:  IEquatable<OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties>
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
        /// Use OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties()
        {
        }

        private OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties(ConfigNodePropertyString OsgiHttpWhiteboardServletPattern, ConfigNodePropertyString OsgiHttpWhiteboardContextSelect)
        {
            
            this.OsgiHttpWhiteboardServletPattern = OsgiHttpWhiteboardServletPattern;
            
            this.OsgiHttpWhiteboardContextSelect = OsgiHttpWhiteboardContextSelect;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder</returns>
        public static OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder Builder()
        {
            return new OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder</returns>
        public OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder With()
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

        public bool Equals(OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties left, OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties</param>
        /// <param name="right">Compared (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties left, OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.
        /// </summary>
        public sealed class OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder
        {
            private ConfigNodePropertyString _OsgiHttpWhiteboardServletPattern;
            private ConfigNodePropertyString _OsgiHttpWhiteboardContextSelect;

            internal OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.OsgiHttpWhiteboardServletPattern property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardServletPattern</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder OsgiHttpWhiteboardServletPattern(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardServletPattern = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.OsgiHttpWhiteboardContextSelect property.
            /// </summary>
            /// <param name="value">OsgiHttpWhiteboardContextSelect</param>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletPropertiesBuilder OsgiHttpWhiteboardContextSelect(ConfigNodePropertyString value)
            {
                _OsgiHttpWhiteboardContextSelect = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties.
            /// </summary>
            /// <returns>OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties</returns>
            public OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties Build()
            {
                Validate();
                return new OrgApacheFelixSystemreadyImplServletSystemAliveServletProperties(
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